
public class SomarArray {
    public static int somarArray(int[] arr) {
        int soma = 0;
        for (int i = 0; i < arr.length; i++) {
            soma += arr[i];
        }
        return soma;
    }

    public static void main(String[] args) {

        int[] array ={1,2,3,4};
        int somatot = somarArray(array);
        System.out.println(somatot);
    }
}






