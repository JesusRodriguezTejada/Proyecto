

package misClases;

public class Habitacion {
    private int numHabitacion;
    private int piso;
    private String tipoHabitacion;
    private float costo;
    private float servicioAlCuarto;
    private float servicioBar;
    private float servicioTintoreria;
    private float servicioSPA;
    private float servicioDeNinera;
    private boolean ocupada;
    
    
    public Habitacion(){
    
    }
    public Habitacion(int numHabitacion,int piso,String tipoHabitacion,float costo,float servicioAlCuarto,
      float servicioBar,float servicioTintoreria,float servicioSPA,float servicioDeNinera,boolean ocupada){
        
        this.costo=costo;
        this.numHabitacion=numHabitacion;
        this.piso=piso;
        this.tipoHabitacion=tipoHabitacion;
        this.servicioAlCuarto=servicioAlCuarto;
        this.servicioBar=servicioBar;
        this.servicioTintoreria=servicioTintoreria;
        this.servicioSPA=servicioSPA;
        this.servicioDeNinera=servicioDeNinera;
        this.ocupada=ocupada;
        
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numHabitacion=" + numHabitacion + ", piso=" + piso + ", tipoHabitacion=" + tipoHabitacion + ", costo=" + costo + ", servicioAlCuarto=" + servicioAlCuarto + ", servicioBar=" + servicioBar + ", servicioTintoreria=" + servicioTintoreria + ", servicioSPA=" + servicioSPA + ", servicioDeNinera=" + servicioDeNinera + '}';
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

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getServicioAlCuarto() {
        return servicioAlCuarto;
    }

    public void setServicioAlCuarto(float servicioAlCuarto) {
        this.servicioAlCuarto = servicioAlCuarto;
    }

    public float getServicioBar() {
        return servicioBar;
    }

    public void setServicioBar(float servicioBar) {
        this.servicioBar = servicioBar;
    }

    public float getServicioTintoreria() {
        return servicioTintoreria;
    }

    public void setServicioTintoreria(float servicioTintoreria) {
        this.servicioTintoreria = servicioTintoreria;
    }

    public float getServicioSPA() {
        return servicioSPA;
    }

    public void setServicioSPA(float servicioSPA) {
        this.servicioSPA = servicioSPA;
    }

    public float getServicioDeNinera() {
        return servicioDeNinera;
    }

    public void setServicioDeNinera(float servicioDeNinera) {
        this.servicioDeNinera = servicioDeNinera;
    }
    
  
    
}
