

public class ContemNumero {
    public static boolean contemnumero(int[] arr, int numero) {
        for (int n : arr) {
            if (n == numero) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int [] arr= {4, 9, 15, 22};
        int numero= 4;

        System.out.println(ContemNumero.contemnumero( arr,numero));



    }
}
