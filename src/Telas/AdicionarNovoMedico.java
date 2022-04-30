/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Conexao.Conexao;
import Modelo.*;
import Impressao.*;
import Dados.*;
import DAO.*;
import java.awt.Color;
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
public class AdicionarNovoMedico extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarNovoMedico
     */
    public static int edit = 0, remove = 0;

    public AdicionarNovoMedico() {
        edit = 0;
        remove = 0;
        Dados.pegarDados();
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jt1 = new javax.swing.JTextField();
        jt2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jt3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtSenha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de cadastro de médico");

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Adicionar/Editar Médico");

        jCheckBox2.setBackground(new java.awt.Color(234, 234, 234));
        jCheckBox2.setText("Editar");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(234, 234, 234));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton2.setBackground(new java.awt.Color(234, 234, 234));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Midia/Inicio.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt1KeyTyped(evt);
            }
        });

        jt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt2KeyTyped(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Telefone:");

        jt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt3KeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Dados principais:   ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Login e senha:");

        jLabel5.setText("Login:");

        jtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtLoginKeyTyped(evt);
            }
        });

        jLabel6.setText("Senha:");

        jtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSenhaKeyTyped(evt);
            }
        });

        jLabel7.setText("id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                    .addComponent(jtSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jt2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jt3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jComboBox2.setEnabled(false);
        int numMaxListaMedicoss = Dados.ListaDeMedicos.size()-1;
        String itemNomeMedicoss = "";
        for(int o = 0; o <= numMaxListaMedicoss; o++){
            Medico NomeMedicoItem = Dados.ListaDeMedicos.get(o);
            itemNomeMedicoss = NomeMedicoItem.getNome()+ " ("+ NomeMedicoItem.getIdMedico()+ ")";
            jComboBox2.addItem(itemNomeMedicoss);
        }
        jButton4.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(234, 234, 234));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Remover Médico");

        jLabel13.setText("Selecionar médico:        ");

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Dados do médico:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel14.setText("Após um médico ser excluído não será possível recuperar os seus dados para eventuais operações.");

        jCheckBox1.setBackground(new java.awt.Color(234, 234, 234));
        jCheckBox1.setText("Aceitar condição");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton3.setText("Remover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(36, 36, 36))
        );

        int numMaxListaMedicos = Dados.ListaDeMedicos.size()-1;
        String itemNomeMedicos = "";
        for(int o = 0; o <= numMaxListaMedicos; o++){
            Medico NomeMedicoItem = Dados.ListaDeMedicos.get(o);
            itemNomeMedicos = NomeMedicoItem.getNome()+ " ("+ NomeMedicoItem.getIdMedico()+ ")";
            jComboBox1.addItem(itemNomeMedicos);
        }
        jButton3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        TelaRecepcao p = new TelaRecepcao();
        p.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        remove = 1;
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (remove == 1) {
            String cod = "";
            int i = 0;
            for (i = jComboBox1.getSelectedItem().toString().length() - 2; !((jComboBox1.getSelectedItem().toString().charAt(i) + "").equals("(")); i--) {
                cod = jComboBox1.getSelectedItem().toString().charAt(i) + cod;
            }
            Medico m = new Medico();
            for (int o = 0; o <= Dados.getListaDeMedicos().size() - 1; o++) {
                if (Dados.getListaDeMedicos().get(o).getIdMedico() == Integer.parseInt(cod)) {
                    m = Dados.getListaDeMedicos().get(o);
                }
            }
            jTextArea1.setText(m.toString());
            remove = 0;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jButton3.setEnabled(true);

        } else {
            jButton3.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jCheckBox1.isSelected()) {

            String cod = "";
            int i = 0;
            for (i = jComboBox1.getSelectedItem().toString().length() - 2; !((jComboBox1.getSelectedItem().toString().charAt(i) + "").equals("(")); i--) {
                cod = jComboBox1.getSelectedItem().toString().charAt(i) + cod;
            }
            Medico m = new Medico();
            for (int o = 0; o <= Dados.getListaDeMedicos().size() - 1; o++) {
                if (Dados.getListaDeMedicos().get(o).getIdMedico() == Integer.parseInt(cod)) {
                    m = Dados.getListaDeMedicos().get(o);

                }
            }

            ConsultasAgendadas cc = new ConsultasAgendadas();
            int y = 0;
            for (int o = 0; o <= Dados.getListaDeConsultasAgendadas().size() - 1; o++) {
                if (Dados.getListaDeConsultasAgendadas().get(o).getMedicoResponsavel().getIdMedico() == m.getIdMedico()) {
                    cc = Dados.getListaDeConsultasAgendadas().get(o);
                    y++;

                }
            }
            if (y > 0) {
                JOptionPane.showMessageDialog(null, "Impossível excluir esse médico, há uma consulta agendada em que ele é o responsável.\n"
                        + " Caso seja necessário a exclusão do mesmo, edite o médico responsável pela consulta \n"
                        + "ou então delete a consulta, a saber, o nome da consulta: " + cc.getNomeConsulta(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                DAOMedico.remover(m);
                AdicionarNovoMedico add = new AdicionarNovoMedico();
                add.setVisible(true);
                this.dispose();
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            edit = 1;
            jComboBox2.setEnabled(true);
            jButton1.setEnabled(false);
            jButton4.setEnabled(true);
            jtLogin.setEnabled(false);
            jtSenha.setEnabled(false);
        } else {
            jComboBox2.setEnabled(false);
            jButton1.setEnabled(true);
            jButton4.setEnabled(false);
            jtLogin.setEnabled(true);
            jtSenha.setEnabled(true);
            jt1.setText("");
            jt2.setText("");
            jt3.setText("");
            jtLogin.setText("");
            jtSenha.setText("");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if (edit == 1) {
            String cod = "";
            int i = 0;
            for (i = jComboBox2.getSelectedItem().toString().length() - 2; !((jComboBox2.getSelectedItem().toString().charAt(i) + "").equals("(")); i--) {
                cod = jComboBox2.getSelectedItem().toString().charAt(i) + cod;
            }
            Medico m = new Medico();
            for (int o = 0; o <= Dados.getListaDeMedicos().size() - 1; o++) {
                if (Dados.getListaDeMedicos().get(o).getIdMedico() == Integer.parseInt(cod)) {
                    m = Dados.getListaDeMedicos().get(o);
                }
            }
            jtLogin.setText(m.getLogin().getLogin());
            jtSenha.setText(m.getLogin().getSenha());
            jLabel8.setText(Integer.toString(m.getLogin().getIdLogin()));
            jt1.setText(m.getNome());
            jt2.setText(m.getCPF());
            jt3.setText(m.getTelefone());
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jt1.getText().equals("")
                || jt2.getText().equals("")
                || jt3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ERRO. Algum dos dados não foram inseridos.");

        } else {
            String cod = "";
            int i = 0;
            for (i = jComboBox2.getSelectedItem().toString().length() - 2; !((jComboBox2.getSelectedItem().toString().charAt(i) + "").equals("(")); i--) {
                cod = jComboBox2.getSelectedItem().toString().charAt(i) + cod;
            }

            for (int o = 0; o <= Dados.getListaDeMedicos().size() - 1; o++) {
                if (Dados.getListaDeMedicos().get(o).getIdMedico() == Integer.parseInt(cod)) {
                    Medico m = Dados.getListaDeMedicos().get(o);
                    m.setNome(jt1.getText());
                    m.setCPF(jt2.getText());
                    m.setTelefone(jt3.getText());
                    DAOMedico.editar(m);
                }
            }
            AdicionarNovoMedico add = new AdicionarNovoMedico();
            add.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jt1.getText().equals("")
                || jt2.getText().equals("")
                || jt3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ERRO. Algum dos dados não foram inseridos.");

        } else {
            Login login = new Login(jtLogin.getText(), jtSenha.getText());
            DAOLogin.salvar(login);

            String sql = "SELECT MAX(idlogin) as maxId FROM login";
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs;
            try {
                rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    login.setIdLogin(rs.getInt("maxid"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdicionarNovoMedico.class.getName()).log(Level.SEVERE, null, ex);
            }

            Medico m = new Medico(login, jt1.getText(), jt2.getText(), jt3.getText());
            DAOMedico.salvar(m);
            AdicionarNovoMedico add = new AdicionarNovoMedico();
            add.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt1KeyTyped
        if (jt1.getText().length() >= 45) {
            evt.consume();
        } else {
            String maiusculas = "ABCDEFGHIJKLMNO PQRSTUVWXYZÁÀÂÃÉÈÊÓÒÔÕÍÌÎÚÙÛ ";
            String minusculas = maiusculas.toLowerCase() + ",.:;()-";
            if (!minusculas.contains(evt.getKeyChar() + "") & !maiusculas.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jt1KeyTyped

    private void jt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt2KeyTyped
        String minusculas = "0123456789";
        if (jt2.getText().length() >= 14) {
            evt.consume();
        } else {
            if (!minusculas.contains(evt.getKeyChar() + "")) {
                evt.consume();
            } else if (jt2.getText().length() == 3) {
                jt2.setText(jt2.getText() + ".");
            } else if (jt2.getText().length() == 7) {
                jt2.setText(jt2.getText() + ".");
            } else if (jt2.getText().length() == 11) {
                jt2.setText(jt2.getText() + "-");
            }
        }
    }//GEN-LAST:event_jt2KeyTyped

    private void jt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt3KeyTyped
        if (jt3.getText().length() >= 45) {
            evt.consume();
        } else {
            String minusculas = "0123456789";
            if (!minusculas.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jt3KeyTyped

    private void jtLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLoginKeyTyped
        if (jtLogin.getText().length() >= 45) {
            evt.consume();
        }
    }//GEN-LAST:event_jtLoginKeyTyped

    private void jtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSenhaKeyTyped
        if (jtSenha.getText().length() >= 45) {
            evt.consume();
        }
    }//GEN-LAST:event_jtSenhaKeyTyped

    /**
     * @param args the command line arguments
     */
    public void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdicionarNovoMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarNovoMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarNovoMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarNovoMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarNovoMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt2;
    private javax.swing.JTextField jt3;
    private javax.swing.JTextField jtLogin;
    private javax.swing.JTextField jtSenha;
    // End of variables declaration//GEN-END:variables
}
