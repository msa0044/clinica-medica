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
public class DAOConsulta {
    /*Classe referente ao "CRUD" de Consulta na Base de Dados*/
    
    public static void salvar(Consulta obj) {
        String sql = "insert into Consulta (medicacao, nomec, diac, mesc, anoc, horac, minutosc, nomep,"
                + " cpfp, idadep, cidadep, bairrop, ruap, numerodacasap, telefonep, nomem, telefonem, cpfm) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getMedicacao());
            pst.setString(2, obj.getNomec());
            pst.setInt(3, obj.getDiac());
            pst.setInt(4, obj.getMesc());
            pst.setInt(5, obj.getAnoc());
            pst.setInt(6, obj.getHorac());
            pst.setInt(7, obj.getMinutosc());
            
            pst.setString(8, obj.getNomep());
            pst.setString(9, obj.getCPFp());
            pst.setInt(10, obj.getIdadep());
            pst.setString(11, obj.getCidadep());
            pst.setString(12, obj.getBairrop());
            pst.setString(13, obj.getRuap());
            pst.setInt(14, obj.getNumeroDaCasap());
            pst.setString(15, obj.getTelefonep());
            pst.setString(16, obj.getNomem());
            pst.setString(17, obj.getTelefonem());
            pst.setString(18, obj.getCPFm());
            
            
            if(pst.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Consulta adicionado(a) com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao adicionar o(a) Consulta!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }

}
