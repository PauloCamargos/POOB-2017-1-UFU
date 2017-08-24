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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paulo
 */
public class Estoque extends javax.swing.JInternalFrame {

    /**
     * Creates new form Estoque
     */
    public Estoque() {
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

        jtfValidade = new javax.swing.JTextField();
        jtfConsultarItens = new javax.swing.JButton();
        jtfInserirItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEstoque = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RG2 = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();
        RG3 = new javax.swing.JLabel();
        jtfNFOrigem = new javax.swing.JTextField();
        RG4 = new javax.swing.JLabel();
        jtfPreco = new javax.swing.JTextField();
        RG5 = new javax.swing.JLabel();
        jtfCodForn = new javax.swing.JTextField();
        jtfConectar = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();
        jsQnt = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jcUnidade = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Estoque");
        setPreferredSize(new java.awt.Dimension(1100, 650));

        jtfConsultarItens.setText("Consultar Itens");
        jtfConsultarItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfConsultarItensActionPerformed(evt);
            }
        });

        jtfInserirItem.setText("Inserir Item");
        jtfInserirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfInserirItemActionPerformed(evt);
            }
        });

        jtEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Produto", "Descrição", "Quantidae", "Unidade", "Validade", "NF Origem", "Preço", "Código Fornecedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtEstoque);
        if (jtEstoque.getColumnModel().getColumnCount() > 0) {
            jtEstoque.getColumnModel().getColumn(0).setResizable(false);
            jtEstoque.getColumnModel().getColumn(0).setPreferredWidth(2);
            jtEstoque.getColumnModel().getColumn(2).setPreferredWidth(5);
            jtEstoque.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setText("Descrição");

        jLabel3.setText("Quantidade");

        RG2.setText("Validade");

        RG3.setText("NF Origem");

        RG4.setText("Preço");

        RG5.setText("Código Fornecedor");

        jtfConectar.setText("Conectar");
        jtfConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfConectarActionPerformed(evt);
            }
        });

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

        jLabel1.setText("Unidade");

        jcUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cx", "pct", "litro", "unid" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(RG3)
                            .addComponent(jLabel3)
                            .addComponent(RG4)
                            .addComponent(RG5)
                            .addComponent(RG2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNFOrigem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                            .addComponent(jtfPreco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                            .addComponent(jtfValidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfCodForn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jsQnt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcUnidade, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfInserirItem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jbUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfConsultarItens, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtfConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtfDescricao, jtfNFOrigem, jtfPreco, jtfValidade});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbDelete, jbUpdate, jtfConectar, jtfConsultarItens, jtfInserirItem});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RG2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfInserirItem)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jsQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNFOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RG3))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RG4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCodForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RG5))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jtfConsultarItens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbDelete)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbDelete, jbUpdate, jtfConectar, jtfConsultarItens, jtfInserirItem});

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        // TODO add your handling code here:
        if(estado_conexao){
            DefaultTableModel model = (DefaultTableModel)jtEstoque.getModel();

            //Limpando os registros do objeto jTable
            String item_deletado;
            if(jtEstoque.getSelectedRow()==-1){
                if(jtEstoque.getRowCount()==0){
                    JOptionPane.showMessageDialog(rootPane, "Tabela vazia!");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um campo!");
                }
            }else{
                item_deletado = model.getValueAt(jtEstoque.getSelectedRow(), 0).toString();
                command = "delete from estoque where codprod="+item_deletado;
                System.out.println(command);
                try {
                    // cirar instancia de comando a ser executado
                    stm = conn.createStatement();
                    // Solicitar execução do comando
                    stm.executeUpdate(command);
                    //Se for executado com sucesso exibir imagens.
                    JOptionPane.showMessageDialog(rootPane, "Registro deletado com sucesso!");
                    jtfConsultarItensActionPerformed(evt);
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
            DefaultTableModel model = (DefaultTableModel)jtEstoque.getModel();

            if(jtEstoque.getSelectedRow()==-1){
                if(jtEstoque.getRowCount()==0){
                    JOptionPane.showMessageDialog(rootPane, "Tabela Vazia!");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um campo!");
                }
            } else {
                command = "update estoque set descricao='" + model.getValueAt(jtEstoque.getSelectedRow(), 1).toString() + "' where codprod='" + model.getValueAt(jtEstoque.getSelectedRow(),0) + "';"+ 
                        "update estoque set qnt='" + model.getValueAt(jtEstoque.getSelectedRow(), 2).toString() + "' where codprod='" + model.getValueAt(jtEstoque.getSelectedRow(),0) + "';"+
                        "update estoque set unidade='" + model.getValueAt(jtEstoque.getSelectedRow(), 3).toString() + "' where codprod='" + model.getValueAt(jtEstoque.getSelectedRow(),0) + "';"+
                        "update estoque set validade='" + model.getValueAt(jtEstoque.getSelectedRow(), 4).toString() + "' where codprod='" + model.getValueAt(jtEstoque.getSelectedRow(),0) + "';"+
                        "update estoque set nforigem='" + model.getValueAt(jtEstoque.getSelectedRow(), 5).toString() + "' where codprod='" + model.getValueAt(jtEstoque.getSelectedRow(),0) + "';"+
                        "update estoque set custounit='" + model.getValueAt(jtEstoque.getSelectedRow(), 6).toString() + "' where codprod='" + model.getValueAt(jtEstoque.getSelectedRow(),0) + "';"+
                        "update estoque set codforn='" + model.getValueAt(jtEstoque.getSelectedRow(), 7).toString() + "' where custounit='" + model.getValueAt(jtEstoque.getSelectedRow(),0) + "';";
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

    private void jtfInserirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfInserirItemActionPerformed
        // TODO add your handling code here:if (estado_conexao) {
        if (estado_conexao) {
            command = "INSERT INTO public.estoque(descricao, qnt, custounit, validade, codforn, nforigem, unidade) "
                    + "VALUES ('" + jtfDescricao.getText() + "','"
                    + jsQnt.getValue() + "','"
                    + jtfPreco.getText() + "','"
                    + jtfValidade.getText() + "','"
                    + jtfCodForn.getText() + "','"
                    + jtfNFOrigem.getText() + "','"
                    + jcUnidade.getSelectedItem() + "')";
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
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Banco de dados não conectado! Clique em conectar para prosseguir.");
        }
    }//GEN-LAST:event_jtfInserirItemActionPerformed

    private void jtfConsultarItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfConsultarItensActionPerformed
        // TODO add your handling code here:
       if(estado_conexao){
        DefaultTableModel model = (DefaultTableModel)jtEstoque.getModel();
        //Limpando os registros do objeto jTable
        model.setNumRows(0);
        // Definição do comando estático e genérico
        command = "Select * from estoque order by codprod";
        try {
            // Definição da instancia de comando a ser executada
            stm = conn.createStatement();
            // Executando o comando e guardando os registros encontrados
            resultadoConsulta = stm.executeQuery(command);
            // Percorrer os registros dentro da variável resultadoConsulta
            // e adicionar no objeto jTable1
                        while(resultadoConsulta.next()){ //Percorre enquanto existir um elemento nesta variável
                // Utilizando o objeto model para incluir os registros no jTable1
                model.addRow(new Object[]{resultadoConsulta.getString("codprod"),
                    resultadoConsulta.getString("descricao"),
                    resultadoConsulta.getString("qnt"),
                    resultadoConsulta.getString("unidade"),
                    resultadoConsulta.getString("validade"),
                    resultadoConsulta.getString("nforigem"),
                    resultadoConsulta.getString("custounit"),
                    resultadoConsulta.getString("codforn")});

        }
        JOptionPane.showMessageDialog(rootPane, "Consulta realizada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
       }else{
             JOptionPane.showMessageDialog(rootPane, "Banco de dados não conectado! Clique em conectar para prosseguir.");
       }
        
    }//GEN-LAST:event_jtfConsultarItensActionPerformed
    
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
    private javax.swing.JLabel RG5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JComboBox<String> jcUnidade;
    private javax.swing.JSpinner jsQnt;
    private javax.swing.JTable jtEstoque;
    private javax.swing.JTextField jtfCodForn;
    private javax.swing.JButton jtfConectar;
    private javax.swing.JButton jtfConsultarItens;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JButton jtfInserirItem;
    private javax.swing.JTextField jtfNFOrigem;
    private javax.swing.JTextField jtfPreco;
    private javax.swing.JTextField jtfValidade;
    // End of variables declaration//GEN-END:variables
private void clearFields() {
        jtfDescricao.setText("");
        jsQnt.setValue(0);
        jtfPreco.setText("");
        jtfValidade.setText("");
        jtfCodForn.setActionCommand("");
        jtfNFOrigem.setText("");
    }

}