package Kartice;

public class PlatnaKartica {

    private double suma;
    private String brojKartice;
    private int mesec;
    private int godina;

    public PlatnaKartica(double suma, String brojKartice, int mesec, int godina) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.mesec = mesec;
        this.godina = godina;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

    public void dodajSredstva(double dobitniIznos){
        this.suma =  suma + dobitniIznos;

    }

    public void izvrsiTransakciju(double iznos){
        this.suma = this.suma - iznos;

    }
    public void stampanje(){
        System.out.println( + this.suma + " , " + this.brojKartice + " , " + this.mesec + " , " + this.godina );
    }
}
