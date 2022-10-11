
package tienda_electrodomesticos;

import java.util.Scanner;


public class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, Double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void crearLavadora() {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("LAVADORA");
        crearElectrodomestico();
        System.out.println("Ingrese la carga de su lavadora");
        this.carga = leer.nextInt();
        
        
    }
    
    public void precioLavarropa() {
        
        super.precioFinal();
        
        if (this.carga < 30 ) {
            
            this.precio = this.precio + 500;
        }
        System.out.println("La lavadora que ordeno con su precio final es");
        System.out.println(color + " " +  consumoEnergetico + " " + peso + " " + precio + " " + carga );
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + color + " " +  consumoEnergetico + " " + peso + " " + precio + " " + carga;
    }
    

  

    

   
    
    
    
}
