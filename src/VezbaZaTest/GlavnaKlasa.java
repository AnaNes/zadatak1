package VezbaZaTest;

public class GlavnaKlasa {

    /*Kreirati klasu Reakcija koja ima tip reakcije (smajli, like, srce), ime i prezime korisnika koji je reagovao, getere, setere i konstruktore.
Kreirati klasu FacebookPost koja ima:
ime i prezime korisnika koji je stavio objavu
tekst objave
listu reakcija
metodu reaguj, koja dodaje reakciju u listu
privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
metodu stampaj koja stampa info o postu u formatu:

Dragoljub Boranijasevic
Test ce biti u cetvrtak
smajli 10 | like 15 | srce 2

Iz glavne klase instancirati par reakcija i postova i ispisati info o postovima*/

    public static void main(String[] args) {
        Reakcija r1 = new Reakcija("Like", "Ana Nesic");
        Reakcija r2 = new Reakcija("Smajli", "Strahinja Rogic");
        Reakcija r3 = new Reakcija("Srce","Gordana Cvetkovic");

        FacebookPost f1 = new FacebookPost("Dunja Stankovic","Dodji na pivo");
        f1.dodajReakciju(r1);
        f1.dodajReakciju(r2);
        f1.dodajReakciju(r3);

        f1.stampanje();
    }
}
