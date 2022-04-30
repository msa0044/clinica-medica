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
import javax.swing.JOptionPane;

/**
 *
 * @author msa04
 */
public class DAOMedico {

    /*Classe referente ao "CRUD" de Medico na Base de Dados*/
    public static ArrayList<Medico> getLista() {
        
        String sql = "select * from Medico";
        
        ArrayList<Medico> lista = new ArrayList();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Medico obj = new Medico();
                obj.setIdMedico(rs.getInt("idMedico"));
                Login login = DAOLogin.getEspecifico(rs.getInt("idlogin"));
                obj.setLogin(login);
                obj.setNome(rs.getString("nome"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCPF(rs.getString("cpf"));
                
                lista.add(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar a lista de Medicos");
        }
        return lista;
    }
    public static Medico getEspecifico(int id){
        for(int i = 0; i <= Dados.ListaDeMedicos.size(); i++){
            if(Dados.ListaDeMedicos.get(i).getIdMedico() == id){
                return Dados.ListaDeMedicos.get(i);
            }
        }
        return null;
    }
    public static void salvar(Medico obj) {
        String sql = "insert into Medico (idlogin, nome, telefone, cpf) values (?,?,?,?);";
        
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getLogin().getIdLogin());
            pst.setString(2, obj.getNome());
            pst.setString(3, obj.getTelefone());
            pst.setString(4, obj.getCPF());
            
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Medico adicionado(a) com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao adicionar o(a) Medico!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }

    public static void editar(Medico obj) {
        String sql = "update Medico set idlogin = ?, nome = ?, telefone = ?, cpf = ? where medico.idMedico = ?;";
        
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getLogin().getIdLogin());
            pst.setString(2, obj.getNome());
            pst.setString(3, obj.getTelefone());
            pst.setString(4, obj.getCPF());
            pst.setInt(5, obj.getIdMedico());
            
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Medico editado(a) com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao editar o(a) Medico!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }

    public static void remover(Medico obj) {
        String sql = "delete from Medico where idMedico = ?";
        
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdMedico());
            
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Medico excluido(a) com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao excluir o(a) Medico!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }
}
