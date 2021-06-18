
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
import javax.swing.JOptionPane;

public class Ingresos {
    
    public void Comprobante(String nombre) throws IOException{
        File f = new File(nombre);
        FileWriter w = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(w);
        PrintWriter wr = new PrintWriter(bw);
        /********************************/
        try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");
                PreparedStatement pst = cn.prepareStatement("select * from huespedes");
                ResultSet rs = pst.executeQuery();
                
                /*Date date = new Date();
                DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");*/
                
                
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
                    
                    wr.write("\n\n\t\tIngresos del hotel \n\n\n");
                    wr.write("Nombre: " + rs.getString(2) + " $" + ingresos + " pesos");
                    /*documento.add(new Paragraph("Nombre del huesped: " + rs.getString(1)));
                    documento.add(new Paragraph("Ciudad de origen: " + rs.getString(3)));
                    documento.add(new Paragraph("Fecha de ingreso: " ));
                    documento.add(new Paragraph("Fecha de salida: " ));
                    documento.add(new Paragraph("Tipo de habitacion: " + rs.getString(2)));*/
                }
                
                
                        
                /*if (rs.next()) {
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                    } while (rs.next());
                    documento.add(tabla);
                }*/
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al crear el archivo");
            }
        
        /****************************************/
        
        
        /*try {
            
            wr.write("Primer linea");
            wr.append("\nsegunda linea");
            wr.append("\nLinea final");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo");
        }*/
        
        wr.close();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        Ingresos ing = new Ingresos();
        ing.Comprobante("Ingresos.txt");
    }
}
