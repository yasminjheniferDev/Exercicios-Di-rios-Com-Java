import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            double val1= sc.nextDouble();
            double val2 = sc.nextDouble();
            double val3= sc.nextDouble();
            double val4 = sc.nextDouble();
            double val5 = sc.nextDouble();
            double val6 = sc.nextDouble();
            double positivos=0;
            double negativos=0;
            double soma=0;


            if ( val1 > 0){
                positivos++;
                soma+=val1;

            } else {
                negativos++;
            }
            if( val2 > 0){
                positivos++;
                soma+=val2;
            } else {
                negativos++;
            }
            if( val3 > 0){
                positivos++;
                soma+=val3;
            } else{
                negativos++;
            }
            if( val4 > 0){
                positivos++;
                soma+=val4;
            } else{
                negativos++;
            }
            if(val5 > 0){
                positivos++;
                soma+=val5;
            } else{
                negativos++;
            }
            if(val6 > 0){
                positivos++;
                soma+=val6;
            } else {
                negativos++;
            }
            if(val1 == 0 || val2 == 0 || val3 == 0 || val4 == 0 || val5 == 0 || val6  == 0 ){
                System.out.println("invalid");
            }

            System.out.printf( "%d valores positivos%n",(int)positivos);

            if( positivos > 0){
                double media = soma / positivos;
                System.out.println(.1f + media);
            }
        }

    }
}
