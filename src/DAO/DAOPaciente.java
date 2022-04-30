/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Dados.*;
import Modelo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author msa04
 */
public class DAOPaciente {

    /*Classe referente ao "CRUD" de paciente na Base de Dados*/
    public static ArrayList<Paciente> getLista() {
        
        String sql = "select * from paciente;";
        
        ArrayList<Paciente> lista = new ArrayList();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Paciente obj = new Paciente();
                obj.setIdPaciente(rs.getInt("idpaciente"));
                obj.setIdade(rs.getInt("idade"));
                obj.setNome(rs.getString("nome"));
                obj.setCPF(rs.getString("CPF"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setRua(rs.getString("rua"));
                obj.setNumeroDaCasa(rs.getInt("numerodacasa"));
                obj.setTelefone(rs.getString("telefone"));
                
                lista.add(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar a lista de Pacientes");
        }
        return lista;
    }
    public static Paciente getEspecifico(int id){
        for(int i = 0; i <= Dados.ListaDePacientes.size(); i++){
            if(Dados.ListaDePacientes.get(i).getIdPaciente() == id){
                return Dados.ListaDePacientes.get(i);
            }
        }
        return null;
    }

    public static void salvar(Paciente obj) {
        String sql = "insert into paciente (nome, cpf, idade, cidade, bairro, rua, numerodacasa, telefone) values (?,?,?,?,?,?,?,?);";
        
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getCPF());
            pst.setInt(3, obj.getIdade());
            pst.setString(4, obj.getCidade());
            pst.setString(5, obj.getBairro());
            pst.setString(6, obj.getRua());
            pst.setInt(7, obj.getNumeroDaCasa());
            pst.setString(8, obj.getTelefone());
            
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Paciente adicionado(a) com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao adicionar o(a) Paciente!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }

    public static void editar(Paciente obj) {
        String sql = "update paciente set nome = ?, cpf = ?, idade = ?, cidade = ?, bairro = ?, rua = ?, "
                + "numerodacasa = ?, telefone = ? where paciente.idpaciente = ?;";
        
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNome());
            pst.setString(2, obj.getCPF());
            pst.setInt(3, obj.getIdade());
            pst.setString(4, obj.getCidade());
            pst.setString(5, obj.getBairro());
            pst.setString(6, obj.getRua());
            pst.setInt(7, obj.getNumeroDaCasa());
            pst.setString(8, obj.getTelefone());
            pst.setInt(9, obj.getIdPaciente());
            
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Paciente editado(a) com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao editar o(a) Paciente!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }

    public static void remover(Paciente obj) {
        String sql = "delete from paciente where idpaciente = ?;";
        
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdPaciente());
            
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Paciente excluido(a) com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao excluir o(a) Paciente!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }
}
