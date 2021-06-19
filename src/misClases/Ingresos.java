
package misClases;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ingresos {

    public Ingresos() {
    }
    
    
    public void Comprobante(String nombre) throws IOException{
        
        
        /*******************funcina abajo*************************************/
        File f = new File(nombre);
        FileWriter w = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(w);
        PrintWriter wr = new PrintWriter(bw);
        try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from huespedes");
                ResultSet rs = pst.executeQuery();
                
                
                
                if (rs.next()){
                    wr.write("\n\n\t\tIngresos del hotel \n\n\n");
                    do { 
                    String s = "Sensilla";
                    String d = "Doble";
                    String t = "Triple";
                    String habit = rs.getString(6);
                    int hab$;
                    if(s.equals(habit)){
                        hab$ = 1060;
                    }else if(d.equals(habit)){
                        hab$ = 1500;
                    }else{
                        hab$ = 2050;
                    }
                
                    
                    int peextras = rs.getInt(8);
                    int p$ = peextras * 300;
                    int dias = rs.getInt(10);
                    int d$ = dias * 200; 
                    
                    int ingresos = hab$ + p$ + d$;
                    
                    
                    wr.write(rs.getString(2) + " $" + ingresos + " pesoss \n");
                    
                    } while (rs.next());
                    
                }
                
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al crear el archivo");
            }
        
        /********************funciona arriba********************/
        
        
        /*try {
            
            wr.write("Primer linea");
            wr.append("\nsegunda linea");
            wr.append("\nLinea final");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo");
        }*/
        
        /************************************/
        
        /*File archivo;
        FileWriter escribir;
        PrintWriter p;
        archivo = new File("Ingresos.txt");
        
        
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                
                escribir = new FileWriter(archivo,true);
                p = new PrintWriter(escribir);
                
                try {
                    
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");
                    PreparedStatement pst = cn.prepareStatement("select * from huespedes");
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()){
                        String s = "Sensilla";
                        String d = "Doble";
                        String t = "Triple";
                        String habit = rs.getString(6);
                        int hab$;
                        if(s.equals(habit)){
                            hab$ = 1060;
                        }else if(d.equals(habit)){
                            hab$ = 1500;
                        }else{
                            hab$ = 2050;
                        }

                        int peextras = rs.getInt(8);
                        int p$ = peextras * 300;
                        int dias = rs.getInt(10);
                        int d$ = dias * 200; 

                        int ingresos = hab$ + p$ + d$;

                        p.write("\n\n\t\tIngresos del hotel \n\n\n");
                        p.write(rs.getString(2) + " $" + ingresos + " pesos");



                    }



                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al crear el archivo");
                }
                
                p.close();
                escribir.close();
                
            } catch (IOException ex) {
                
            }
        }*/
        
        /*******************************************/
        
        wr.close();
        bw.close();
    
    }
    
    
    public static void main(String[] args) throws IOException {
        Ingresos ing = new Ingresos();
        ing.Comprobante("Ingresos.txt");
    }

}
