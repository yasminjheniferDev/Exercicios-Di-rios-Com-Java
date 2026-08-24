public class ContarPares {
    public static int contarPares(int[] arr){
    int pares=0;
    for(int n: arr){
            if( n % 2==0) {
                pares++;
            }
        }return pares;


    }
}
