import java.util.Scanner;

public class VezbanjeZaTest3 {
    public static void main(String[] args) {
        ////Zadatak 3 - Uneti dvocifren broj i prikazati prvu i drugu cifru
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dvocifren broj");
        int broj= sc.nextInt();

        int a= broj / 10;
        int b= broj %10;

        System.out.println("Prvi broj je " + a + " drugi broj je " + b );


    }
}
