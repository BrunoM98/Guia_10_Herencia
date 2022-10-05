
package animales;

import animales_entidades.Caballo;
import animales_entidades.Gato;
import animales_entidades.Perro;


public class Animales {

   
    public static void main(String[] args) {
      
        Gato g = new Gato("Naranja", "Pipo", "Wiskas", 8, "Egipcia", true,1000);
        Perro p = new Perro("Blaco", "Tyson", "Ken L", 7, "Husky", true,1000);
        Caballo c = new Caballo(true, "Asmodeus","Eno", 10, "Pura", true,1000);
        
        
        g.rudioGato();
        g.alimentarse(2);
        
        System.out.println("-------------------------------------------------");
        
        p.ruidoPerro();
        p.alimentarse(4);
        
        System.out.println("-------------------------------------------------");
        
        c.ruidoCaballo();
        c.alimentarse(6);
    }
    
}
