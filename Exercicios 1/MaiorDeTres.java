public static int maiorDetres (int a, int b ,int  c) {
    if (a >= b && a >= c ) {
        return a;
    } else if (b > a && b > c){
        return b;
    } else{
        return c;
    }
}

 public static int Soma(int a, int b, int c) {
    int resultado= a + b + c;
    return resultado;

}

    public static void main (String[]args){
     Scanner sc= new Scanner(System.in);
        System.out.print("digite um numero: ");
     int n1=sc.nextInt();
        System.out.print("digite outro numero: ");
        int n2= sc.nextInt();
        System.out.print("digite mais um numero: ");
        int n3 = sc.nextInt();
        int maior= maiorDetres(n1,n2,n3);
        int soma = Soma(n1,n2,n3);
        System.out.println("O maior número é: " + maior);
        System.out.println("A soma desses números é = " + soma);
    }



