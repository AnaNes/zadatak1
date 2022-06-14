package Kartice;

public class GlavnaKartica {
    /*Napravi klasu Platna kartica koja ce imati atribute
suma, broj kartice, mesec i godina
Metodu dodajSredstva koja ce dodavati sredstva za unetu vrednost
Metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna
Metodu koja stampa podatke o kartici u formatu:
7105-1579-5191-6184, 11/2024, $212
Za klasu Platna kartica napraviti samo getere

Napraviti klasu Visa kartica koja nasledjuje klasu Platna kartica
Napraviti atribut ime i prezime za klasu
Geter i seter za atribut
Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.8%
Najmanja provizija je 4$
Implementirati metodu koja stampa karticu u formatu:
Visa card: 7105-1579-5191-6184, 11/2024, $212

Napraviti klasu Master kartica koja nasledjuje klasu Platna kartica
Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.5%
Napraviti metodu odrzavanja racuna koja je 2$
Implementirati metodu koja stampa karticu u formatu:
Master card: 7105-1579-5191-6184, 11/2024, $212

------------------------------------------------------------------------------------------------------------------------------------------
Sve platne kartice na sebi imaju mesec, godinu, broj kartice i sumu. Visa kartica ima jos i ime i prezime.
Napraviti metodu koja moze da dodaje sredstva i da vrsi transakcije. Podaci ne mogu da se podese, mogu samo da se citaju.
Visa kartica ima proviziju od 1.8% transakcije, a minimalna provizija je 4$.
Master kartica ima proviziju od 1.5% transakcije i mesecno odrzavanje kosta 2$.
Kartica treba da prikazuje podatke u formatu:
Tip kartice: broj racuna, mesec/godina, stanje racuna, ime i prezime vlasnika kartice */

    public static void main(String[] args) {
        VisaKartica v1 = new VisaKartica(1000,"5355-2345-234",03,2022,"Ana Nesic");
        v1.stampanje();
        v1.izvrsiTransakciju(200);
        v1.dodajSredstva(300);
        v1.stampanje();

        MasterKartica m1 = new MasterKartica(1000,"233-3444-544", 02,2022);
        m1.stampanje();
        m1.odrzavanjeRacuna();
        m1.stampanje();
        m1.izvrsiTransakciju(250);
        m1.stampanje();
    }

}
