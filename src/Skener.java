import java.util.Scanner;

public class Skener {
    public static void main(String[] args) {
        Scanner ana = new Scanner(System.in);
        System.out.println("Molimo vas unesite jedan broj");
        double x = ana.nextDouble();
        System.out.println("Unesite drugi broj");
         double y = ana.nextDouble();
         System.out.println("Aritmeticka sredina vasa dva broja je " + (x+y) / 2);
    }
}
