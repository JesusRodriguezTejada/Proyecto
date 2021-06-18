package test;

import static com.sun.corba.se.impl.presentation.rmi.StubConnectImpl.connect;
import static com.sun.jmx.remote.internal.IIOPHelper.connect;
import controlMySql.MySqlConn;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import static javax.management.remote.JMXConnectorFactory.connect;
import static javax.management.remote.JMXConnectorFactory.connect;
import misClases.Checkin;
import misClases.Checkout;
import misClases.ConsultaOrdenAlfabetico;
import misClases.ConsultaPorHabitacion;
import misClases.ConsultaPorNombre;

public class test {

    MySqlConn objConn = new MySqlConn();

    public test() {
        // new Checkin(objConn).setVisible(true);
        //new Checkout(objConn).setVisible(true);
        //new ConsultaPorNombre(objConn).setVisible(true);
        //new ConsultaOrdenAlfabetico(objConn).setVisible(true);
        new ConsultaPorHabitacion(objConn).setVisible(true);
          
    }

    public void chek() {
        new Checkin(objConn).setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }

    public int ocupacion() {
        int x = 0;
       
    
    return x ;

}

}
