import java.util.ArrayList;

public class Lista1 {
    public static void main(String[] args) {
        ////Zadatak 1 - Kreirati listu namirnica iz prodavnice, dodeliti vrednosti,
        // odstampati sve vrednosti, zatim obrisati drugi i cetvrti clan pa ponovo odstampati listu

        ArrayList namirniceIzProdavnice =new ArrayList<>();
        namirniceIzProdavnice.add("Kafa");
        namirniceIzProdavnice.add("Sladoled");
        namirniceIzProdavnice.add("Mleko");
        namirniceIzProdavnice.add("Caj");

        for(int i = 0; i <namirniceIzProdavnice.size(); i++){
            System.out.println("Namirnice su  " + namirniceIzProdavnice.get(i));
        }

        namirniceIzProdavnice.remove("Sladoled");
        namirniceIzProdavnice.remove("Caj");
        System.out.println("Namirnice su sada  " + namirniceIzProdavnice.size());
        for(int i = 0; i < namirniceIzProdavnice.size(); i++)
            System.out.println(" Namirnice su " +namirniceIzProdavnice.get(i));



    }
}
