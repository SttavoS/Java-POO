public class EntradaDados {
    public static void main(String[] args) {
        byte vetorTexto[] = new byte[200];
        int bytesLidos = 0;

        System.out.println("Escreva algo: ");

        try {
            bytesLidos = System.in.read(vetorTexto);
            System.out.println("Você escreveu: ");
            System.out.write(vetorTexto, 0, bytesLidos);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
