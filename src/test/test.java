

package test;

import controlMySql.MySqlConn;
import misClases.Checkin;
import misClases.Checkout;
import misClases.ConsultaOrdenAlfabetico;
import misClases.ConsultaPorHabitacion;
import misClases.ConsultaPorNombre;

public class test {
    MySqlConn objConn=new MySqlConn();
    
    public test(){
       //new Checkin(objConn).setVisible(true);
       //new Checkout(objConn).setVisible(true);
       //new ConsultaPorNombre(objConn).setVisible(true);
        //new ConsultaOrdenAlfabetico(objConn).setVisible(true);
       // new ConsultaPorHabitacion(objConn).setVisible(true);
        
    }
    public void chekin(){
        new Checkin(objConn).setVisible(true);
    }
    public static void main(String[] args) {
        new test();
    }

}
