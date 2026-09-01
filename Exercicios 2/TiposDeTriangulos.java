package ExerciciosBeecroodJava;

import java.util.Arrays;
import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double[] array = {x, y, z};
        Arrays.sort(array);
        double A = array[2];
        double B = array[1];
        double C = array[0];
        if (A >= B + C) {
            System.out.printf("NAO FORMA TRIANGULO%n");
        } else if (Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C, 2))){
            System.out.printf("TRIANGULO RETANGULO%n");
        } else if (Math.pow(A,2) > (Math.pow(B,2) + Math.pow(C,2))){
            System.out.printf("TRIANGULO OBTUSANGULO%n");
        }else {
            System.out.printf("TRIANGULO ACUTANGULO%n");
        }
        if( A == B &&  B == C ){
            System.out.printf("TRIANGULO EQUILATERO%n");
        } else if( A == B || A == C || B == C ){
            System.out.printf("TRIANGULO ISOSCELES%n");
        }

        }
    }

