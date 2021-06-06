

package test;

import controlMySql.MySqlConn;
import misClases.Altas;

public class test {
    MySqlConn objConn=new MySqlConn();
    
    public test(){
        new Altas(objConn).setVisible(true);
    }
    public static void main(String[] args) {
        new test();
    }

}
