
package Formas;


public class rectangulo implements calculosFormas {
    
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public rectangulo(double base, double altura, double area, double perimetro) {
        this.base = base;
        this.altura = altura;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public void area() {
        
        area = base * altura;
        System.out.println("El area del rectangulo es " + area);
    }

    @Override
    public void perimetro() {
        
        perimetro = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es de " + perimetro);
        
    }
    
    

 
    
}
