
package Main;

import Edificios.edificio;
import Edificios.edificioDeOficinas;
import Edificios.poliDeportivo;
import java.util.ArrayList;


public class mainEdificio {

  
    public static void main(String[] args) {
      
        poliDeportivo pd = new poliDeportivo();
        edificioDeOficinas od = new edificioDeOficinas();
        
        ArrayList<edificio> e = new ArrayList<>();
        
        poliDeportivo pd1 = new poliDeportivo();
        poliDeportivo pd2 = new poliDeportivo();
        edificioDeOficinas od1 = new edificioDeOficinas();
        edificioDeOficinas od2 = new edificioDeOficinas();
        
        e.add(pd1);
        e.add(od2);
        e.add(od1);
        e.add(pd2);
        
        for (edificio aux : e) {
            if (aux instanceof poliDeportivo){
                poliDeportivo object = (poliDeportivo) aux ;
                pd1.crearPolideportivo();
                pd1.calcularVolumen(pd1.getAncho(),pd1.getLargo(), pd1.getAlto());
                pd1.calcularSuperficie(pd1.getAncho(), pd1.getLargo());
                pd2.crearPolideportivo();
                pd2.calcularVolumen(pd2.getAncho(), pd2.getLargo(), pd2.getAlto());
                pd2.calcularSuperficie(pd2.getAncho(), pd2.getLargo());
                continue;
                
        } 
            if(aux instanceof edificioDeOficinas ) {
                
                edificioDeOficinas object = (edificioDeOficinas) aux ;
                od1.crearOficinas();
                od1.calcularSuperficie(od1.getAncho(), od1.getLargo());
                od1.calcularVolumen(od1.getAncho(), od1.getLargo(), od1.getAlto());
                od2.crearOficinas();
                od2.calcularSuperficie(od2.getAncho(), od2.getLargo());
                od2.calcularVolumen(od2.getAncho(), od2.getLargo(), od2.getAlto());
                break;
            }
    }
        
        for (edificio object : e) {
            
            System.out.println(object);
            
        }
}
}