/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Primeiro passo para trabalhar com interfaces gráficas
// e BD é manter o jdbc driver dentro da pasta do projeto.
// Depois deve-se importar o mesmo indo em propriedades do projeto bibliotecas.
package Main;

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
public class jFLivros extends javax.swing.JFrame {

    /**
     * Creates new form jFLivros
     */
    public jFLivros() {
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

        jlTitulo = new javax.swing.JLabel();
        jtfTitulo = new javax.swing.JTextField();
        jlAutor = new javax.swing.JLabel();
        jtfAutor = new javax.swing.JTextField();
        jlEditora = new javax.swing.JLabel();
        jtfEditora = new javax.swing.JTextField();
        jlAnoPub = new javax.swing.JLabel();
        jtfAnoPub = new javax.swing.JTextField();
        jlISBN = new javax.swing.JLabel();
        jtfIsbn = new javax.swing.JTextField();
        jbConectar = new javax.swing.JButton();
        jbInserir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Livro");

        jlTitulo.setText("Título:");

        jlAutor.setText("Autor:");

        jlEditora.setText("Editora:");

        jlAnoPub.setText("Ano Publicação:");

        jlISBN.setText("ISBN:");

        jbConectar.setText("Conectar");
        jbConectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbConectarMouseClicked(evt);
            }
        });

        jbInserir.setText("Inserir");
        jbInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbInserirMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codli", "Titulo", "Autor", "Editora", "AnoPublic", "ISBN"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        jbConsultar.setText("Consultar");
        jbConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbConsultarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAnoPub)
                    .addComponent(jlISBN)
                    .addComponent(jlEditora)
                    .addComponent(jlAutor)
                    .addComponent(jlTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbConectar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfIsbn)
                            .addComponent(jtfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfAnoPub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbConsultar)
                            .addComponent(jbInserir))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtfAnoPub, jtfAutor, jtfEditora, jtfIsbn, jtfTitulo});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbConectar, jbConsultar, jbInserir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTitulo)
                    .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConectar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAutor)
                    .addComponent(jtfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbInserir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEditora)
                    .addComponent(jtfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAnoPub)
                    .addComponent(jtfAnoPub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlISBN)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbConsultar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbConectarMouseClicked
        try {
            // TODO add your handling code here:
            // Definindo o Driver de conexão
            Class.forName(driverDB);
            
            // Configurar conexão:
            conn = DriverManager.getConnection(url, usuario, senha);// Recolhe as info do usuario e url
            JOptionPane.showMessageDialog(rootPane, "Conexão estabelecida com sucesso!"); // Mostra esta message caso tudo funcioene
        } catch (ClassNotFoundException ex) {
            // Abre uma nova janela mostrando o erro
            JOptionPane.showMessageDialog(rootPane, ex); 
        } catch (SQLException ex1) {
            JOptionPane.showMessageDialog(rootPane, ex1); 
        }
    }//GEN-LAST:event_jbConectarMouseClicked

    private void jbInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbInserirMouseClicked
        // TODO add your handling code here:
        command = "INSERT INTO public.livros(titulo, autor, editora, anopublic, ibsn) "+
                "VALUES ('" + jtfTitulo.getText()+"','" + 
                jtfAutor.getText()+"','" + 
                jtfEditora.getText()+"','" + 
                jtfAnoPub.getText()+"','" + 
                jtfIsbn.getText()+"')";
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
    }//GEN-LAST:event_jbInserirMouseClicked

    private void jbConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbConsultarMouseClicked
        // TODO add your handling code here:
        // Instanciar um objeto JTable para modificarmos sua estrutuura via código
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        //Limpando os registros do objeto jTable
        model.setNumRows(0);
        // Definição do comando estático e genérico
        command = "Select * from livros order by codli";
        try {
            // Definição da instancia de comando a ser executada
            stm = conn.createStatement();
            // Executando o comando e guardando os registros encontrados
            resultadoConsulta = stm.executeQuery(command);
            // Percorrer os registros dentro da variável resultadoConsulta
            // e adicionar no objeto jTable1
            while(resultadoConsulta.next()){ //Percorre enquanto existir um elemento nesta variável
                // Utilizando o objeto model para incluir os registros no jTable1
                model.addRow(new Object[]{resultadoConsulta.getString("codli"),
                    resultadoConsulta.getString("titulo"),
                    resultadoConsulta.getString("autor"),
                    resultadoConsulta.getString("editora"),
                    resultadoConsulta.getString("anopublic"),
                    resultadoConsulta.getString("ibsn")});
                
            }
            JOptionPane.showMessageDialog(rootPane, "Consulta realizada com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
       
    }//GEN-LAST:event_jbConsultarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jFLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFLivros().setVisible(true);
            }
        });
    }
    
    private ResultSet resultadoConsulta = null; // Guarda o resultado de um SELECT
    private String url = "jdbc:postgresql://localhost:5432/"; // URL de conexão com o BD
    private String usuario = "postgres"; // Usuário de conexão com o banco
    private String senha = "371254";  // senha de conexão com o banco
    private Connection conn = null; // Guardar informações deconexão com o banco
    private Statement stm = null; // Instância de enveto a ser executado pelo banco
    private String command; // Comando a ser executado pelo banco
    private String driverDB = "org.postgresql.Driver"; //
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbConectar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbInserir;
    private javax.swing.JLabel jlAnoPub;
    private javax.swing.JLabel jlAutor;
    private javax.swing.JLabel jlEditora;
    private javax.swing.JLabel jlISBN;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfAnoPub;
    private javax.swing.JTextField jtfAutor;
    private javax.swing.JTextField jtfEditora;
    private javax.swing.JTextField jtfIsbn;
    private javax.swing.JTextField jtfTitulo;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        jtfAutor.setText("");
        jtfEditora.setText("");
        jtfIsbn.setText("");
        jtfAnoPub.setText("");
        jtfTitulo.setText("");
    }
}
