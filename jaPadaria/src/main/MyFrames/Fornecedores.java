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
public class Fornecedores extends javax.swing.JInternalFrame {

    /**
     * Creates new form Fornecedores
     */
    public Fornecedores() {
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

        jbInserir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RG2 = new javax.swing.JLabel();
        jtfRSocial = new javax.swing.JTextField();
        jtfCNPJ = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jbConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFornecedores = new javax.swing.JTable();
        tipo = new javax.swing.JLabel();
        jtfTipoProd = new javax.swing.JTextField();
        jlTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jbConectar = new javax.swing.JButton();
        jbUpdateLeitores = new javax.swing.JButton();
        jbDeleteLeitores = new javax.swing.JButton();

        setClosable(true);
        setTitle("Fornecedores");
        setPreferredSize(new java.awt.Dimension(1100, 650));

        jbInserir.setText("Cadastrar Fornecedor");
        jbInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInserirActionPerformed(evt);
            }
        });

        jLabel1.setText("Razão Social");

        jLabel2.setText("CNPJ/CPF");

        jLabel3.setText("Telefone:");

        RG2.setText("Endereço");

        jbConsultar.setText("Consultar Fonecedores");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jtFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Fornecedor", "Razão Social", "CNPF/CPF", "Telefone", "Endereço", "Tipo de Produto", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtFornecedores);

        tipo.setText("Tipo de Produto");

        jlTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Produtor Rural", "Industria", "Produtor Residencial" }));

        jLabel4.setText("Tipo");

        jbConectar.setText("Conectar");
        jbConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConectarActionPerformed(evt);
            }
        });

        jbUpdateLeitores.setText("Update");
        jbUpdateLeitores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateLeitoresActionPerformed(evt);
            }
        });

        jbDeleteLeitores.setText("Delete");
        jbDeleteLeitores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteLeitoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RG2)
                                    .addComponent(tipo)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfEndereco)
                                    .addComponent(jtfTelefone)
                                    .addComponent(jtfCNPJ)
                                    .addComponent(jtfRSocial)
                                    .addComponent(jtfTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(84, 84, 84)
                                .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbConsultar)
                            .addComponent(jbConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbDeleteLeitores, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbUpdateLeitores, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(51, 82, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbConectar, jbConsultar, jbDeleteLeitores, jbInserir, jbUpdateLeitores});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addComponent(jtfRSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(RG2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(tipo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtfTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jbConectar)
                        .addGap(18, 18, 18)
                        .addComponent(jbInserir)
                        .addGap(18, 18, 18)
                        .addComponent(jbConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(jbUpdateLeitores)
                        .addGap(18, 18, 18)
                        .addComponent(jbDeleteLeitores)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jbUpdateLeitoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateLeitoresActionPerformed
        // TODO add your handling code here:
        if(estado_conexao){
            DefaultTableModel model = (DefaultTableModel)jtFornecedores.getModel();

            if(jtFornecedores.getSelectedRow()==-1){
                if(jtFornecedores.getRowCount()==0){
                    JOptionPane.showMessageDialog(rootPane, "Tabela Vazia!");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um campo!");
                }
            } else {
                command = "update fornecedores set rsocial='" + model.getValueAt(jtFornecedores.getSelectedRow(), 1).toString() + "' where codforn='" + model.getValueAt(jtFornecedores.getSelectedRow(),0) + "';"+
                 "update fornecedores set cpnj_cpf='" + model.getValueAt(jtFornecedores.getSelectedRow(), 2).toString() + "' where codforn='" + model.getValueAt(jtFornecedores.getSelectedRow(),0) + "';"+
                "update fornecedores set telefone='" + model.getValueAt(jtFornecedores.getSelectedRow(), 3).toString() + "' where codforn='" + model.getValueAt(jtFornecedores.getSelectedRow(),0) + "';"+
                "update fornecedores set endereco='" + model.getValueAt(jtFornecedores.getSelectedRow(), 4).toString() + "' where codforn='" + model.getValueAt(jtFornecedores.getSelectedRow(),0) + "';"+
                "update fornecedores set tipoprod='" + model.getValueAt(jtFornecedores.getSelectedRow(), 5).toString() + "' where codforn='" + model.getValueAt(jtFornecedores.getSelectedRow(),0) + "';"+
                "update fornecedores set tipo='" + model.getValueAt(jtFornecedores.getSelectedRow(), 6).toString() + "' where codforn='" + model.getValueAt(jtFornecedores.getSelectedRow(),0) + "';";
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
    }//GEN-LAST:event_jbUpdateLeitoresActionPerformed

    private void jbDeleteLeitoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteLeitoresActionPerformed
        // TODO add your handling code here:
        if(estado_conexao){
            DefaultTableModel model = (DefaultTableModel)jtFornecedores.getModel();

            //Limpando os registros do objeto jTable
            String item_deletado;
            if(jtFornecedores.getSelectedRow()==-1){
                if(jtFornecedores.getRowCount()==0){
                    JOptionPane.showMessageDialog(rootPane, "Tabela vazia!");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Você deve selecionar um campo!");
                }
            }else{
                item_deletado = model.getValueAt(jtFornecedores.getSelectedRow(), 0).toString();
                command = "delete from fornecedores where codforn="+item_deletado;
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
    }//GEN-LAST:event_jbDeleteLeitoresActionPerformed

    private void jbInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInserirActionPerformed
        // TODO add your handling code here:
         if (estado_conexao) {
            command = "INSERT INTO public.fornecedores(cpnj_cpf, rsocial, endereco, tipoprod, tipo, telefone) "
                    + "VALUES ('" + jtfCNPJ.getText() + "','"
                    + jtfRSocial.getText() + "','"
                    + jtfEndereco.getText() + "','"
                    + jtfTipoProd.getText() + "','"
                    + jlTipo.getSelectedItem() + "','"
                    + jtfTelefone.getText() + "')";
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
        
    }//GEN-LAST:event_jbInserirActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        // TODO add your handling code here:
        
         if(estado_conexao){
        DefaultTableModel model = (DefaultTableModel)jtFornecedores.getModel();
        //Limpando os registros do objeto jTable
        model.setNumRows(0);
        // Definição do comando estático e genérico
        command = "Select * from fornecedores order by codforn";
        try {
            // Definição da instancia de comando a ser executada
            stm = conn.createStatement();
            // Executando o comando e guardando os registros encontrados
            resultadoConsulta = stm.executeQuery(command);
            // Percorrer os registros dentro da variável resultadoConsulta
            // e adicionar no objeto jTable1
            while(resultadoConsulta.next()){ //Percorre enquanto existir um elemento nesta variável
                // Utilizando o objeto model para incluir os registros no jTable1
                model.addRow(new Object[]{resultadoConsulta.getString("codforn"),
                    resultadoConsulta.getString("rsocial"),
                    resultadoConsulta.getString("cpnj_cpf"),
                    resultadoConsulta.getString("telefone"),
                    resultadoConsulta.getString("endereco"),
                    resultadoConsulta.getString("tipoprod"),
                    resultadoConsulta.getString("tipo")});

        }
        JOptionPane.showMessageDialog(rootPane, "Consulta realizada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        }else{
             JOptionPane.showMessageDialog(rootPane, "Banco de dados não conectado! Clique em conectar para prosseguir.");
       }
    }//GEN-LAST:event_jbConsultarActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConectar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbDeleteLeitores;
    private javax.swing.JButton jbInserir;
    private javax.swing.JButton jbUpdateLeitores;
    private javax.swing.JComboBox<String> jlTipo;
    private javax.swing.JTable jtFornecedores;
    private javax.swing.JTextField jtfCNPJ;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfRSocial;
    private javax.swing.JTextField jtfTelefone;
    private javax.swing.JTextField jtfTipoProd;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables

private void clearFields() {
        jtfCNPJ.setText("");
        jtfRSocial.setText("");
        jtfTipoProd.setText("");
        jlTipo.setActionCommand("");
        jtfTelefone.setText("");
        jtfEndereco.setText("");
     
    }
}
