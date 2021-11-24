public class Aviao {
    protected int cor;
    protected double coordenadaX, coordenadaY;
    
    public Aviao() {
        this.cor = (int)Math.floor(Math.random() * 255);
        this.coordenadaX = Math.floor(Math.random() * 65563);
        this.coordenadaY = Math.floor(Math.random() * 65563);
        System.out.println("Iniciando com Cor = " + this.cor + " e (x,y) = (" + this.coordenadaX + ", " + this.coordenadaY + ")");
    }
}