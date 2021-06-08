

package test;

import controlMySql.MySqlConn;
import misClases.Altas;
import misClases.checkout;

public class test {
    MySqlConn objConn=new MySqlConn();
    
    public test(){
       //new Altas(objConn).setVisible(true);
        new checkout(objConn).setVisible(true);
    }
    public static void main(String[] args) {
        new test();
    }

}
