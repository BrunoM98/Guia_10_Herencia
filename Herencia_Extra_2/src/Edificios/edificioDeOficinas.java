
package Edificios;

import java.util.Scanner;


public class edificioDeOficinas extends edificio{

    private int cantDeOficinas;
    private int cantDePersonas;
    private int  numDePisos;

    public edificioDeOficinas(int cantDeOficinas, int cantDePersonas, int numDePisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.cantDeOficinas = cantDeOficinas;
        this.cantDePersonas = cantDePersonas;
        this.numDePisos = numDePisos;
    }

    public edificioDeOficinas() {
        
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
        double total = ancho * largo * ancho;
        System.out.println("El volumen del edificio es de " + total);
    }
    
    public void crearOficinas() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("cuantas oficinas tiene el edificio");
        this.cantDeOficinas = leer.nextInt();
        System.out.println("Cuantos empleados entran por oficina");
        this.cantDePersonas = leer.nextInt();
        System.out.println("Cuantos pisos tiene el edificio");
        this.numDePisos = leer.nextInt();
        System.out.println("Ahora necesitamos las medidas del edificio");
        System.out.println("Ancho");
        this.ancho = leer.nextDouble();
        System.out.println("Altura");
        this.alto = leer.nextDouble();
        System.out.println("Largo");
        this.largo = leer.nextDouble();
        System.out.println("Ahora le pasamos la superficio y el volumen de su edificio");
        
        System.out.println("El edificio tiene una cantidad de oficinas de " + this.cantDeOficinas + " En cada oficina entran " + this.cantDePersonas  + " de persona y la cantidad de pisos del edificio es de "  + this.numDePisos );
    }
    }
    
    

