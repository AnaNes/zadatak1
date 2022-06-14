import java.util.Scanner;

public class TreciCas3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bacite kockicu");
        int kocka1 = sc.nextInt();
        System.out.println("Koje je boje kockica?");
        String kocka2 = sc.next();

        if (kocka1 == 1 && kocka2.equals("plava")) {
            System.out.println("Dobili ste 1 poen");
        } else if (kocka1 == 1 && kocka2.equals("crvena")) {
            System.out.println("Dobili ste 2 poena");
        } else if (kocka1 == 2 && kocka2.equals("plava")) {
            System.out.println("Dobili ste 2 poena");
        } else if (kocka1 == 2 && kocka2.equals("crvena")) {
            System.out.println("Dobili ste 4 poena");
        } else if ((kocka1 == 3 || kocka1 == 4 || kocka1 == 5 || kocka1 == 6) && kocka2.equals("plava")) {
            System.out.println("Dobili ste 10 poena");
        } else if ((kocka1 == 3 || kocka1 == 4 || kocka1 == 5 || kocka1 == 6) && kocka2.equals("crvena")) {
            System.out.println("Dobili ste 20 poena");
        } else {
            System.out.println("Uneli ste pogresnu boju i/ili broj na kockici");
        }


    }
}















