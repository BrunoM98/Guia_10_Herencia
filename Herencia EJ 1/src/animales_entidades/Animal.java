
package animales_entidades;


public class Animal {
    
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;
    protected boolean cola;
    protected int cantAlimento;
   

    public Animal(String nombre, String alimento, int edad, String raza, boolean cola,int cantAlimento) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
        this.cola = cola;
        this.cantAlimento = cantAlimento;
        
    }
    
    public void ruidoAnimal(){
        
         System.out.println("Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + ", cola=" + cola + ", cantidad de alimento= " + cantAlimento +'}');
         
        System.out.println("el ruido que hace el");
    }
    
    
    
    

    
    
    
    
    
}
