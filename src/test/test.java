

package test;

import controlMySql.MySqlConn;
import misClases.Checkin;
import misClases.ConsultaPorNombre;
import misClases.checkout;

public class test {
    MySqlConn objConn=new MySqlConn();
    
    public test(){
       //new Checkin(objConn).setVisible(true);
       //new checkout(objConn).setVisible(true);
       //new ConsultaPorNombre(objConn).setVisible(true);
    }
    public void chek(){
        new Checkin(objConn).setVisible(true);
    }
    public static void main(String[] args) {
        new test();
    }

}
