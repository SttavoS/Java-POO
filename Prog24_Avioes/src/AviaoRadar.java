public class AviaoRadar extends Aviao {
    private int raioRadar;

    public AviaoRadar() {
        this.raioRadar = (int) (Math.random() * 10000);
        System.out.println("Iniciando com Raio do Radar = " + this.raioRadar);
    }
}
