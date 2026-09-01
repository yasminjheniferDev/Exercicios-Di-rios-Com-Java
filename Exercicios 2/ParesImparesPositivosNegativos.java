import java.util.Scanner;

public class ParesImparesPositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int val1= sc.nextInt();
            int val2= sc.nextInt();
            int val3=sc.nextInt();
            int val4= sc.nextInt();
            int val5= sc.nextInt();
            int positivos=0;
            int negativos=0;
            int pares=0;
            int impares=0;
            int nulo=0;

            // condição positivos e negativos//

            if(val1 > 0 ){
                positivos++;
            } else if(val1 ==0){
                nulo++;
            } else {
                negativos++;
            }
            if( val2 > 0 ){
                positivos++;
            } else if( val2 ==0){
                nulo++;
            } else {
                negativos++;
            }
            if(val3 > 0 ){
                positivos++;
            } else if( val3 ==0){
                nulo++;
            } else {
                negativos++;
            }
            if(val4 > 0 ){
                positivos++;
            } else if(val4 ==0){
                nulo++;
            } else{
                negativos++;
            }
            if(val5 > 0 ){
                positivos++;
            } else if(val5 ==0){
                nulo++;
            }else{
                negativos++;
            }

            if(val1 % 2 ==0) {
                pares++;
            } else  {
                impares++;
            }
            if(val2 % 2 ==0){
                pares++;
            } else{
                impares++;
            }
            if(val3 % 2 ==0){
                pares++;
            } else {
                impares++;
            }
            if(val4 % 2 ==0){
                pares++;
            } else{
                impares++;
            }
            if(val5 % 2 ==0){
                pares++;
            } else{
                impares++;
            }

            System.out.printf("%d valor(es) par(es)%n",pares);
            System.out.printf("%d valor(es) impar(es)%n",impares);
            System.out.printf("%d valor(es) positivo(s)%n",positivos);
            System.out.printf("%d valor(es) negativo(s)%n",negativos);
        }

    }
}
