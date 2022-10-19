
package Puerto;


public class BarcoAMotor extends Barco {
    
        private double potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int matricula, double eslora, String anioFabricacion, double potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    @Override
    public double calcularAlquiler() {
        return ((10*getEslora()) + potenciaCV);
    }
}
