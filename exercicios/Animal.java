import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caract1 = sc.nextLine();
        String caract2 = sc.nextLine();
        String caract3 = sc.nextLine();
        System.out.println(indentificarAnimal(caract1, caract2, caract3));
    }

    public static String indentificarAnimal(String caract1, String caract2, String caract3) {

        if (caract1.equals("vertebrado") && caract2.equals("ave") && caract3.equals("carnivoro")) {
            return "aguia";
        } else if (caract1.equals("vertebrado") && caract2.equals("ave") && caract3.equals("onivoro")) {
            return "pomba";
        } else if (caract1.equals("vertebrado") && caract2.equals("mamifero") && caract3.equals("onivoro")) {
            return "homem";
        } else if (caract1.equals("vertebrado") && caract2.equals("mamifero") && caract3.equals("herbivoro")) {
            return "vaca";
        } else if (caract1.equals("invertebrado") && caract2.equals("inseto") && caract3.equals("hematofago")) {
            return "pulga";
        } else if (caract1.equals("invertebrado") && caract2.equals("inseto") && caract3.equals("herbivoro")) {
            return "lagarta";
        } else if (caract1.equals("invertebrado") && caract2.equals("anelideo") && caract3.equals("hematofago")) {
            return "sanguessuga";
        } else {
            return "minhoca";
        }
    }
}