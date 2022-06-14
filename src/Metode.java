import java.util.Scanner;

public class Metode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite 2 broja");
        int broj1 = sc.nextInt();
        int broj2 = sc.nextInt();
        int zbirBroja = zbir(broj1,broj2);
        System.out.println(zbirBroja);
    }

    public static int zbir(int mojBroj, int mojBroj2) {
        int zbirBroja = mojBroj + mojBroj2;
        return zbirBroja;
    }
}
