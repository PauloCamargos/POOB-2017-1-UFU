/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.MyFrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author paulo
 */
public class Ativos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ativos
     */
    public Ativos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jtfDescricao = new javax.swing.JTextField();
        jbConsAtivos = new javax.swing.JButton();
        jbCadAtivos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAtivos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RG2 = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jtfModelo = new javax.swing.JTextField();
        RG3 = new javax.swing.JLabel();
        jtfNoSerie = new javax.swing.JTextField();
        RG5 = new javax.swing.JLabel();
        jtfCodForn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlTipo = new javax.swing.JComboBox<>();
        jtfConectar = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();

        setClosable(true);
        setTitle("Ativos");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1100, 650));

        jbConsAtivos.setText("Consultar Ativos");
        jbConsAtivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsAtivosActionPerformed(evt);
            }
        });

        jbCadAtivos.setText("Cadastrar Ativos");
        jbCadAtivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadAtivosActionPerformed(evt);
            }
        });

        jtAtivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.º Série", "Marca", "Modelo", "Descrição", "Cod Fornecedor", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtAtivos);
        if (jtAtivos.getColumnModel().getColumnCount() > 0) {
            jtAtivos.getColumnModel().getColumn(2).setPreferredWidth(5);
            jtAtivos.getColumnModel().getColumn(4).setPreferredWidth(3);
        }

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        RG2.setText("Descrição");

        RG3.setText("N.º Série");

        jtfNoSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNoSerieActionPerformed(evt);
            }
        });

        RG5.setText("Código do Fonecedor");

        jLabel1.setText("Tipo");

        jlTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobiliário", "Marquinario de produção", "Informática", "Balcão", "Veículo" }));

        jtfConectar.setText("Conectar");
        jtfConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfConectarActionPerformed(evt);
            }
        });

        jbUpdate.setText("Update");
        jbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateActionPerformed(evt);
            }
        });

        jbDelete.setText("Delete");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(112, 112, 112)
                        .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RG2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(RG5)
                            .addComponent(RG3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfModelo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodForn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMarca)
                            .addComponent(jtfNoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCadAtivos, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jtfConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbConsAtivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RG3)
                            .addComponent(jtfNoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RG2)
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RG5)
                            .addComponent(jtfCodForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtfConectar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCadAtivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbConsAtivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbDelete)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadAtivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadAtivosActionPerformed
        // TODO add your handling code here:
        if(estado_conexao){
        command = "INSERT INTO public.ativos(noserie, descricao, marca, modelo, tipo, codforn) "+
        "VALUES ('" + jtfNoSerie.getText()+"','" +
        jtfDescricao.getText()+"','" +
        jtfMarca.getText()+"','" +
        jtfModelo.getText()+"','" +
        jlTipo.getSelectedItem() + "','" +
        jtfCodForn.getText()+"')";
        System.out.println(command);
        clearFields();
        try {
            // cirar instancia de comando a ser executado
            stm = conn.createStatement();
            // Solicitar execução do comando
            stm.executeUpdate(command);
            //Se for executado com sucesso exibir imagens.
            JOptionPane.showMessageDialog(rootPane, "Registro inserido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }}else{
            JOptionPane.showMessageDialog(rootPane, "Banco de dados não conectado! Clique em conectar para prosseguir.");
        }
    }//GEN-LAST:event_jbCadAtivosActionPerformed

    private void jtfConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfConectarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            // Definindo o Driver de conexão
            Class.forName(driverDB);

            // Configurar conexão:
            conn = DriverManager.getConnection(url, usuario, senha);// Recolhe as info do usuario e url
            JOptionPane.showMessageDialog(rootPane, "Conexão estabelecida com sucesso!"); // Mostra esta message caso tudo funcioene
            estado_conexao = true;
        } catch (ClassNotFoundException ex) {
            // Abre uma nova janela mostrando o erro
            JOptionPane.showMessageDialog(rootPane, ex);
        } catch (SQLException ex1) {
            JOptionPane.showMessageDialog(rootPane, ex1);
        }
    }//GEN-LAST:event_jtfConectarActionPerformed

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        // TODO add your handling code here:
        if(estado_conexao){
            DefaultTableModel model = (DefaultTableModel)jtAtivos.getModel();

            if(jtAtivos.getSelectedRow()==-1){
                if(jtAtivos.getRowCount()==0){
                    JOptionPane.showMessageDialog(rootPane, "Tabela Vazia!");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um campo!");
                }
            } else {
                command = "update ativos set marca='" + model.getValueAt(jtAtivos.getSelectedRow(), 1).toString() + "' where noserie='" + model.getValueAt(jtAtivos.getSelectedRow(),0) + "';"+
                "update ativos set modelo='" + model.getValueAt(jtAtivos.getSelectedRow(), 2).toString() + "' where noserie='" + model.getValueAt(jtAtivos.getSelectedRow(),0) + "';"+
                "update ativos set descricao='" + model.getValueAt(jtAtivos.getSelectedRow(), 3).toString() + "' where noserie='" + model.getValueAt(jtAtivos.getSelectedRow(),0) + "';"+
                "update ativos set codforn='" + model.getValueAt(jtAtivos.getSelectedRow(), 4).toString() + "' where noserie='" + model.getValueAt(jtAtivos.getSelectedRow(),0) + "';";
                try {
                    // cirar instancia de comando a ser executado
                    stm = conn.createStatement();
                    // Solicitar execução do comando
                    stm.executeUpdate(command);
                    //Se for executado com sucesso exibir imagens.
                    JOptionPane.showMessageDialog(rootPane, "Registro atualizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
                clearFields();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Banco de dados não conectado! Clique em conectar para prosseguir.");
        }
    }//GEN-LAST:event_jbUpdateActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        // TODO add your handling code here:
        if(estado_conexao){
            DefaultTableModel model = (DefaultTableModel)jtAtivos.getModel();

            //Limpando os registros do objeto jTable
            String item_deletado;
            if(jtAtivos.getSelectedRow()==-1){
                if(jtAtivos.getRowCount()==0){
                    JOptionPane.showMessageDialog(rootPane, "Tabela vazia!");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um campo!");
                }
            }else{
                item_deletado = model.getValueAt(jtAtivos.getSelectedRow(), 0).toString();
                command = "delete from ativos where noserie="+item_deletado;
                System.out.println(command);
                try {
                    // cirar instancia de comando a ser executado
                    stm = conn.createStatement();
                    // Solicitar execução do comando
                    stm.executeUpdate(command);
                    //Se for executado com sucesso exibir imagens.
                    JOptionPane.showMessageDialog(rootPane, "Registro deletado com sucesso!");
                    jbConsAtivosActionPerformed(evt);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Banco de dados não conectado! Clique em conectar para prosseguir.");
        }
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void jbConsAtivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsAtivosActionPerformed
        // TODO add your handling code here:
        if (estado_conexao) {
        DefaultTableModel model = (DefaultTableModel)jtAtivos.getModel();
        //Limpando os registros do objeto jTable
        model.setNumRows(0);
        // Definição do comando estático e genérico
        command = "Select * from ativos order by noserie";
        try {
            // Definição da instancia de comando a ser executada
            stm = conn.createStatement();
            // Executando o comando e guardando os registros encontrados
            resultadoConsulta = stm.executeQuery(command);
            // Percorrer os registros dentro da variável resultadoConsulta
            // e adicionar no objeto jTable1
            while(resultadoConsulta.next()){ //Percorre enquanto existir um elemento nesta variável
                // Utilizando o objeto model para incluir os registros no jTable1
                model.addRow(new Object[]{resultadoConsulta.getString("noserie"),
                    resultadoConsulta.getString("marca"),
                    resultadoConsulta.getString("modelo"),
                    resultadoConsulta.getString("descricao"),
                    resultadoConsulta.getString("codforn"),
                    resultadoConsulta.getString("tipo")});

        }
        JOptionPane.showMessageDialog(rootPane, "Consulta realizada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        } }else {
            JOptionPane.showMessageDialog(rootPane, "Banco de dados não conectado! Clique em conectar para prosseguir.");
        }
    }//GEN-LAST:event_jbConsAtivosActionPerformed

    private void jtfNoSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNoSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNoSerieActionPerformed
 private ResultSet resultadoConsulta = null; // Guarda o resultado de um SELECT
    private String url = "jdbc:postgresql://localhost:5432/padaria"; // URL de conexão com o BD
    private String usuario = "postgres"; // Usuário de conexão com o banco
    private String senha = "371254";  // senha de conexão com o banco
    private Connection conn = null; // Guardar informações deconexão com o banco
    private Statement stm = null; // Instância de enveto a ser executado pelo banco
    private String command; // Comando a ser executado pelo banco
    private String driverDB = "org.postgresql.Driver"; //
    private boolean estado_conexao = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RG2;
    private javax.swing.JLabel RG3;
    private javax.swing.JLabel RG5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCadAtivos;
    private javax.swing.JButton jbConsAtivos;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JComboBox<String> jlTipo;
    private javax.swing.JTable jtAtivos;
    private javax.swing.JTextField jtfCodForn;
    private javax.swing.JButton jtfConectar;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfNoSerie;
    // End of variables declaration//GEN-END:variables
    private void clearFields() {
        jtfNoSerie.setText("");
        jtfDescricao.setText("");
        jtfMarca.setText("");
        jtfModelo.setText("");
        jlTipo.setActionCommand("1");
        jtfCodForn.setText("");
        
    }
}
