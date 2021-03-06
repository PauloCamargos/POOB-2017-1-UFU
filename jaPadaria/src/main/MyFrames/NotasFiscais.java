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
public class NotasFiscais extends javax.swing.JInternalFrame {

    /** Creates new form NotasFiscais */
    public NotasFiscais() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfDescricao = new javax.swing.JTextField();
        jbConsultar = new javax.swing.JButton();
        jbConectar = new javax.swing.JButton();
        jbInserir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNF = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RG2 = new javax.swing.JLabel();
        jtfData = new javax.swing.JTextField();
        jtfNoSerie = new javax.swing.JTextField();
        jtfCodForn = new javax.swing.JTextField();
        RG3 = new javax.swing.JLabel();
        RG4 = new javax.swing.JLabel();
        jsQnt = new javax.swing.JSpinner();
        jlUnidade = new javax.swing.JComboBox<>();
        jbDelete = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();

        setClosable(true);
        setTitle("Notas Fiscais");
        setPreferredSize(new java.awt.Dimension(1100, 650));

        jbConsultar.setText("Consultar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jbConectar.setText("Conectar");
        jbConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConectarActionPerformed(evt);
            }
        });

        jbInserir.setText("Inserir");
        jbInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInserirActionPerformed(evt);
            }
        });

        jtNF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.º Série", "Data", "Código Fornecedor", "Descrição", "Quantidade", "Unidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtNF);

        jLabel1.setText("Data");

        jLabel2.setText("N.º Série");

        jLabel3.setText("Código Fornecedor");

        RG2.setText("Quantidade");

        jtfData.setName(""); // NOI18N

        RG3.setText("Descrição de Item");

        RG4.setText("Unidade");

        jlUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cx", "pct", "litro", "unid" }));

        jbDelete.setText("Delete");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });

        jbUpdate.setText("Update");
        jbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RG3)
                                    .addComponent(RG4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(RG2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jsQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jtfCodForn, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNoSerie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbInserir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jbUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {RG2, RG3, RG4, jLabel1, jLabel2, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtfCodForn, jtfData, jtfDescricao, jtfNoSerie});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtfNoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbConectar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbInserir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfCodForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RG3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RG2)
                            .addComponent(jsQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RG4)
                            .addComponent(jlUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbDelete)))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConectarActionPerformed
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
    }//GEN-LAST:event_jbConectarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        // TODO add your handling code here:
       if(estado_conexao){
        DefaultTableModel model = (DefaultTableModel)jtNF.getModel();
        //Limpando os registros do objeto jTable
        model.setNumRows(0);
        // Definição do comando estático e genérico
        command = "Select * from nf order by noserie";
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
                    resultadoConsulta.getString("datacompra"),
                    resultadoConsulta.getString("codforn"),
                    resultadoConsulta.getString("descricaoitem"),
                    resultadoConsulta.getString("qnt"),
                    resultadoConsulta.getString("unidade")});

        }
        JOptionPane.showMessageDialog(rootPane, "Consulta realizada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }}else{
             JOptionPane.showMessageDialog(rootPane, "Banco de dados não conectado! Clique em conectar para prosseguir.");
       }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        // TODO add your handling code here:
        if(estado_conexao){
            DefaultTableModel model = (DefaultTableModel)jtNF.getModel();

            //Limpando os registros do objeto jTable
            String item_deletado;
            if(jtNF.getSelectedRow()==-1){
                if(jtNF.getRowCount()==0){
                    JOptionPane.showMessageDialog(rootPane, "Tabela vazia!");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um campo!");
                }
            }else{
                item_deletado = model.getValueAt(jtNF.getSelectedRow(), 0).toString();
                command = "delete from nf where noserie="+item_deletado;
                System.out.println(command);
                try {
                    // cirar instancia de comando a ser executado
                    stm = conn.createStatement();
                    // Solicitar execução do comando
                    stm.executeUpdate(command);
                    //Se for executado com sucesso exibir imagens.
                    JOptionPane.showMessageDialog(rootPane, "Registro deletado com sucesso!");
                    jbConsultarActionPerformed(evt);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Banco de dados não conectado! Clique em conectar para prosseguir.");
        }
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        // TODO add your handling code here:
        if(estado_conexao){
            DefaultTableModel model = (DefaultTableModel)jtNF.getModel();

            if(jtNF.getSelectedRow()==-1){
                if(jtNF.getRowCount()==0){
                    JOptionPane.showMessageDialog(rootPane, "Tabela Vazia!");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um campo!");
                }
            } else {
                command = "update nf set datacompra='" + model.getValueAt(jtNF.getSelectedRow(), 1).toString() + "' where noserie='" + model.getValueAt(jtNF.getSelectedRow(),0) + "';"+
                "update nf set codforn='" + model.getValueAt(jtNF.getSelectedRow(), 2).toString() + "' where noserie='" + model.getValueAt(jtNF.getSelectedRow(),0) + "';"+
                "update nf set descricaoitem='" + model.getValueAt(jtNF.getSelectedRow(), 3).toString() + "' where noserie='" + model.getValueAt(jtNF.getSelectedRow(),0) + "';"+
                "update nf set qnt='" + model.getValueAt(jtNF.getSelectedRow(), 4).toString() + "' where noserie='" + model.getValueAt(jtNF.getSelectedRow(),0) + "';"+
                "update nf set unidade='" + model.getValueAt(jtNF.getSelectedRow(), 5).toString() + "' where noserie='" + model.getValueAt(jtNF.getSelectedRow(),0) + "';";
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

    private void jbInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInserirActionPerformed
        // TODO add your handling code here:
        if (estado_conexao) {
        command = "INSERT INTO public.nf(noserie, datacompra, descricaoitem, qnt, unidade,codforn) "+
        "VALUES ('" + jtfNoSerie.getText()+"','" +
        jtfData.getText()+"','" +
        jtfDescricao.getText()+"','" +
        jsQnt.getValue()+"','" +
        jlUnidade.getSelectedItem()+"','" +
        jtfCodForn.getText()+"')";
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
    }//GEN-LAST:event_jbInserirActionPerformed

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
    private javax.swing.JLabel RG4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConectar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbInserir;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JComboBox<String> jlUnidade;
    private javax.swing.JSpinner jsQnt;
    private javax.swing.JTable jtNF;
    private javax.swing.JTextField jtfCodForn;
    private javax.swing.JTextField jtfData;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfNoSerie;
    // End of variables declaration//GEN-END:variables


 private void clearFields() {
        jtfData.setText("");
        jtfDescricao.setText("");
        jsQnt.setValue(0);
        jtfCodForn.setText("");
        
    }
}
