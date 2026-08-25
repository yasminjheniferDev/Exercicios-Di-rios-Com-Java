import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
       double A = teclado.nextDouble(); //BASE
       double B = teclado.nextDouble(); //BASE
       double C = teclado.nextDouble();//ALTURA
        double pi = 3.14159;
       double areaT = (A * C)/2;
       double areaC= pi * Math.pow(C,2);
       double areaTra= (A + B) * C /2;
       double areaQ= Math.pow(B,2);
       double areaR= A * B;
        System.out.printf("TRIANGULO: %.3f\n",areaT);
        System.out.printf("CIRCULO: %.3f\n",areaC);
        System.out.printf("TRAPEZIO: %.3f\n",areaTra);
        System.out.printf("QUADRADO: %.3f\n",areaQ);
        System.out.printf("RETANGULO: %.3f\n",areaR);




    }
}
