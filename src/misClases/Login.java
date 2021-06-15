
package misClases;

import controlMySql.MySqlConn;
import java.applet.AudioClip;
import java.awt.Image;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Alondra paulina v
 */
public class Login extends javax.swing.JFrame {
  MySqlConn conn = new MySqlConn();

    /**
     * Creates new form Presentacion
     */
  public Login(MySqlConn conn){
    this.conn = conn;
    initComponents();
}
    public Login() {
        initComponents();


      ImageIcon presenthotel = new ImageIcon("src/misimagenes/Mar.jpg");
       Icon PresHotel = new ImageIcon(presenthotel.getImage().getScaledInstance(jLabelImagenDeFondo.getWidth(),jLabelImagenDeFondo.getHeight(), Image.SCALE_DEFAULT));
       jLabelImagenDeFondo.setIcon(PresHotel);
       
       //ImageIcon telefono = new ImageIcon("src/misimagenes/telefono.jpg");
       //Icon tel = new ImageIcon(telefono.getImage().getScaledInstance(jLabelTelefono.getWidth(),jLabelTelefono.getHeight(), Image.SCALE_DEFAULT));
       //jLabelTelefono.setIcon(tel);
   

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombreDelUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jButtonIngresar = new javax.swing.JButton();
        jButtonLimpiarLoging = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNuevoUsuario = new javax.swing.JTextField();
        jPasswordNuevaContraseña = new javax.swing.JPasswordField();
        jButtonNuevoRegistro = new javax.swing.JButton();
        jButtonLimpiarRegistro = new javax.swing.JButton();
        jButtonIrApresentacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelImagenDeFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Ingresar:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Usuario");

        jTextFieldNombreDelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombreDelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldNombreDelUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(57, 193, 192)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Contraseña:");

        jPasswordFieldContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(57, 193, 192)));

        jButtonIngresar.setBackground(new java.awt.Color(56, 98, 108));
        jButtonIngresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.setBorderPainted(false);
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jButtonLimpiarLoging.setBackground(new java.awt.Color(56, 98, 108));
        jButtonLimpiarLoging.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonLimpiarLoging.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiarLoging.setText("Limpiar");
        jButtonLimpiarLoging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarLogingActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Contraseña:");

        jTextFieldNuevoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNuevoUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(57, 193, 192)));
        jTextFieldNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNuevoUsuarioActionPerformed(evt);
            }
        });

        jPasswordNuevaContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordNuevaContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(57, 193, 192)));
        jPasswordNuevaContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordNuevaContraseñaActionPerformed(evt);
            }
        });

        jButtonNuevoRegistro.setBackground(new java.awt.Color(56, 98, 108));
        jButtonNuevoRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonNuevoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevoRegistro.setText("Registro");
        jButtonNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoRegistroActionPerformed(evt);
            }
        });

        jButtonLimpiarRegistro.setBackground(new java.awt.Color(56, 98, 108));
        jButtonLimpiarRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonLimpiarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiarRegistro.setText("Limpiar");
        jButtonLimpiarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarRegistroActionPerformed(evt);
            }
        });

        jButtonIrApresentacion.setBackground(new java.awt.Color(56, 98, 108));
        jButtonIrApresentacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonIrApresentacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIrApresentacion.setText("Sguiente");
        jButtonIrApresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIrApresentacionActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Aun no esta registrado?");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextFieldNombreDelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(101, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                    .addComponent(jButtonLimpiarLoging, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPasswordFieldContraseña)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jButtonNuevoRegistro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonLimpiarRegistro))
                                .addComponent(jPasswordNuevaContraseña)
                                .addComponent(jTextFieldNuevoUsuario))
                            .addComponent(jButtonIrApresentacion)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombreDelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIngresar)
                    .addComponent(jButtonLimpiarLoging))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevoRegistro)
                    .addComponent(jButtonLimpiarRegistro))
                .addGap(27, 27, 27)
                .addComponent(jButtonIrApresentacion)
                .addContainerGap(369, Short.MAX_VALUE))
        );

        jLabelImagenDeFondo.setBackground(new java.awt.Color(255, 204, 204));
        jLabelImagenDeFondo.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelImagenDeFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelImagenDeFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoRegistroActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        String usuario,contraseña, parte1, parte2,query;
        usuario = this.jTextFieldNuevoUsuario.getText().trim();
        char[] palabraclave = this.jPasswordNuevaContraseña.getPassword();
        
       // contraseña = new String (passw);F
        contraseña = new String (palabraclave);
        parte1 = "insert into contraseñas values (";
        parte2 = "'" + usuario + "'," + " MD5('" + contraseña + "'))";
        query = parte1 + parte2;
       
        int i = this.conn.Update(query);
        if (i > 0){
            JOptionPane.showMessageDialog(this, "Su cuenta ha sido registrada");
          
        }
    }//GEN-LAST:event_jButtonNuevoRegistroActionPerformed

    private void jButtonLimpiarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRegistroActionPerformed
        // TODO add your handling code here:
        this.jTextFieldNuevoUsuario.setText("");
        this.jPasswordNuevaContraseña.setText("");
    }//GEN-LAST:event_jButtonLimpiarRegistroActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        // TODO add your handling code here:
              // TODO add your handling code here:
        String usuario,contraseña,query;
        usuario = this.jTextFieldNombreDelUsuario.getText().trim();
        query = "select * from contraseñas where usuario = " + "'" + usuario + "'";
        this.conn.Consult(query);
        try { 
            String passwordMySql = this.conn.rs.getString(2);
            char [] palabraclave = this.jPasswordFieldContraseña.getPassword();
            contraseña = new String(palabraclave);
            String encriptacion = DigestUtils.md5Hex(contraseña);
            if (passwordMySql.equals(encriptacion))
            JOptionPane.showMessageDialog(this, "Bienvenido : " +
                    this.conn.rs.getString(1)+" ! ");
            else
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this, "esta cueta no esta registrada todavia");
           
        }
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jButtonLimpiarLogingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarLogingActionPerformed
        // TODO add your handling code here:
        this.jTextFieldNombreDelUsuario.setText("");
        this.jPasswordFieldContraseña.setText("");
    }//GEN-LAST:event_jButtonLimpiarLogingActionPerformed

    private void jButtonIrApresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIrApresentacionActionPerformed
        // TODO add your handling code here:
        Presentacion format = new Presentacion();
        format.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonIrApresentacionActionPerformed

    private void jTextFieldNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNuevoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNuevoUsuarioActionPerformed

    private void jPasswordNuevaContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordNuevaContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordNuevaContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonIrApresentacion;
    private javax.swing.JButton jButtonLimpiarLoging;
    private javax.swing.JButton jButtonLimpiarRegistro;
    private javax.swing.JButton jButtonNuevoRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelImagenDeFondo;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JPasswordField jPasswordNuevaContraseña;
    private javax.swing.JTextField jTextFieldNombreDelUsuario;
    private javax.swing.JTextField jTextFieldNuevoUsuario;
    // End of variables declaration//GEN-END:variables
}