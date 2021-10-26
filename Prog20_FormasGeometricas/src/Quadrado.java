public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return Math.pow(this.lado, 2);
    }

    public double perimetro() {
        return this.lado * 4;
    }
}
