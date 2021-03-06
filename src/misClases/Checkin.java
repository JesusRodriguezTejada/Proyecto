package misClases;

import controlMySql.MySqlConn;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Checkin extends javax.swing.JFrame {

    MySqlConn conn;
    String numHab="", nombre="", fechaEntrada="", fechaSalida="", tipoHabitacion="", piso="", personas="", personasExtras="", ciudad="", dias="";
    
    public Checkin(MySqlConn conn) {
        this.conn = conn;
        initComponents();
         lleno();
        PisosHotel a = new PisosHotel();
        jTextFieldNumero.setText(a.numHab);
       
    }
    
    
    public Checkin() {
      
        initComponents();  

    }
    
    public  void llenarTextos(){
        this.jTextFieldNombre.setText(nombre);
        this.jTextFieldCiudad.setText(ciudad);
        this.jTextFieldTotalPersonas.setText(personas);
        this.jTextFieldDias.setText(dias);
        this.jTextFieldNumero.setText(numHab);
        this.jTextFieldPiso.setText(piso);
       
    }
    public void lleno(){
        int total=0;
        String query = "SELECT * FROM huespedes ";
           this.conn.Consult(query);
         
        this.conn.Consult(query);
        try{
           while (this.conn.rs.next()) {
            //Obtienes la data que necesitas...
            total++;
        }
        } catch (Exception e){
            System.out.println("eRROR #1...");
        }

        if(total<30){
            System.out.println("habitaciones disponibles");
        }else{
            JOptionPane.showMessageDialog(null, "Hotel lleno");
        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jTextFieldTotalPersonas = new javax.swing.JTextField();
        jTextFieldDias = new javax.swing.JTextField();
        jButtonRegistro = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPiso = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TipoHabitacion = new javax.swing.JComboBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jLabel1.setText("Registro");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Tipo de habitacion:");

        jLabel4.setText("Ciudad de origen:");

        jLabel5.setText("Total de personas:");

        jLabel6.setText("Total de dias que se va quedar ");

        jLabel7.setText("Fecha de ingreso ");

        jTextFieldTotalPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTotalPersonasKeyReleased(evt);
            }
        });

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

        TipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sencilla", "Doble", "Triple" }));
        TipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoHabitacionActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Atras");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Personas extras:");

        jSpinner1.setModel(new javax.swing.SpinnerListModel(new String[] {"0", "1", "2"}));

        jLabel11.setText("cargo extras por noche por pesona ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegistro)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(93, 93, 93)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(164, 164, 164)
                                        .addComponent(jButtonBuscar))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(134, 134, 134)
                                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldDias)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(86, 86, 86)
                                            .addComponent(jTextFieldTotalPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(339, 339, 339)))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldCiudad, jTextFieldDias, jTextFieldNombre, jTextFieldPiso, jTextFieldTotalPersonas});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jButtonBuscar)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTotalPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton1)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonRegistro)
                                .addGap(21, 21, 21))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldCiudad, jTextFieldDias, jTextFieldNombre, jTextFieldPiso, jTextFieldTotalPersonas});

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
        //***************
       
        personasExtras =  (String) this.jSpinner1.getValue();

        //codigo de connicion de registro de MySql
         try{
            String sql = "Insert into huespedes  (NumHab, Nombre,Piso,FechaEntrada,FechaSalida, TipoHabitacion,Personas,PersonasExtras,Ciudad,Dias) values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, numHab);
            pst.setString(2, nombre); 
            pst.setString(3, piso);  
            pst.setString(4, fechaEntrada);
            pst.setString(5, fechaSalida);
            pst.setString(6, tipoHabitacion);
            pst.setString(7, personas);
            pst.setString(8, personasExtras);
            pst.setString(9, ciudad);
            pst.setString(10, dias);

            
            pst.execute();

            
            
            
         JOptionPane.showMessageDialog(null, "Registro exitoso");
           ImprimirComprobante imprimir = new ImprimirComprobante();
            imprimir.setVisible(true);
                       String limite = "";
                      if("Sencilla".equals(tipoHabitacion)){
                      limite = "2";
                        
                    }
                   if("Doble".equals(tipoHabitacion) ){
                      limite = "5" ; 
                    }
                    if("Triple".equals(tipoHabitacion) ){
                      limite = "8" ; 
                    }
                    
                   
            imprimir.jTextAreaComprobante.setText("Nombre: " +nombre+ "\n"
            +"Ciudad de origen: " +ciudad+"\n"
            +"Ingreso: "+fechaEntrada+"\n"
            +"FechaSalida: "+fechaSalida+"\n"
            +"Numero Habitacion: :"+numHab+"\n"
              +"Habitacion: "+tipoHabitacion+"\n"
              +"Limite huespedes:"+limite+"\n"
              +"Personas por habitacion:"+personas+"\n"
              +"Personas Extra :"+personasExtras+"\n"
                    
            
            
            );
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de registro" + e.getMessage());
        }
        
    }//GEN-LAST:event_jButtonRegistroActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:

        nombre = this.jTextFieldNombre.getText();
        tipoHabitacion = (String) this.TipoHabitacion.getSelectedItem();
        ciudad = this.jTextFieldCiudad.getText();
        personas = this.jTextFieldTotalPersonas.getText().trim();
        dias = this.jTextFieldDias.getText().trim();
        numHab = this.jTextFieldNumero.getText().trim();
        piso = this.jTextFieldPiso.getText().trim();
        fechaEntrada = ((JTextField) jDateChooserFecha.getDateEditor().getUiComponent()).getText();
        
       
        personasExtras =  (String) this.jSpinner1.getValue();
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

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
         MenuSistema Regresar = new MenuSistema();
        Regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextFieldTotalPersonasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTotalPersonasKeyReleased
        // TODO add your handling code here:
        String aux =this.TipoHabitacion.getSelectedItem().toString();
        System.out.println(aux);
         String aux2 =this.jTextFieldTotalPersonas.getText();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            int total;
            total=Integer.valueOf(aux2);
            if("Sencilla".equals(aux)){
                if (total<3){
                    System.out.println("Si se pude registrar ");
                }else{
                   JOptionPane.showMessageDialog(null, "cantidad de personas sobre pasado ingrese valor valido menor a 3 ");
                    this.jTextFieldTotalPersonas.setText("");
                }
            }
            if("Doble".equals(aux)){
                if (total<6 ){
                    System.out.println("Si se pude registrar ");
                }else{
                   JOptionPane.showMessageDialog(null, "cantidad de personas sobre pasado ingrese valor valido menor a 6 ");
                    this.jTextFieldTotalPersonas.setText("");
                }
            }
            if("Triple".equals(aux)){
                if (total<9){
                    System.out.println("Si se pude registrar ");
                }else{
                   JOptionPane.showMessageDialog(null, "cantidad de personas sobre pasado ingrese valor valido menor a 9 ");
                    this.jTextFieldTotalPersonas.setText("");
                }
            }
        }
    }//GEN-LAST:event_jTextFieldTotalPersonasKeyReleased
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
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldDias;
    private javax.swing.JTextField jTextFieldNombre;
    public static javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPiso;
    private javax.swing.JTextField jTextFieldTotalPersonas;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
