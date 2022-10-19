
package compañiaTuristica;


public final class hotel4 extends hotel {
    
    private String gym;
    private String nombreRestaurant;
    private double capasidadRestaurant;

    public hotel4() {
    }

    public hotel4(String gym, String nombreRestaurant, double capasidadRestaurant, int habitaciones, int numCamas, double precioHabitacion, int numPisos, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, numCamas, precioHabitacion, numPisos, nombre, direccion, localidad, gerente);
        this.gym = gym;
        this.nombreRestaurant = nombreRestaurant;
        this.capasidadRestaurant = capasidadRestaurant;
    }

    public String isGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public double getCapasidadRestaurant() {
        return capasidadRestaurant;
    }

    public void setCapasidadRestaurant(double capasidadRestaurant) {
        this.capasidadRestaurant = capasidadRestaurant;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public void tipoGym() {
        
        if ("A".equalsIgnoreCase(gym)) {
            
            precioHabitacion = precioHabitacion + 50;
        }else{
            precioHabitacion = precioHabitacion + 30;
        }
    }

    @Override
    public void agregadoRestaurant() {
        
        if (capasidadRestaurant < 30) {
            
            precioHabitacion = precioHabitacion + 10;
            
    } else if (capasidadRestaurant < 30 || capasidadRestaurant > 50){
        
        precioHabitacion = precioHabitacion + 30;
        
    }else{
        
        precioHabitacion = precioHabitacion + 50;
    }
    }

    @Override
    public void precioFinal() {
        
        agregadoRestaurant();
        tipoGym();
        
        precioHabitacion = precioHabitacion + habitaciones;
        
        System.out.println("El preciopor habitacion del hotel " + nombre + " es de " + precioHabitacion);
        
    }
        @Override
    public String toString() {
        
        return "\n" + " hotel4 " +"\n" +
                " gym=" + gym + "\n" +
                " nombreRestaurant=" +nombreRestaurant +"\n" +
                " capasidadRestaurant=" + capasidadRestaurant +"\n" +
                " habitaciones=" + habitaciones + "\n" +
                " numCamas=" + numCamas +"\n" +
                " precioHabitacion=" + precioHabitacion + "\n" +
                " numPisos=" + numPisos + "\n" +
                " nombre=" + nombre + "\n" +
                " direccion=" + direccion + "\n" +
                " localidad=" + localidad + "\n" +
                " gerente=" + gerente +"\n" + 
                "---------------------------------------------------------------------------------------------------------"
                ;
    }

 
  
    
    
    
    
        
}
