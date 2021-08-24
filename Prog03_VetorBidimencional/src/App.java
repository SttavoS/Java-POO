public class App {
    public static void main(String[] args) throws Exception {
        int vetorBidimencional[][]; // Declara a um vetor bidimencional

        vetorBidimencional = new int[2][3];
        vetorBidimencional[0][0] = 1;
        vetorBidimencional[0][1] = 2;
        vetorBidimencional[0][2] = 15;
        vetorBidimencional[1][0] = 13;
        vetorBidimencional[1][1] = 12;
        vetorBidimencional[1][2] = 5;

        int vetorBidimencional_2[][] = { {10,11,12}, {20,21,22} };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("vetorBidimencional_1["+i+"]["+j+"] = "+ vetorBidimencional[i] [j]);
                System.out.println("vetorBidimencional_2["+i+"]["+j+"] = "+ vetorBidimencional_2[i] [j]);
            }
        }
    }
}
