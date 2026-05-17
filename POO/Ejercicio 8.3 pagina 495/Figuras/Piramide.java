package Figuras;

/**
 * Esta clase denominada Piramide es una subclase de FiguraGeométrica
 * que cuenta con una base, una altura y un apotema.
 * @version 1.2/2020
 */

public class Piramide extends FiguraGeometrica {

    /* Atributo que identifica la base de una pirámide */
    private double base;

    /* Atributo que identifica la altura de una pirámide */
    private double altura;

    /* Atributo que identifica el apotema de una pirámide */
    private double apotema;

    /**
     * Constructor de la clase Piramide
     * @param base Parámetro que define la base de una pirámide
     * @param altura Parámetro que define la altura de una pirámide
     * @param apotema Parámetro que define el apotema de una pirámide
     */
    public Piramide(double base, double altura, double apotema) {

        this.base = base;
        this.altura = altura;
        this.apotema = apotema;

        /* Calcula el volumen y establece su atributo */
        this.setVolumen(calcularVolumen());

        /* Calcula la superficie y establece su atributo */
        this.setSuperficie(calcularSuperficie());
    }

    /**
     * Método para calcular el volumen de una pirámide
     * @return El volumen de una pirámide
     */
    public double calcularVolumen() {

        double volumen = (Math.pow(base, 2.0) * altura) / 3.0;

        return volumen;
    }

    /**
     * Método para calcular la superficie de una pirámide
     * @return La superficie de una pirámide
     */
    public double calcularSuperficie() {

        double areaBase = Math.pow(base, 2.0);

        double areaLado = 2.0 * base * apotema;

        return areaBase + areaLado;
    }
}