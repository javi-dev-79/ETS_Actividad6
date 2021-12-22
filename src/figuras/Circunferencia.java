package figuras;

/**
 * Se ha modificado el nombre de la clase "Círculo" a "Circunferencia",
 * y se ha movido dicha clase al paquete figuras.
 * Esta clase recoge la funcionalidad relativa a las circunferencias. Consta de un unico constructor, en el que hay que
 * inidicar el radio la hora de utilizarlo.
 * @author Javier Cordero Álvarez
 */
public class Circunferencia {
    private double radio;
    private String color;

    /**
     * Se ha modificado el nombre del atributo "rad" por "radio".
     * @param radio = Este parámetro representa el radio de la circunferencia.
     */
    public Circunferencia(double radio) {
        this.setRadio(radio);
    }

    /*
     * La variable local "color" se ha convertido en un atributo de la clase
     * y se ha inicializado dentro del método imprimir.
     * Además, se ha extraído la variable "d" y se ha creado la constante "PI".
     * Posteriormente, se han deshecho estos cambios mediante el método "inline"
     */

    /**
     * Imprime el diametro, el color y el y el area de la cirferencia, utilizando 4 decimales de PI como precision
     * @author Javier Cordero Alvarez (javier@gmail.com)
     */
    public void imprimir() {
        color = "rojo";
        System.out.println("Di�metro: " + 2 * getRadio());
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * getRadio() * getRadio();
        System.out.println(area);
    }

    /**
     * Se ha modificado el nombre del parámetro "conDecimales" a "considerarDecimales",
     * y se ha invertido su orden.
     *
     * @param considerarDecimales
     * @param otro segunda circunferencia para comparar
     * @return double
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

    /**
     * @return double - Propiedad radio de la circunferencia
     */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

