import java.util.Scanner;

public class CetvrtiCas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Zadatak 1 - Preko skenera uneti tri broja. Prvi broj ce odredjivati funkciju druga dva broja.
        // Ako se unese broj 1 onda druga dva moraju da se saberu, ako se unese 2 onda se od drugog oduzima treci,
        // ako se unese 3 onda se mnoze, ako se unese 4 onda se dele

        System.out.println("Unesite jedan broja");
        int broj1 = sc.nextInt();
        System.out.println("Unesite drugi broj");
        double broj2 = sc.nextDouble();
        System.out.println("Unesite treci broj");
        double broj3 = sc.nextDouble();
        switch (broj1){
            case 1:
                System.out.println("Sabrati drugi i treci broj" + (broj2+broj3));
                break;
            case 2:
                System.out.println("Drugi - treci broj je " + (broj2-broj3));
                break;
            case 3:
                System.out.println("Drugi broj * treci broj je" +(broj2*broj3));
                break;
            case 4:
                System.out.println("Drugi broj / treci broj je "+(broj2/broj3));
                break;
            default:
                System.out.println("Uneli ste pogresan broj");
                break;
        }

    }
}
