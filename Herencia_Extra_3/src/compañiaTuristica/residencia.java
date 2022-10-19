
package compañiaTuristica;


public final class residencia extends extraHotelero {
    
    private int numHabitaciones;
    private boolean descuento;
    private boolean campoDeportivo;
    private double precioHabitacion;

    public residencia(int numHabitaciones, boolean descuento, boolean campoDeportivo, double precioHabitacion, boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.numHabitaciones = numHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
        this.precioHabitacion = precioHabitacion;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
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

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public void agregadoPrivado() {
          if (privado){
            
            precioHabitacion = precioHabitacion + 30;
        }else{
            precioHabitacion = precioHabitacion + 0;
        }
    }
    
    public void descuento(){
        
        if (descuento) {
            System.out.println("Si tenemos descuentos para gremios es del 30%");
            precioHabitacion = precioHabitacion - (precioHabitacion * 0.3);       
    }else{
            System.out.println("No hacemos descuento agremios");
        }
}
    
    public void campoDeporte() {
        
        if (campoDeportivo) {
           precioHabitacion = precioHabitacion + 10;
        }else{
           precioHabitacion = precioHabitacion + 5;
        }
    }

    @Override
    public void precioFinal() {
        
       agregadoPrivado();
       campoDeporte();
       descuento();
       
        System.out.println("El precio por habitacion de nuestra residencia " + nombre + " es de " + precioHabitacion);
    }

    @Override
    public String toString() {
        return "\n" + " residencia " + "\n" +
                " numHabitaciones=" + numHabitaciones + "\n" +
                " descuento=" + descuento + "\n" +
                " campoDeportivo=" + campoDeportivo +"\n" +
                " precioHabitacion=" + precioHabitacion + "\n" +
                " nombre=" + nombre + "\n" +
                " direccion=" + direccion + "\n" +
                " localidad=" + localidad + "\n" +
                " gerente=" + gerente +"\n" +
                "---------------------------------------------------------------------------------------------------------"
                ;
    }
    
    
}

