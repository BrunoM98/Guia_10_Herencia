
package Edificios;


public abstract class edificio {
    
    protected double ancho;
    protected double alto;
    protected double largo;
    
        public abstract void calcularSuperficie(double ancho , double largo);
        public abstract void calcularVolumen(double ancho, double largo,double alto);

    public edificio() {
    }

    public edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
        
}
