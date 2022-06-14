package Kartice;

public class MasterKartica extends PlatnaKartica{

    public MasterKartica(double suma, String brojKartice, int mesec, int godina) {
        super(suma, brojKartice, mesec, godina);
    }

    public void izvrsiTransakciju(double trosak) {
        double provizija = trosak * 0.015;
        super.izvrsiTransakciju(trosak + provizija);
    }

    public void odrzavanjeRacuna(){
        super.izvrsiTransakciju(2);
    }

    public void stampanje(){
        System.out.println("Master card:");
        super.stampanje();
        System.out.println(" ");
    }
}
