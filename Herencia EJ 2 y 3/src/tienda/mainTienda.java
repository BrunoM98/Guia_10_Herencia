
package tienda;

import java.util.ArrayList;
import tienda_electrodomesticos.Electrodomestico;
import tienda_electrodomesticos.Lavadora;
import tienda_electrodomesticos.Televisor;


public class mainTienda {

 
    public static void main(String[] args) {
      
       Lavadora va = new Lavadora();
       Televisor t = new Televisor();
       
    ArrayList<Electrodomestico> et = new ArrayList();
    
    Televisor t1 = new Televisor(60d,  true, t.getPrecio(),t.comprobarColor("ROJO") , t.comprobarConsumo('A'), 40);
    Televisor t2 = new Televisor(60d, false,t.getPrecio(), t.comprobarColor("VIOLETA"), t.comprobarConsumo('L'), 10);
    Lavadora l1 = new Lavadora(40,va.getPrecio(),va.comprobarColor("NEGRO"), va.comprobarConsumo('G'), 80);
    Lavadora l2 = new Lavadora(10,va.getPrecio(), va.comprobarColor("AZUL"), va.comprobarConsumo('B'), 25);
    
    et.add(t1);
    et.add(t2);
    et.add(l1);        
    et.add(l2);  
          
      
         t1.precioTele();
         t2.precioTele();
         l1.precioLavarropa();
         l2.precioLavarropa();
         
        double precioLavadora = l1.getPrecio() + l2.getPrecio();
        System.out.println("el precio de las Lavadoras es de");
        System.out.println(precioLavadora);
        
        double precioTele = t1.getPrecio() + t2.getPrecio();
        System.out.println("el precio de los Televisores es de");
        System.out.println(precioTele);
        
        double precioTotal = t1.getPrecio() + t2.getPrecio() + l1.getPrecio() + l2.getPrecio();
        
        System.out.println("El precio total por sus electrodomesticos es de");
        System.out.println(precioTotal);
            }
            
        }
    
    
    
    
        
  

