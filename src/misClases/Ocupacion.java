
package misClases;

import controlMySql.MySqlConn;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class Ocupacion extends javax.swing.JFrame {

    MySqlConn conn;
    //MySqlConn objConn = new MySqlConn();
    
    
    public Ocupacion(MySqlConn conn) throws SQLException {
        this.conn = conn;
        initComponents();    
    }

    public Ocupacion() {
        initComponents(); 
    }
    
    
        public int ocupacion() throws SQLException {
        int total = 0;
        //  String sql = "SELECT * form  cliente";
        
        //cn.prepareStatement(sql); 
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

        return total;
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonVerOcupacion = new javax.swing.JButton();
        jPanelgrafica = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jButtonVerOcupacion.setText("Ver porcentaje de ocupacion del hotel");
        jButtonVerOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerOcupacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelgraficaLayout = new javax.swing.GroupLayout(jPanelgrafica);
        jPanelgrafica.setLayout(jPanelgraficaLayout);
        jPanelgraficaLayout.setHorizontalGroup(
            jPanelgraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        jPanelgraficaLayout.setVerticalGroup(
            jPanelgraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        jButton1.setText("Atras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelgrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVerOcupacion)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVerOcupacion)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelgrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerOcupacionActionPerformed

        int vacio=0,ocupado=0;
        try {
            ocupado = ocupacion();
        } catch (SQLException ex) {
            Logger.getLogger(Ocupacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        vacio=30-ocupado;
        //tabla
        DefaultPieDataset tabla = new DefaultPieDataset();
        tabla.setValue("Sin ocupar", vacio);
        tabla.setValue("Ocupado", ocupado);
        
        JFreeChart circular = ChartFactory.createPieChart("Porsentaje de ocupacion del hotel", tabla, true, true, false);
        //jPanelgrafica
        ChartPanel panel = new ChartPanel(circular);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,400));
        jPanelgrafica.setLayout(new BorderLayout());
        jPanelgrafica.add(panel,BorderLayout.NORTH);
        
        pack();
        repaint();
    }//GEN-LAST:event_jButtonVerOcupacionActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ocupacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ocupacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ocupacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ocupacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ocupacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonVerOcupacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelgrafica;
    // End of variables declaration//GEN-END:variables
}
