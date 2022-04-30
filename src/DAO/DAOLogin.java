/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Modelo.Login;
import Dados.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author msa04
 */
public class DAOLogin {

    public static ArrayList<Login> getLista() {

        String sql = "select * from Login";

        ArrayList<Login> lista = new ArrayList();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Login obj = new Login();
                obj.setIdLogin(rs.getInt("idLogin"));
                obj.setLogin(rs.getString("Login"));
                obj.setSenha(rs.getString("senha"));

                lista.add(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar a lista de Logins");
        }
        return lista;
    }

    public static Login getEspecifico(int id) {
        for (int i = 0; i <= Dados.ListaDeLogins.size(); i++) {
            if (Dados.ListaDeLogins.get(i).getIdLogin() == id) {
                return Dados.ListaDeLogins.get(i);
            }
        }
        return null;
    }

    public static void salvar(Login obj) {
        String sql = "insert into Login (login, senha) values (?,?)";

        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getLogin());
            pst.setString(2, obj.getSenha());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Login adicionado(a) com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao adicionar o(a) Login!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }

    public static void editar(Login obj) {
        String sql = "update Login set login = ?, senha = ? where Login.idLogin = ?";

        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getLogin());
            pst.setString(2, obj.getSenha());
            pst.setInt(3, obj.getIdLogin());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Login editado(a) com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao editar o(a) Login!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }

    public static void remover(Login obj) {
        String sql = "delete from Login where idLogin = ?";

        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdLogin());

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Login excluido(a) com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao excluir o(a) Login!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        Dados.pegarDados();
    }
}
