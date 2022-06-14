import java.util.Scanner;

public class Domaci2604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu");
        int godina = sc.nextInt();
        if((godina % 4 == 0 && godina % 100 !=0) || (godina % 4 == 0)) {
            System.out.println("Godina " + godina + " je prestupna"); }
            else {
                System.out.println("Godina " + godina + " nije prestupna");
            }

        }





    }

