/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misClases;

import controlMySql.MySqlConn;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class PorcentajesOcupacion extends javax.swing.JFrame {

    MySqlConn conn;
    // * Creates new form PorcentajesOcupacion

    public PorcentajesOcupacion(MySqlConn conn) {

        this.conn = conn;
       initComponents();
        graficaBarras();
    }
    
    public PorcentajesOcupacion() {
        initComponents();
        graficaBarras();
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
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        jToggleButton1.setText("atras");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(459, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void graficaBarras(){
        int sencilla=1, triple=1, doble=1;//se fija en un uno por de lo contrario no marca bien las graficas 
        ///coidgo para ver el porsentaje de peronas que ocupan el cada habitacion 
        
        String query = "SELECT * FROM huespedes ";
        this.conn.Consult(query);
       
        Object aux   = new Object() ;
        String aux2 = null,Sen="Sensilla",Do="Doble",Tri="Triple";
        try{
           while (this.conn.rs.next()) {
            //Obtienes la data que necesitas...
               aux=this.conn.rs.getString(6);
               aux2=(String) aux;
               if(aux2.equals(Sen)){
                  sencilla++;
                   
               }
               if(aux2.equals(Do)){  
                    doble++;
                   
               }
               if(aux2.equals(Tri)){
                  triple++;
               }
              
           
        }
        } catch (Exception e){
            System.out.println("eRROR #1...");
        }
        
        
        //codigo que genera la grafica de barras
         DefaultCategoryDataset tabla = new DefaultCategoryDataset();
         tabla.setValue(sencilla, "habitacion", "sencilla");
          tabla.setValue(doble, "habitacion", "doble");
         tabla.setValue(triple, "habitacion", "triple");
         JFreeChart graficador = ChartFactory.createBarChart3D("Total de habitaciones que tiene el hotel", 
         "habitaciones", "hotel", tabla, PlotOrientation.VERTICAL, true, true, false);
         ChartPanel panel = new ChartPanel(graficador);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(500, 500));
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(panel, BorderLayout.NORTH);
        pack();
        repaint();
    }
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
         MenuPrincipal Regresar = new MenuPrincipal();
        Regresar.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PorcentajesOcupacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PorcentajesOcupacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PorcentajesOcupacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PorcentajesOcupacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PorcentajesOcupacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
