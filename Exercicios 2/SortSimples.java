import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1= sc.nextInt();
        int val2= sc.nextInt();
        int val3= sc.nextInt();
        int[] numeroscrescentes={val1,val2,val3};

        Arrays.sort(numeroscrescentes);

        for( int n : numeroscrescentes){
            System.out.println(n);
        }
        System.out.println();
        System.out.printf("%d%n",val1);
        System.out.printf("%d%n",val2);
        System.out.printf("%d%n",val3);

    }
}
