package misClases;

import controlMySql.MySqlConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Checkin extends javax.swing.JFrame {

    MySqlConn conn;

    public Checkin(MySqlConn conn) {
        this.conn = conn;
        initComponents();
        PisosHotel a = new PisosHotel();
        jTextFieldNumero.setText(a.numHab);
    }

    public Checkin() {
        initComponents();

    }

    public static String sumarDiasAFecha(String fecha, int dias) {
        if (dias == 0) {
            return fecha;
        }

        String[] f = fecha.split("/");
        Calendar calendar = Calendar.getInstance();

        calendar.set(Integer.parseInt(f[0]), Integer.parseInt(f[1]) - 1, Integer.parseInt(f[2]));

        calendar.add(Calendar.DAY_OF_MONTH, dias);
        SimpleDateFormat fe = new SimpleDateFormat("dd/MM/YYYY");
        return fe.format(calendar.getTime());

    }

    private void habitacionesDisponibles() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldHab = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jTextFieldTotalPersonas = new javax.swing.JTextField();
        jTextFieldDias = new javax.swing.JTextField();
        jButtonRegistro = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPiso = new javax.swing.JTextField();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TipoHabitacion = new javax.swing.JComboBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jLabel1.setText("Registro");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Tipo de habitacion:");

        jLabel4.setText("Ciudad de origen:");

        jLabel5.setText("Total de personas:");

        jLabel6.setText("Total de dias que se va quedar ");

        jLabel7.setText("Fecha de ingreso ");

        jButtonRegistro.setText("Registro");
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });

        jLabel9.setText("Piso:");

        jButtonBuscar.setText("Buscar ");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel10.setText("Numero de habitacion:");

        TipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sensilla", "Doble", "Triple" }));
        TipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoHabitacionActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Atras");

        jLabel8.setText("Personas extras:");

        jSpinner1.setModel(new javax.swing.SpinnerListModel(new String[] {"0", "1", "2"}));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegistro)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(114, 114, 114)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(135, 135, 135)
                                .addComponent(jTextFieldPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldHab, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNumero))
                    .addComponent(jDateChooserFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTotalPersonas, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTotalPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistro)
                    .addComponent(jToggleButton1))
                .addGap(34, 34, 34))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldCiudad, jTextFieldDias, jTextFieldHab, jTextFieldNombre, jTextFieldTotalPersonas});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        // TODO add your handling code here:
        //String nombre,habitacion,Ciudad, numPer, dias, numHab,Piso;
        String numHab, nombre, fechaEntrada, fechaSalida, tipoHabitacion, piso, personas, personasExtras, ciudad, dias;
        MySqlConn cc = new MySqlConn();
        Connection con = cc.MySqlConn1();
        nombre = this.jTextFieldNombre.getText();
        tipoHabitacion = (String) this.TipoHabitacion.getSelectedItem();
        ciudad = this.jTextFieldCiudad.getText();
        personas = this.jTextFieldTotalPersonas.getText().trim();
        dias = this.jTextFieldDias.getText().trim();
        numHab = this.jTextFieldNumero.getText().trim();
        piso = this.jTextFieldPiso.getText().trim();
        fechaEntrada = ((JTextField) jDateChooserFecha.getDateEditor().getUiComponent()).getText();
        //suma de dias ******
        String auxfecha, Dianuevo;
        int auxdias;
        SimpleDateFormat fom = new SimpleDateFormat("yyyy/MM/dd");
        auxfecha = fom.format(this.jDateChooserFecha.getDate());
        auxdias = Integer.parseInt(this.jTextFieldDias.getText().trim());
        Dianuevo = sumarDiasAFecha(auxfecha, auxdias);
        fechaSalida = Dianuevo;
        //*****
       
        personasExtras =  (String) this.jSpinner1.getValue();

        //String parte1 = "Insert into huespedes (NumHab, Nombre, FechaEntrada,FechaSalida, TipoHabitacion,Piso,Personas,PersonasExtras,Ciudad,Dias) VALUES (";
        //String parte2 = "'" + numHab + "','" + nombre + "','" + fechaEntrada + "','" + fechaSalida + "','" + tipoHabitacion + "','" + piso + "','" + personas + "','" + personasExtras + "','" + ciudad + "','" +dias+ "')";
       // String query = parte1 + parte2;

       // int j = this.conn.Update(query);
        //System.out.println("Numero de registros afectados por laccion:" + j);
        
        
         try{
            String sql = "Insert into huespedes  (NumHab, Nombre, FechaEntrada,FechaSalida, TipoHabitacion,Piso,Personas,PersonasExtras,Ciudad,Dias) values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, numHab);
            pst.setString(2, nombre);
            pst.setString(3, fechaEntrada);
            pst.setString(4, fechaSalida);
            pst.setString(5, tipoHabitacion);
            pst.setString(6, piso);
            pst.setString(7, personas);
            pst.setString(8, personasExtras);
            pst.setString(9, ciudad);
            pst.setString(10, dias);

            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de registro" + e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonRegistroActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        String aux;
        PisosHotel a = new PisosHotel();
        a.setVisible(true);
        //aux=a.getNumHab();
        System.out.println(a.getNumHab());

        jTextFieldNumero.setText(PisosHotel.numHab);
        this.setVisible(false);


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void TipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoHabitacionActionPerformed
        // TODO add your handling code here:
        String tipoHabitacion;
        tipoHabitacion = TipoHabitacion.getSelectedItem().toString();
        switch (tipoHabitacion) {
            case "Sensilla":
                System.out.println("habitaciones no disponibles");
                break;
            case "Doble":

                break;
            case "Triple":

                break;

        }


    }//GEN-LAST:event_TipoHabitacionActionPerformed
    /**/

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
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox TipoHabitacion;
    public static javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonRegistro;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldDias;
    private javax.swing.JTextField jTextFieldHab;
    private javax.swing.JTextField jTextFieldNombre;
    public static javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPiso;
    private javax.swing.JTextField jTextFieldTotalPersonas;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
