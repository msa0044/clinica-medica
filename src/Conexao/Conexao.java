package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author msa04
 */
public class Conexao {

	private static final String BANCO = "jdbc:mysql://localhost:3306/clinicamedica";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	private static Connection con = null;

	public Conexao() {

	}

	public static Connection getConexao() {
		if (con == null) {
			try {
				Class.forName(DRIVER);
				con = DriverManager.getConnection(BANCO, USUARIO, SENHA);
			} catch (ClassNotFoundException ex) {
				System.out.println("N„o encontrou o Driver");
			} catch (SQLException ex) {
				JOptionPane.showMessageDialog(null, "N„o foi possÌvel promover a conex„o com a base de dados",
						"Erro", JOptionPane.ERROR_MESSAGE);

			}
		}
		return con;
	}

	public static PreparedStatement getPreparedStatement(String sql) {
		if (con == null) {
			con = getConexao();
		}
		try {
			return con.prepareStatement(sql);
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "N√£o foi poss√≠vel promover a conex√£o com a base de dados", "Erro",
					JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}

}
