public class Maior {
    public static void main(String[] args) {
        int[] numeros = {15, 22, 8, 41, 30, 19};
        int maior = 0;

        for (int n : numeros) {
            if (n > 20) {
                System.out.printf("%d:",n);  // imprime cada valor encontrado
                maior++;                 // e também conta
            }
        }
    }
}
