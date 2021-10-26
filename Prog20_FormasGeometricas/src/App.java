public class App {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo(6, 15);
        Circulo circulo = new Circulo(15);
        Retangulo retangulo = new Retangulo(5, 8);
        Quadrado quadrado = new Quadrado(4);

        System.out.println("A area do triângulo " + triangulo.area());
        System.out.println("A area do circulo " + circulo.area());
        System.out.println("O diametro do circulo " + circulo.diametro());
        System.out.println("A area do retangulo " + retangulo.area());
        System.out.println("O perimetro do retangulo " + retangulo.perimetro());
        System.out.println("A area do quadrado " + quadrado.area());
        System.out.println("O perimetro do quadrado " + quadrado.perimetro());
    }
}
