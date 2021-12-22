package figuras;

/**
 * Esta clase recoge la funcionalidad relativa a las circunferencias. Consta de un unico constructor, en el que hay que
 * inidicar el radio la hora de utilizarlo.
 * @author Javier Cordero Álvarez
 */
public class Circunferencia {
    private double radio;
    private String color;

    /**
     * @param radio = Este parámetro representa el radio de la circunferencia.
     */
    public Circunferencia(double radio) {
        this.setRadio(radio);
    }

    /**
     * Imprime el diametro, el color y el y el area de la cirferencia, utilizando 4 decimales de PI como precision
     */
    public void imprimir() {
        color = "rojo";
        System.out.println("Di�metro: " + 2 * getRadio());
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * getRadio() * getRadio();
        System.out.println(area);
    }

    /**
     * Este metodo permite comparar la circunferencia actual con la pasada por parametro en base al radio. Para la
     * comparacion, se utilizan o no decimales, en base al parametro considerarDecimales
     *
     * @param considerarDecimales parametro para decidir si comparar con decimales o no
     * @param otro segunda circunferencia para comparar
     * @return boolean - verdadero si son iguales, falso en cualquier otro caso
     */
    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.getRadio();
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

