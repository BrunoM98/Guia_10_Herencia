
package Main;

import compañiaTuristica.alojamiento;
import compañiaTuristica.camping;
import compañiaTuristica.hotel4;
import compañiaTuristica.hotel5;
import compañiaTuristica.residencia;
import java.util.ArrayList;
import java.util.Scanner;


public class MainAlquiler {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        hotel4 h4 = new hotel4("A", "La Marchie", 50, 80, 150, 50, 15, "Olimpus", "Nueva Guinea", "Molcajete", "Bruno Mazziero");
        hotel4 h42 = new hotel4("A", "Sepukku", 50, 90, 210, 50, 15, "Tragoron", "Autralia", "Mosanbique", "Melvin sark");
        hotel5 h5 =new hotel5("A", "Pez Globo", 35, 5, 8, 4, 90, 95, 50, 8, "Continente", "Margarita", "Holanda", "Anonimo");
        camping c = new camping(10, 5, true, 20, true, 600, "Kaikawaka", "Laggon", "Lago Kaikawaka", "Robert de Niro");
        residencia r = new residencia(33, false, true, 30, false,800, "Minera", "este", "Arizona", "Jenkis Low");
        residencia r2 = new residencia(33, false, true, 30, true,800, "Loptic", "marle", "Washinton", "Marcus crown");
        
     ArrayList<alojamiento> a = new ArrayList<>();
     
     a.add(h4);
     a.add(h5);
     a.add(c);
     a.add(r);
     a.add(r2);
     a.add(h42);
     
       
        
        boolean enCurso = true;
        do{
        System.out.println("============ SISTEMA DE ALQUILER ============");
        System.out.println("Scoelecciones su hospedaje : ");
        System.out.println("1) Alojamientos \n2) Precios de los hoteles \n3) Campings con restaurante \n4) Residencias con descuento \n5) Salir");
        System.out.println("Ingrese la opcion que desea");
        int op = leer.nextInt();

            switch (op){

                case 1:
                    System.out.println(a);
                    break;
                case 2:
                    System.out.println("Eestos son los precios de los hoteles");
                  h5.precioFinal();
                  h42.precioFinal();
                  h4.precioFinal();
                    break;
                case 3:
                    if(c.isRestaurante()){
                        System.out.println("Los Camping con restaurante son");
                        System.out.println(c.getNombre());
                    } else{
                        System.out.println("no tenemos Camping con restaurantes");
                    }
                    break;
                case 4:
                    if(r.isDescuento()) {
                        System.out.println("Las residencias con descuento son ");
                        System.out.println(r.getNombre());
                        r.precioFinal();
                    }else if (r2.isDescuento()) {
                        System.out.println(r2.getNombre());
                        r2.precioFinal();
                    }else{
                        System.out.println("no tenemos residencias con descuento");
                    }
                    break;
                case 5:
                    enCurso = false;
                    break;
                    
            }

        }while(enCurso);
    }
}
