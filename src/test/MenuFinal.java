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
import misClases.ConsultaCostos;
import misClases.ConsultaGaleriaDeImagenes;

import misClases.ConsultaOrdenamiento;
import misClases.ConsultaHabitacion;
import misClases.ConsultaNombre;
import misClases.Login;



import misClases.Ocupacion;


import misClases.PorcentajesOcupacion;


public class MenuFinal {

    MySqlConn objConn = new MySqlConn();

    public static void main(String[] args) {
        new MenuFinal();
    }
    public MenuFinal(){
    
    }
    public void PorcentajesOcupacionHabitacion() {
        new PorcentajesOcupacion(objConn).setVisible(true);
    }

    public void checkin() {
        new Checkin(objConn).setVisible(true);
    }



    public void checkout() {
        new Checkout(objConn).setVisible(true);
    }

    public void  ConsultaPorNom() {
        new ConsultaNombre(objConn).setVisible(true);
    }

    public void ConsultaOrde() {
        new ConsultaOrdenamiento(objConn).setVisible(true);
    }

    public void  consultaCostos() {
        new ConsultaCostos().setVisible(true);
    }

    public void galeria() {
        new ConsultaGaleriaDeImagenes().setVisible(true);
    }

    public  void ConsultaHab() {
        new ConsultaHabitacion(objConn).setVisible(true);
    }

    public void  log() {
           new Login(objConn).setVisible(true);
    }

    public void  ocupacion() {
        new Ocupacion().setVisible(true);
    }

    public  void porcentajesOcupacion() {
        new PorcentajesOcupacion(objConn).setVisible(true);
    }


}
