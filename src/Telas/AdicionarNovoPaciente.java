/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author msa04
 */
import Modelo.*;
import Impressao.*;
import Dados.*;
import DAO.*;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class AdicionarNovoPaciente extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarNovoPaciente
     */
    private static int edit = 0, remove = 0;

    public void setEdit(int i) {
        edit = i;
    }

    public int getEdit() {
        return edit;
    }

    public AdicionarNovoPaciente() {
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

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton7 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jt5 = new javax.swing.JTextField();
        jt6 = new javax.swing.JTextField();
        jt7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jt8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jt4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jt1 = new javax.swing.JTextField();
        jt2 = new javax.swing.JTextField();
        jt3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de cadastro de paciente");

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));

        jToolBar1.setBackground(new java.awt.Color(234, 234, 234));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton7.setBackground(new java.awt.Color(234, 234, 234));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Midia/Inicio.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jLabel17.setText("Nome:");

        jLabel18.setText("CPF:");

        jLabel19.setText("Telefone:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Dados principais:   ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Endere??o:");

        jLabel22.setText("Cidade:");

        jLabel23.setText("Bairro:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Adicionar/Editar Paciente");

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

        jt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt5KeyTyped(evt);
            }
        });

        jt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt6KeyTyped(evt);
            }
        });

        jt7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt7KeyTyped(evt);
            }
        });

        jLabel6.setText("N??mero:");

        jt8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt8KeyTyped(evt);
            }
        });

        jLabel16.setText("Rua:");

        jt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt4KeyTyped(evt);
            }
        });

        jLabel5.setText("Idade:");

        jt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt1KeyTyped(evt);
            }
        });

        jt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt2KeyTyped(evt);
            }
        });

        jt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt3KeyTyped(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel5))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt3)
                                    .addComponent(jt4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt2)
                                    .addComponent(jt1))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(246, 246, 246))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jt6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                    .addComponent(jt7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt8)
                                    .addComponent(jt5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22)
                    .addComponent(jt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel23)
                    .addComponent(jt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel16)
                    .addComponent(jt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jComboBox2.setEnabled(false);
        int numMaxListaPacientess = Dados.ListaDePacientes.size()-1;
        String itemNomePacientess = "";
        for(int o = 0; o <= numMaxListaPacientess; o++){
            Paciente NomePacienteItem = Dados.ListaDePacientes.get(o);
            itemNomePacientess = NomePacienteItem.getNome()+ " ("+ NomePacienteItem.getIdPaciente()+ ")";
            jComboBox2.addItem(itemNomePacientess);
        }
        jButton4.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(234, 234, 234));

        jLabel25.setText("Selecionar paciente:   ");

        jLabel26.setText("Dados do paciente:");

        jLabel27.setText("Ap??s um paciente ser exclu??do n??o ser?? poss??vel recuperar os seus dados para eventuais opera????es.");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Remover Paciente");

        jCheckBox1.setBackground(new java.awt.Color(234, 234, 234));
        jCheckBox1.setText("Aceitar condi????o");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox1))
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
                .addComponent(jLabel25)
                .addGap(4, 4, 4)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jCheckBox1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        int numMaxListaPacientes = Dados.ListaDePacientes.size()-1;
        String itemNomePacientes = "";
        for(int o = 0; o <= numMaxListaPacientes; o++){
            Paciente NomePacienteItem = Dados.ListaDePacientes.get(o);
            itemNomePacientes = NomePacienteItem.getNome()+ " ("+ NomePacienteItem.getIdPaciente()+ ")";
            jComboBox1.addItem(itemNomePacientes);
        }
        jButton3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jt1.getText().equals("")
                || jt2.getText().equals("")
                || jt3.getText().equals("")
                || jt4.getText().equals("")
                || jt5.getText().equals("")
                || jt6.getText().equals("")
                || jt7.getText().equals("")
                || jt8.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ERRO. Algum dos dados n??o foram inseridos.");

        } else {
            Paciente p = new Paciente(jt1.getText(), jt2.getText(), Integer.parseInt(jt4.getText()), jt5.getText(), jt6.getText(), jt7.getText(), Integer.parseInt(jt8.getText()), jt3.getText());
            DAOPaciente.salvar(p);
            AdicionarNovoPaciente add = new AdicionarNovoPaciente();
            add.setVisible(true);
            this.dispose();

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jCheckBox1.isSelected()) {

            String cod = "";
            int i = 0;
            for (i = jComboBox1.getSelectedItem().toString().length() - 2; !((jComboBox1.getSelectedItem().toString().charAt(i) + "").equals("(")); i--) {
                cod = jComboBox1.getSelectedItem().toString().charAt(i) + cod;
            }
            Paciente m = new Paciente();
            for (int o = 0; o <= Dados.getListaDePacientes().size() - 1; o++) {
                if (Dados.getListaDePacientes().get(o).getIdPaciente() == Integer.parseInt(cod)) {
                    m = Dados.getListaDePacientes().get(o);
                }
            }
            int y = 0;
            ConsultasAgendadas cc = new ConsultasAgendadas();
            for (int o = 0; o <= Dados.getListaDeConsultasAgendadas().size() - 1; o++) {
                if (Dados.getListaDeConsultasAgendadas().get(o).getPacienteAcompanhado().getIdPaciente() == m.getIdPaciente()) {
                    cc = Dados.getListaDeConsultasAgendadas().get(o);
                    y++;
                }
            }
            if (y > 0) {
                JOptionPane.showMessageDialog(null, "Imposs??vel excluir esse paciente, h?? uma consulta agendada para esse paciemte.\n"
                        + " Caso seja necess??rio a exclus??o do mesmo, exclua a consulta relacionada, a saber: " + cc.getNomeConsulta(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                DAOPaciente.remover(m);
                AdicionarNovoPaciente add = new AdicionarNovoPaciente();
                add.setVisible(true);
                this.dispose();
            }
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            edit = 1;
            jComboBox2.setEnabled(true);
            jButton1.setEnabled(false);
            jButton4.setEnabled(true);
        } else {
            jComboBox2.setEnabled(false);
            jButton1.setEnabled(true);
            jButton4.setEnabled(false);
            jt1.setText("");
            jt2.setText("");
            jt3.setText("");
            jt4.setText("");
            jt5.setText("");
            jt6.setText("");
            jt7.setText("");
            jt8.setText("");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if (edit == 1) {
            String cod = "";
            int i = 0;
            for (i = jComboBox2.getSelectedItem().toString().length() - 2; !((jComboBox2.getSelectedItem().toString().charAt(i) + "").equals("(")); i--) {
                cod = jComboBox2.getSelectedItem().toString().charAt(i) + cod;
            }
            Paciente m = new Paciente();
            for (int o = 0; o <= Dados.getListaDePacientes().size() - 1; o++) {
                if (Dados.getListaDePacientes().get(o).getIdPaciente() == Integer.parseInt(cod)) {
                    m = Dados.getListaDePacientes().get(o);
                }
            }

            jt1.setText(m.getNome());
            jt2.setText(m.getCPF());
            jt3.setText(m.getTelefone());
            jt4.setText(Integer.toString(m.getIdade()));
            jt5.setText(m.getCidade());
            jt6.setText(m.getBairro());
            jt7.setText(m.getRua());
            jt8.setText(Integer.toString(m.getNumeroDaCasa()));
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jButton3.setEnabled(true);

        } else {
            jButton3.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jt1.getText().equals("")
                || jt2.getText().equals("")
                || jt3.getText().equals("")
                || jt4.getText().equals("")
                || jt5.getText().equals("")
                || jt6.getText().equals("")
                || jt7.getText().equals("")
                || jt8.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ERRO. Algum dos dados n??o foram inseridos.");

        } else {
            String cod = "";
            int i = 0;
            for (i = jComboBox2.getSelectedItem().toString().length() - 2; !((jComboBox2.getSelectedItem().toString().charAt(i) + "").equals("(")); i--) {
                cod = jComboBox2.getSelectedItem().toString().charAt(i) + cod;
            }

            for (int o = 0; o <= Dados.getListaDePacientes().size() - 1; o++) {
                if (Dados.getListaDePacientes().get(o).getIdPaciente() == Integer.parseInt(cod)) {

                    Paciente p = new Paciente(jt1.getText(), jt2.getText(), Integer.parseInt(jt4.getText()), jt5.getText(), jt6.getText(), jt7.getText(), Integer.parseInt(jt8.getText()), jt3.getText());
                    p.setIdPaciente(Integer.parseInt(cod));
                    DAOPaciente.editar(p);
                }
            }
            AdicionarNovoPaciente add = new AdicionarNovoPaciente();
            add.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (remove == 1) {
            String cod = "";
            int i = 0;
            for (i = jComboBox1.getSelectedItem().toString().length() - 2; !((jComboBox1.getSelectedItem().toString().charAt(i) + "").equals("(")); i--) {
                cod = jComboBox1.getSelectedItem().toString().charAt(i) + cod;
            }
            Paciente m = new Paciente();
            for (int o = 0; o <= Dados.getListaDePacientes().size() - 1; o++) {
                if (Dados.getListaDePacientes().get(o).getIdPaciente() == Integer.parseInt(cod)) {
                    m = Dados.getListaDePacientes().get(o);
                }
            }
            jTextArea1.setText(m.toString());
            remove = 0;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        remove = 1;
    }//GEN-LAST:event_jComboBox1MouseClicked

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

    private void jt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt1KeyTyped
        if (jt1.getText().length() >= 45) {
            evt.consume();
        } else {
            String maiusculas = "ABCDEFGHIJKLMNO PQRSTUVWXYZ?????????????????????????????????? ";
            String minusculas = maiusculas.toLowerCase() + ",.:;()-";
            if (!minusculas.contains(evt.getKeyChar() + "") & !maiusculas.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jt1KeyTyped

    private void jt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt4KeyTyped
        if (jt3.getText().length() >= 3) {
            evt.consume();
        } else {
            String minusculas = "0123456789";
            if (!minusculas.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jt4KeyTyped

    private void jt8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt8KeyTyped
        if (jt8.getText().length() >= 10) {
            evt.consume();
        } else {
            String minusculas = "0123456789";
            if (!minusculas.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jt8KeyTyped

    private void jt5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt5KeyTyped
        if (jt5.getText().length() >= 45) {
            evt.consume();
        } else {
            String maiusculas = "ABCDEFGHIJKLMNO PQRSTUVWXYZ?????????????????????????????????? ";
            String minusculas = maiusculas.toLowerCase() + ",.:;()-";
            if (!minusculas.contains(evt.getKeyChar() + "") & !maiusculas.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jt5KeyTyped

    private void jt6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt6KeyTyped
        if (jt6.getText().length() >= 45) {
            evt.consume();
        } else {
            String maiusculas = "ABCDEFGHIJKLMNO PQRSTUVWXYZ?????????????????????????????????? ";
            String minusculas = maiusculas.toLowerCase() + ",.:;()-";
            if (!minusculas.contains(evt.getKeyChar() + "") & !maiusculas.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jt6KeyTyped

    private void jt7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt7KeyTyped
        if (jt7.getText().length() >= 45) {
            evt.consume();
        } else {
            String maiusculas = "ABCDEFGHIJKLMNO PQRSTUVWXYZ?????????????????????????????????? ";
            String minusculas = maiusculas.toLowerCase() + ",.:;()-";
            if (!minusculas.contains(evt.getKeyChar() + "") & !maiusculas.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jt7KeyTyped

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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        TelaRecepcao p = new TelaRecepcao();
        p.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jt2KeyReleased

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
            java.util.logging.Logger.getLogger(AdicionarNovoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarNovoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarNovoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarNovoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarNovoPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt2;
    private javax.swing.JTextField jt3;
    private javax.swing.JTextField jt4;
    private javax.swing.JTextField jt5;
    private javax.swing.JTextField jt6;
    private javax.swing.JTextField jt7;
    private javax.swing.JTextField jt8;
    // End of variables declaration//GEN-END:variables
}
