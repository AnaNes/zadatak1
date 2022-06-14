import java.util.Scanner;

public class TreciCas1 {
    public static void main(String[] args) {

        //Zadatak 1 - Preko skenera uneti ime, pol i broj godina. Ako je korisnik maloletan
        // treba se ispisati odgovarajuca poruka. Ako je korisnik muskog pola potrebno je ispisati poruku "Gospodine "
        // + ime, a ako je zenskog pola treba ispisati poruku "Gospodjo " +

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime");
        String ime = sc.next();
        System.out.println("Unesite pol: -muski -zenski");
        String pol = sc.next();
        System.out.println("Unesite broj godina");
        int brojGodina = sc.nextInt();

        if (brojGodina < 18){
        System.out.println("Korisnik je maloletan"); }
        if (pol.equals("muski")) {
            System.out.println("Gospodine " + ime ); }
            else if (pol.equals("zenski")) {
                System.out.println("Gospodjo " + ime );}



    }
}
