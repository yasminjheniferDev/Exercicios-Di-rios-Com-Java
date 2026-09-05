
public class Gerador20Numeros {
    public static void main(String[] args) {

        //Laço que vai gerar e imprimir apenas 20 números entre 1000 e 1999 + condição de que cada número divido por 11, tenha resto igual a 5.
        int count=0;
            for(int c = 1000;c <=1999 && count < 20;c++){
                if (c % 11 == 5) {
                    System.out.println(c);
                    count++;

                }

            }
        }
    }

