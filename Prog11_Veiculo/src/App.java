import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setPlaca("JCM7C07");
        veiculo1.setAno(2016);

        veiculo1.exibirDados();

        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(new Veiculo("HRS1OTU", 2021));
        listaVeiculos.add(new Veiculo("TPJ8H09", 2014));
        listaVeiculos.add(new Veiculo("IOI1010", 1980));
        listaVeiculos.add(new Veiculo("WJA9988", 2002));

        listaVeiculos.add(new Caminhao("WJA9988", 1994, 6));
        listaVeiculos.add(new Caminhao("WJA9988", 1952, 4));
        listaVeiculos.add(new Caminhao("WJA9988", 2010, 14));

        listaVeiculos.add(new Onibus("WJA9988", 1994, 21));
        listaVeiculos.add(new Onibus("WJA9988", 2004, 25));
        listaVeiculos.add(new Onibus("WJA9988", 2014, 44));

        listaVeiculos.forEach((veiculo) -> {
            veiculo.exibirDados();
        });
    }
}
