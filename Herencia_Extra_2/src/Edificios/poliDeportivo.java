
package Edificios;

import java.util.Scanner;


public class poliDeportivo extends edificio {
    
    private String nombre;
    private String tipoDeInstalacion;

    public poliDeportivo(String nombre, String tipoDeInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public  poliDeportivo() {
        
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

    @Override
    public void calcularSuperficie(double ancho, double largo) {
        double total = ancho * largo;
        System.out.println("La superficie del edificio es de " + total);
    }

    @Override
    public void calcularVolumen(double ancho, double largo, double alto) {
        double total = ancho * largo * alto;
        System.out.println("El volumen del edificio es de " + total);
    }
    
    public void crearPolideportivo() {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cual es el nombre del edificio ");
        this.nombre = leer.nextLine();
        System.out.println("Su instalacion esta techada o abierta ");
        System.out.println("Ingrese T/A");
        this.tipoDeInstalacion = leer.nextLine();
        if ("A".equalsIgnoreCase(tipoDeInstalacion)) {
            
            tipoDeInstalacion = "Abierta";
        } else {
            
            tipoDeInstalacion = "Techada";
        }
        System.out.println("Ahora necesitamos las medidas del edificio");
        System.out.println("Ancho");
        this.ancho = leer.nextDouble();
        System.out.println("Altura");
        this.alto = leer.nextDouble();
        System.out.println("Largo");
        this.largo = leer.nextDouble();
        System.out.println("Ahora le pasamos la superficio y el volumen de su edificio");
        
        System.out.println(" El nombre del edificio es " + this.nombre + " y la instalacion es " + this.tipoDeInstalacion );
       
    }

    

    
    
    
    
    
}
