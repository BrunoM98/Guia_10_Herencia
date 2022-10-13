
package Main;

import Formas.circulo;
import Formas.rectangulo;


public class mainFormas {

    
    public static void main(String[] args) {
        
        circulo c = new circulo(8, 60,0,0);
        
        System.out.println("El radio del circulo es de 8 y el diametro es de 60 ");
        
        c.area();
        c.perimetro();
       
        System.out.println("----------------------------------------------------------------------------");
        
        rectangulo r = new rectangulo(910, 40, 0, 0);
        
        System.out.println("La altura del rectangulo es de 40 y su base de 910 ");
        
        r.area();
        r.perimetro();
        
      
       
        
      
        
        
        
        
        
    }
    
}
