public class Nizovi2 {
    public static void main(String[] args) {
        //Inicijalizovati niz tipa String sa 2 vrednosti, imenom i prezimenom
        //Isprintamo vrednost imena i prezimena
        //Izmeniti prezime osobe
        //Opet isprintamo ime i prezime da vidimo rezultat

        /*String[] ImeiPrezime = new String[2];
        System.out.println("Duzina niza je : " + ImeiPrezime.length);
        ImeiPrezime[0] = "Ana Nesic";
        ImeiPrezime[1] = "Anka Nesic";
        System.out.println(ImeiPrezime[0] + " " + ImeiPrezime[1]);
        ImeiPrezime[0] = "Ana Rogic";
        System.out.println("Novo prezime osobe je : " + ImeiPrezime[0]); */

        String [] PrezimeIme = {"Ana Nesic", "Anka Nesic"};
        System.out.println(PrezimeIme[0] + PrezimeIme[1]);
        PrezimeIme [0] = "Ana Rogic";
        System.out.println("Novo prezime je : " + PrezimeIme[0]);



    }
}
