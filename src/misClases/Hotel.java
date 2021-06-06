

package misClases;

import java.util.ArrayList;

public class Hotel {
    private float fianzas;
    private  ArrayList<Huesped> listaHupedes;
    private Habitacion[] CantidadHabitaciones;//fijar los datos de la lista 
    public void llenarHotel(){
        CantidadHabitaciones = new Habitacion[10];//vector de habitaciones cambiar por el numero crrecto 
        CantidadHabitaciones[1].setCosto(200);
        CantidadHabitaciones[1].setNumHabitacion(101);
        CantidadHabitaciones[1].setPiso(1);
        CantidadHabitaciones[1].setTipoHabitacion("lujo");
        //llena todas las demas como las llene aqui 
        //ademas que sean habitaciones diferentes si quieres cambia el nombre de lujo como que no me convence 
        //checa  cauntas habitaciones pide gina por la neta solo hice el vector a lo menso XD
        
        //continia con las 2 y asi hasta que temines el vector
        
        
        
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
