
package Formas;


public class circulo implements calculosFormas {
    
    private double radio;
    private double diametro;
    private double areaR;
    private double perimetro;
    
    static final double PI = 3.1415;

    public circulo(double radio, double diametro, double area, double perimetro) {
        this.radio = radio;
        this.diametro = diametro;
        this.areaR = area;
        this.perimetro = perimetro;
    }

    public circulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return areaR;
    }

    public void setArea(double area) {
        this.areaR = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
  
    @Override
    public void area() {
        
          this.areaR = PI * (this.radio * this.radio);
        
        System.out.println("El area del circulo es de " + areaR);
    }

    @Override
    public void perimetro() {
        
        this.perimetro = PI * diametro;
        System.out.println("El perimetro del circulo es de " + perimetro);
        
    }
    
    

  
}
