public class Operacoes {
    private float x, y;

    public void media1(float a, float b) {
        x = (a + b) / 2;
        System.out.println("Media 1: " + x);
    }

    public void media2(float a, float b) {
        y = (a * 0.4f) + (b * 0.6f);
        System.out.println("Media 2: " + y);
    }
}
