

package misClases;

import java.util.ArrayList;


public class Hotel {
    private float fianzas;
    private  ArrayList<Huesped> listaHupedes;
    private Habitacion[] CantidadHabitaciones;//fijar los datos de la lista 
    
    public Habitacion[] llenarHotel(){
        float sen=1060,dob=1500,triple=2050;
        CantidadHabitaciones = new Habitacion[30];//vector de habitaciones
        //1
        CantidadHabitaciones[1].setCosto(sen);
        CantidadHabitaciones[1].setNumHabitacion(100);
        CantidadHabitaciones[1].setPiso(1);
        CantidadHabitaciones[1].setTipoHabitacion("Sencilla");
        //2 
        CantidadHabitaciones[2].setCosto(sen);
        CantidadHabitaciones[2].setNumHabitacion(101);
        CantidadHabitaciones[2].setPiso(1);
        CantidadHabitaciones[2].setTipoHabitacion("Sencilla");
        //3
        
        CantidadHabitaciones[3].setCosto(sen);
        CantidadHabitaciones[3].setNumHabitacion(102);
        CantidadHabitaciones[3].setPiso(1);
        CantidadHabitaciones[3].setTipoHabitacion("Sencilla");
        //4  
        CantidadHabitaciones[4].setCosto(sen);
        CantidadHabitaciones[4].setNumHabitacion(103);
        CantidadHabitaciones[4].setPiso(1);
        CantidadHabitaciones[4].setTipoHabitacion("Sencilla");
        //5
        CantidadHabitaciones[5].setCosto(sen);
        CantidadHabitaciones[5].setNumHabitacion(104);
        CantidadHabitaciones[5].setPiso(1);
        CantidadHabitaciones[5].setTipoHabitacion("Sencilla");
        //6
        CantidadHabitaciones[6].setCosto(dob);
        CantidadHabitaciones[6].setNumHabitacion(105);
        CantidadHabitaciones[6].setPiso(1);
        CantidadHabitaciones[6].setTipoHabitacion("Doble");
        //7
        CantidadHabitaciones[7].setCosto(dob);
        CantidadHabitaciones[7].setNumHabitacion(106);
        CantidadHabitaciones[7].setPiso(1);
        CantidadHabitaciones[7].setTipoHabitacion("Doble");
        //8
        CantidadHabitaciones[8].setCosto(dob);
        CantidadHabitaciones[8].setNumHabitacion(107);
        CantidadHabitaciones[8].setPiso(1);
        CantidadHabitaciones[8].setTipoHabitacion("Doble");
        //9
        CantidadHabitaciones[9].setCosto(dob);
        CantidadHabitaciones[9].setNumHabitacion(108);
        CantidadHabitaciones[9].setPiso(1);
        CantidadHabitaciones[9].setTipoHabitacion("Doble");
        //10
        CantidadHabitaciones[10].setCosto(dob);
        CantidadHabitaciones[10].setNumHabitacion(109);
        CantidadHabitaciones[10].setPiso(1);
        CantidadHabitaciones[10].setTipoHabitacion("Doble");
        //11
        CantidadHabitaciones[11].setCosto(triple);
        CantidadHabitaciones[11].setNumHabitacion(110);
        CantidadHabitaciones[11].setPiso(1);
        CantidadHabitaciones[11].setTipoHabitacion("Triple");
        //12
        CantidadHabitaciones[12].setCosto(triple);
        CantidadHabitaciones[12].setNumHabitacion(111);
        CantidadHabitaciones[12].setPiso(1);
        CantidadHabitaciones[12].setTipoHabitacion("Triple");
        //13
        CantidadHabitaciones[13].setCosto(triple);
        CantidadHabitaciones[13].setNumHabitacion(112);
        CantidadHabitaciones[13].setPiso(1);
        CantidadHabitaciones[13].setTipoHabitacion("Triple");
        //14
        CantidadHabitaciones[13].setCosto(sen);
        CantidadHabitaciones[13].setNumHabitacion(113);
        CantidadHabitaciones[13].setPiso(1);
        CantidadHabitaciones[13].setTipoHabitacion("Sencilla");
        //15
        CantidadHabitaciones[15].setCosto(sen);
        CantidadHabitaciones[15].setNumHabitacion(114);
        CantidadHabitaciones[15].setPiso(1);
        CantidadHabitaciones[15].setTipoHabitacion("Sencilla");
        //16
        CantidadHabitaciones[16].setCosto(dob);
        CantidadHabitaciones[16].setNumHabitacion(115);
        CantidadHabitaciones[16].setPiso(2);
        CantidadHabitaciones[16].setTipoHabitacion("Doble");
        //17
        CantidadHabitaciones[17].setCosto(dob);
        CantidadHabitaciones[17].setNumHabitacion(116);
        CantidadHabitaciones[17].setPiso(2);
        CantidadHabitaciones[17].setTipoHabitacion("Doble");
        //18
        CantidadHabitaciones[18].setCosto(dob);
        CantidadHabitaciones[18].setNumHabitacion(117);
        CantidadHabitaciones[18].setPiso(2);
        CantidadHabitaciones[18].setTipoHabitacion("Doble");
        //19
        CantidadHabitaciones[19].setCosto(dob);
        CantidadHabitaciones[19].setNumHabitacion(118);
        CantidadHabitaciones[19].setPiso(2);
        CantidadHabitaciones[19].setTipoHabitacion("Doble");
        //20
        CantidadHabitaciones[20].setCosto(dob);
        CantidadHabitaciones[20].setNumHabitacion(119);
        CantidadHabitaciones[20].setPiso(2);
        CantidadHabitaciones[20].setTipoHabitacion("Doble");
        //21
        CantidadHabitaciones[21].setCosto(dob);
        CantidadHabitaciones[21].setNumHabitacion(120);
        CantidadHabitaciones[21].setPiso(2);
        CantidadHabitaciones[21].setTipoHabitacion("Doble");
        //22
        CantidadHabitaciones[22].setCosto(triple);
        CantidadHabitaciones[22].setNumHabitacion(121);
        CantidadHabitaciones[22].setPiso(2);
        CantidadHabitaciones[22].setTipoHabitacion("Triple");
        //23
        CantidadHabitaciones[23].setCosto(triple);
        CantidadHabitaciones[23].setNumHabitacion(122);
        CantidadHabitaciones[23].setPiso(2);
        CantidadHabitaciones[23].setTipoHabitacion("Triple");
        //24
        CantidadHabitaciones[24].setCosto(triple);
        CantidadHabitaciones[24].setNumHabitacion(123);
        CantidadHabitaciones[24].setPiso(2);
        CantidadHabitaciones[24].setTipoHabitacion("Triple");
        //25
        CantidadHabitaciones[25].setCosto(triple);
        CantidadHabitaciones[25].setNumHabitacion(124);
        CantidadHabitaciones[25].setPiso(2);
        CantidadHabitaciones[25].setTipoHabitacion("Triple");
        //26
        CantidadHabitaciones[26].setCosto(triple);
        CantidadHabitaciones[26].setNumHabitacion(125);
        CantidadHabitaciones[26].setPiso(2);
        CantidadHabitaciones[26].setTipoHabitacion("Triple");
        //27
        CantidadHabitaciones[27].setCosto(triple);
        CantidadHabitaciones[27].setNumHabitacion(126);
        CantidadHabitaciones[27].setPiso(2);
        CantidadHabitaciones[27].setTipoHabitacion("Triple");
        //28
        CantidadHabitaciones[28].setCosto(dob);
        CantidadHabitaciones[28].setNumHabitacion(127);
        CantidadHabitaciones[28].setPiso(2);
        CantidadHabitaciones[28].setTipoHabitacion("Doble");
        //29
        CantidadHabitaciones[29].setCosto(sen);
        CantidadHabitaciones[29].setNumHabitacion(128);
        CantidadHabitaciones[29].setPiso(2);
        CantidadHabitaciones[29].setTipoHabitacion("Sencilla");
        //30
        CantidadHabitaciones[30].setCosto(sen);
        CantidadHabitaciones[30].setNumHabitacion(129);
        CantidadHabitaciones[30].setPiso(2);
        CantidadHabitaciones[30].setTipoHabitacion("Sencilla");
        
        return CantidadHabitaciones;
    }

    public float getFianzas() {
        return fianzas;
    }

    public void setFianzas(float fianzas) {
        this.fianzas = fianzas;
    }

    public ArrayList<Huesped> getListaHupedes() {
        
        
        return listaHupedes;
    }

    public void setListaHupedes(ArrayList<Huesped> listaHupedes) {
       
          listaHupedes = new ArrayList<Huesped>();
          // rellenar la ArrayList
          
          
           this.listaHupedes = listaHupedes;
    }

    
}
