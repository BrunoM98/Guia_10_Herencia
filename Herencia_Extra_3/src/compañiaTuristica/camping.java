
package compañiaTuristica;


public final class camping extends extraHotelero {
   
    private int numCarpas;
    private int numBanios;
    private boolean restaurante;
    private double precioCarpa;

    public camping(int numCarpas, int numBanios, boolean restaurante, double precioCarpa, boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.numCarpas = numCarpas;
        this.numBanios = numBanios;
        this.restaurante = restaurante;
        this.precioCarpa = precioCarpa;
    }

    public int getNumCarpas() {
        return numCarpas;
    }

    public void setNumCarpas(int numCarpas) {
        this.numCarpas = numCarpas;
    }

    public int getNumBanios() {
        return numBanios;
    }

    public void setNumBanios(int numBanios) {
        this.numBanios = numBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
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

    public double getPrecioCarpa() {
        return precioCarpa;
    }

    public void setPrecioCarpa(double precioCarpa) {
        this.precioCarpa = precioCarpa;
    }

    @Override
    public void agregadoPrivado() {
       
        if (privado){
            
            precioCarpa = precioCarpa + 30;
        }else{
            precioCarpa = precioCarpa + 0;
        }
    }
    
    public void agregadoRestaurante() {
        
        if (this.restaurante) {
            precioCarpa = precioCarpa + 40;
        }else{
            precioCarpa = precioCarpa + 10;
        }
    }

    @Override
    public void precioFinal() {
        
        agregadoPrivado();
        agregadoRestaurante();
        
        System.out.println("El precio por carpa en nuestro camping " + nombre + " es de " + precioCarpa);
    }

    @Override
    public String toString() {
        return "\n" + " camping " + "\n" +
                " numCarpas=" + numCarpas + "\n" +
                " numBanios=" + numBanios + "\n" +
                " restaurante=" + restaurante + "\n" +
                " precioCarpa=" + precioCarpa +"\n" +
                " nombre=" + nombre + "\n" +
                " direccion=" + direccion + "\n" +
                " localidad=" + localidad + "\n" +
                " gerente=" + gerente +"\n" +
                "---------------------------------------------------------------------------------------------------------"
                ;
    }
    

            

        
       
   
    

    
    
}
