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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author msa04
 */
public class DAOConsultasAgendadas {

    /*Classe referente ao "CRUD" de ConsultasAgendadas na Base de Dados*/
   public static ArrayList<ConsultasAgendadas> getLista() {
        
        String sql = "select * from ConsultaAgendada";
        
        ArrayList<ConsultasAgendadas> lista = new ArrayList();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                ConsultasAgendadas obj = new ConsultasAgendadas();
                obj.setIdConsultaAgendada(rs.getInt("idConsultaAgendada"));
                obj.setNomeConsulta(rs.getString("nomeconsulta"));
                obj.setDiaConsulta(rs.getInt("Diaconsulta"));
                obj.setMesConsulta(rs.getInt("Mesconsulta"));
                obj.setAnoConsulta(rs.getInt("Anoconsulta"));
                obj.setHoraConsulta(rs.getInt("horaconsulta"));
                obj.setMinutosConsulta(rs.getInt("minutosconsulta"));
                obj.setMilissegundos(rs.getLong("milissegundos"));
                Paciente p = DAOPaciente.getEspecifico(rs.getInt("idpaciente"));
                Medico m = DAOMedico.getEspecifico(rs.getInt("idmedico"));
                obj.setPacienteAcompanhado(p);
                obj.setMedicoResponsavel(m);
                
                
                lista.add(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar a lista de Consultas Agendadas");
        }
        return lista;
    }
    public static ConsultasAgendadas getEspecifico(int id){
        for(int i = 0; i <= Dados.ListaDeConsultasAgendadas.size(); i++){
            if(Dados.ListaDeConsultasAgendadas.get(i).getIdConsultaAgendada()== id){
                return Dados.ListaDeConsultasAgendadas.get(i);
            }
        }
        return null;
    }
    public static void salvar(ConsultasAgendadas obj) {
        String sql = "insert into ConsultaAgendada (nomeConsulta, diaconsulta, mesconsulta, anoconsulta, horaconsulta, minutosconsulta, milissegundos, idmedico, idpaciente) values (?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeConsulta());
            pst.setInt(2, obj.getDiaConsulta());
            pst.setInt(3, obj.getMesConsulta());
            pst.setInt(4, obj.getAnoConsulta());
            pst.setInt(5, obj.getHoraConsulta());
            pst.setInt(6, obj.getMinutosConsulta());
            pst.setLong(7, obj.getMilissegundos());
            pst.setInt(8, obj.getMedicoResponsavel().getIdMedico());
            pst.setInt(9, obj.getPacienteAcompanhado().getIdPaciente());
            
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Consulta Agendada adicionado(a) com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao adicionar o(a) Consulta Agendada!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }

    public static void editar(ConsultasAgendadas obj) {
        String sql = "update ConsultaAgendada set nomeconsulta = ?,diaconsulta = ?, mesconsulta = ?, anoconsulta = ?, "
                + "horaconsulta = ?, minutosconsulta = ?, milissegundos = ?, idmedico = ?, idpaciente = ? where consultaagendada.idConsultaAgendada = ?";
        
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeConsulta());
            pst.setInt(2, obj.getDiaConsulta());
            pst.setInt(3, obj.getMesConsulta());
            pst.setInt(4, obj.getAnoConsulta());
            pst.setInt(5, obj.getHoraConsulta());
            pst.setInt(6, obj.getMinutosConsulta());
            pst.setLong(7, obj.getMilissegundos());
            pst.setInt(8, obj.getMedicoResponsavel().getIdMedico());
            pst.setInt(9, obj.getPacienteAcompanhado().getIdPaciente());
            pst.setInt(10, obj.getIdConsultaAgendada());
            
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Consulta Agendada editado(a) com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao editar o(a) Consulta Agendada!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }

    public static void remover(ConsultasAgendadas obj) {
        String sql = "delete from ConsultaAgendada where idConsultaAgendada = ?;";
        
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdConsultaAgendada());
            
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Consulta Agendada excluido(a) com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao excluir o(a) Consulta Agendada!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }

    public static void ordenar() {
        long[] cc = new long[Dados.getListaDeConsultasAgendadas().size()];
        for (int o = 0; o <= Dados.getListaDeConsultasAgendadas().size() - 1; o++) {
            cc[o] = Dados.getListaDeConsultasAgendadas().get(o).getMilissegundos();
        }
        Arrays.sort(cc);
        ArrayList<ConsultasAgendadas> newList = new ArrayList();
        for(int o = 0; o <= Dados.getListaDeConsultasAgendadas().size() - 1; o++){
            for(int i = 0; i <= Dados.getListaDeConsultasAgendadas().size() - 1; i++){
                if(cc[o] ==  Dados.getListaDeConsultasAgendadas().get(i).getMilissegundos()){
                    newList.add(Dados.getListaDeConsultasAgendadas().get(i));
                }
            }
        }
        Dados.setListaDeConsultasAgendadas(newList);
        
    }
}
