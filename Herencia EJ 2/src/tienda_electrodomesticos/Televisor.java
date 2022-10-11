
package tienda_electrodomesticos;

import java.util.Scanner;


public class Televisor extends Electrodomestico {
    
    private Double resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(Double resolucion, boolean TDT, Double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
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

   public void crearTele() {
       
       Scanner leer = new Scanner(System.in);

       System.out.println("Televisores");
       crearElectrodomestico();
       System.out.println("que resolucion quiere");
        this.resolucion = leer.nextDouble();
        System.out.println("desea que su tv tenga TDT Y/N");
        String quiero = leer.next();
        this.TDT = quiero.equalsIgnoreCase("Y");
        
        
       System.out.println(color + " " +  consumoEnergetico + " " + peso + " " + precio + " " + TDT + " " + resolucion ); 
   }
   
   public void precioTele() {
       
       super.precioFinal();
       if (this.resolucion > 40) {
           
           this.precio = this.precio * 1.30;
       }
       
       if (this.TDT) {
           
           this.precio = this.precio + 500;
       }
       System.out.println("el televisor que ordeno con su precio final es de");
       System.out.println(color + " " +  consumoEnergetico + " " + peso + " " + precio + " " + TDT + " " + resolucion );
   }

    @Override
    public String toString() {
        return "Televisor" +(color + " " +  consumoEnergetico + " " + peso + " " + precio + " " + TDT + " " + resolucion );
    }
    
    
    
    
    
}
