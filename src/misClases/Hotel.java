

package misClases;

import java.util.ArrayList;

public class Hotel {
    private float fianzas;
    private  ArrayList<Huesped> listaHupedes;
    private Habitacion[] numHabitaciones;//fijar los datos de la lista 

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

    public Habitacion[] getNumHabitaciones() {
        return numHabitaciones;
        
    }

    public void setNumHabitaciones(Habitacion[] numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
}
