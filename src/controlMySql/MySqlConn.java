

package controlMySql;

import java.sql.Connection;//interface
import java.sql.DriverManager;//clase
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;//interface
import java.sql.ResultSet;//interface
import javax.swing.JOptionPane;

public class MySqlConn {
    public Statement stmt = null;
    public  ResultSet rs= null;
    public Connection conn=null;
     Connection conectar=null;
    ResultSet resultado= null;

    public MySqlConn(){
        //Conectar con mysql...
        try {
            //cargando el driver
            Class.forName("com.mysql.jdbc.Driver");

            String connectionUrl =
                            "jdbc:mysql://localhost/hotel?"
                            +"user=root&password=";

            // conexion con la bd
            conn = DriverManager.getConnection(connectionUrl);
        } catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());
        } catch (ClassNotFoundException cE) {
            System.out.println("Class Not Found Exception: "+
                    cE.toString());
        }
    }
    public void Consult(String query){
        //information_schema
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query); //envia una consulta devuelve un objeto ResultSet para su implementacion
            if (rs!=null) {
                rs = stmt.getResultSet(); //obtiene los resultados
                //se coloca sobre el primer registro
                rs.first();
            }
        }
        catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("Error: " + ex.getErrorCode());
        }
    }
    
    
    
    public int Update(String query){
        //information_schema
        int rModif=0;
        try {
            stmt = conn.createStatement();
             rModif= stmt.executeUpdate(query);
        }
        catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("Error: " + ex.getErrorCode());
        }
        return rModif;
    }
public Connection MySqlConn1(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //conectar = DriverManager.getConnection("jdbc:mysql://localhost/pruebafechasjgfr","root","");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/Hotel?"
                            +"user=root&password=");
            
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de Conexion" + e.getMessage());
        }
        return conectar;
    }

    public void closeRsStmt(){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException sqlEx) { } // ignore
            rs = null;
        }
        if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore
                stmt = null;
         }
    }
    
    public void closeConnection() {
         try {
               if (conn!=null)  conn.close();
            } catch (SQLException sqlEx) { } // ignore
            rs = null;
    }
    public void ocupacion(){
        int x = 0;
        int total = 0;
        try {
            while (rs.next()) {
                //Obtienes la data que necesitas...
                total++;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("total");
        //return total;
        
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
