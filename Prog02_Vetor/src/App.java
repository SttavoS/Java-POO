public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor;

        vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            System.out.println(vetor[i]);
        }
    }
}
