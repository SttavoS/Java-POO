public class Circulo implements Forma{
    private double raio;
    private final double PI = 3.14159265359;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double area() {
        return this.PI * Math.pow(this.raio, 2);
    }

    public double diametro() {
        return 2 * this.raio;
    }
}
