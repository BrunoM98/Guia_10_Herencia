
package tienda_electrodomesticos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Electrodomestico {
    
    protected double precio = 1000;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
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
    
    public Character comprobarConsumo(char letra) {
        
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            
            this.consumoEnergetico = letra;
            
        }else {
            
            this.consumoEnergetico = 'F';
        }
        return consumoEnergetico;
    }
    
    public String comprobarColor(String color){
        
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            
            this.color=color;
            
        }else {
            
              this.color="blanco";
             
        }
        return this.color;
    }
            
    public void crearElectrodomestico() {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el color que desea ");
        this.color = leer.next();
        System.out.println("Que consumo energetico tiene");
        System.out.println("Los consumos van desde A , B , C , D , E , F");
        this.consumoEnergetico = leer.next().charAt(0);
        System.out.println("y el peso del producto");
        System.out.println("Los pesos que manjeamos son desde 1 a 80");
        this.peso = leer.nextInt();
        comprobarConsumo(consumoEnergetico);
        comprobarColor(color);
        
        
        System.out.println(color + " " +  consumoEnergetico + " " + peso + " " + precio ); 
    } 

    
    
    public Double precioFinal() {
          
       
        switch (consumoEnergetico){
            
            case 'A': this.precio = this.precio + 1000;
            break;
            case 'B': this.precio = this.precio + 800;
            break;
            case 'C': this.precio = this.precio + 600;
            break;
            case 'D': this.precio = this.precio + 500;
            break;
            case 'E': this.precio = this.precio + 300;
            break;
            case 'F': this.precio = this.precio + 100;
            break;
        }
        
            if (this.peso < 19) {
            this.precio = this.precio + 100;
            } else if  (this.peso < 49) {
                 this.precio = this.precio + 500;
            } else if (this.precio <79) {
                this.precio = this.precio + 800;
            } else {
                this.precio = this.precio + 1000;
            }
             return this.precio;   
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
}


