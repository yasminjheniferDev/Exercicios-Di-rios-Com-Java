public class TesteRecursivo1 {
    public static int somaPar(int n){

        if( n ==2) {
            return 2;
        }
             return n + somaPar(n -2);

            }
            public static void main(String[] args) {
                System.out.println(somaPar(8));

    }
        }


