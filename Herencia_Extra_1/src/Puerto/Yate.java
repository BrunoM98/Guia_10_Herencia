
package Puerto;


public class Yate extends Barco{
    
       private double potenciaCV;
    private int numeroCamarote;

    public Yate() {
    }

    public Yate(int matricula, double eslora, String anioFabricacion, double potenciaCV, int numeroCamarote) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarote = numeroCamarote;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumeroCamarote() {
        return numeroCamarote;
    }

    public void setNumeroCamarote(int numeroCamarote) {
        this.numeroCamarote = numeroCamarote;
    }

    @Override
    public double calcularAlquiler() {
        return ((10*getEslora()) + potenciaCV + numeroCamarote);
    }
}
