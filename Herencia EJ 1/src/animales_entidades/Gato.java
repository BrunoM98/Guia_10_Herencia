
package animales_entidades;


public class Gato extends Animal {
    
    private String color;
    

    public Gato(String color, String nombre, String alimento, int edad, String raza, boolean cola,int cantAlimento) {
        super(nombre, alimento, edad, raza, cola,cantAlimento);
        this.color = color;
    }

    public int getCantAlimento() {
        return cantAlimento;
    }

    public void setCantAlimento(int cantAlimento) {
        this.cantAlimento = cantAlimento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }
    
    public void rudioGato(){
        
        super.ruidoAnimal();
        System.out.println("Gato");
        System.out.println("Miauuuuuuu");
    
}
    
    public void alimentarse(int cantidad) {
        
        System.out.println("cantidad de alimento disponible " + cantAlimento);
        System.out.println("el gato se alimenta 2 veces al dia");
        
        for (int i = 0 ; i < cantidad ; i++) {
            
            cantAlimento -= 20;

        }
        System.out.println("La cantidad de alimento que queda es " + this.cantAlimento);
    }

  

  
    
}
