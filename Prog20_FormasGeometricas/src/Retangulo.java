public class Retangulo implements Forma {
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double area() {
        return altura * base;
    }

    public double perimetro() {
        return 2 * (this.altura + this.base);
    }
}
