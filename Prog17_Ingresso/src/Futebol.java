public class Futebol extends Ingresso {
    private String time1;
    private String time2;
    private String tipo;

    public Futebol(String time1, String time2, String tipo, double valor, String data, String cadeira) {
        super(valor, data, cadeira);
        this.time1 = time1;
        this.time2 = time2;
        this.tipo = tipo;
    }

    public String exibeConfronto() {
        return this.time1 + " X " + this.time2;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
