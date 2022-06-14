package pasta;

import java.util.ArrayList;

public class Sastojak {

    /*Kreirati klasu Sastojak koja ima naziv, cenu, getere i setere, konstruktore, metodu za stampanje koja stampa u formatu - naziv - cena.din
Kreirati klasu Pasta koja ima:
listu sastojaka
metodu dodavanja sastojaka
metodu za brisanje sastojaka. U metodu se salje naziv sastojka koji se brise
defaultni konstruktor
metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
metodu za stampu koja stampa podatke u formatu:
Pasta je sa sastojcima:
naziv - cena.din
naziv - cena.din
Cena paste je cena.din*/

    public String naziv;
    public double cena;


    public Sastojak(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void stampanje(){
        System.out.println( this.naziv + "-" + this.cena + " din.");
    }
}
