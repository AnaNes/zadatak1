import java.util.Scanner;

public class CetvrtiCas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        for (x = 0; x <5; x++) {
        System.out.println("Unesite neki broj");}
        x = sc.nextInt();
        if (x == 0) {
            System.out.println("Bingo!");

        }
    }
}
