package misClases;

public class Huesped {
    public String nombre;
    public String fechaIngreso;
    public String fechaSalida;
    public Habitacion hab;
    private String tipoHabitacion;
    private int numHab;
    private float totalPagar;
    
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    
    public Huesped(){
    
    }
    
    public Huesped(String nombre, String fechaIngreso, String fechaSalida,Habitacion hab){
        this.nombre = nombre;
        this.fechaIngreso =fechaIngreso;
        this.fechaSalida=fechaSalida;
        this.hab=hab;
        
        
    }

    @Override
    public String toString() {
        return "Huesped{" + "nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", hab=" + hab + '}';
    }

    public Habitacion getHab() {
        return hab;
    }

    public void setHab(Habitacion hab) {
        this.hab = hab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    

}
