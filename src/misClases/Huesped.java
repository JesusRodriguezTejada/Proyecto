package misClases;

public class Huesped {
    private String nombre;
    private int numHabitacion;
    private int piso;
    private String fechaIngreso;
    private String fechaSalida;
    private int costo;
    private String tipoHabitacion;
    
    
    
    public Huesped(){
    
    }
    
    public Huesped(String nombre, int numHabitacion,int piso, String fechaIngreso,String fechaSalida,int costo, String tipoHabitacion){
        this.nombre = nombre;
        this.numHabitacion=numHabitacion;
        this.piso=piso;
        this.fechaIngreso =fechaIngreso;
        this.fechaSalida= fechaSalida;
        this.tipoHabitacion=tipoHabitacion;
        this.costo = costo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "Huesped{" + "nombre=" + nombre + ", numHabitacion=" + numHabitacion + ", piso=" + piso + '}';
    }
}
