import java.util.Scanner;

public class TreciCas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj od 1 do 12");
        int broj = sc.nextInt();
        switch (broj) {
            case 1:
                System.out.println("Mesec je Januar");
                break;
            case 2:
                System.out.println("Mesec je Februar");
                break;
            case 3:
                System.out.println("Mesec je Mart");
                break;
            case 4:
                System.out.println("Mesec je April");
                break;
            case 5:
                System.out.println("Mesec je Maj");
                break;
            case 6:
                System.out.println("Mesec je Jun");
                break;
            case 7:
                System.out.println("Mesec je Jul");
                break;
            case 8:
                System.out.println("Mesec je Avgust");
                break;
            case 9:
                System.out.println("Mesec je Septembar");
                break;
            case 10:
                System.out.println("Mesec je oktobar");
                break;
            case 11:
                System.out.println("Mesec je Novembar");
                break;
            case 12:
                System.out.println("Mesec je Decembar");
                break;
            default:
                System.out.println("Niste uneli ispravan broj");
                break;
        }
    }
}
