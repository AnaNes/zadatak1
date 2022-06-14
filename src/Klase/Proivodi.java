package Klase;

public class Proivodi {

    public String naziv;
    public int cena;
    public String rokTrajanja;


    public Proivodi(String naziv,int cena,String rokTrajanja){
        this.naziv=naziv;
        this.cena=cena;
        this.rokTrajanja=rokTrajanja;
    }

    public void stampanje(){
        System.out.println("Proizvod " + this.naziv + " kosta " + this.cena + " dinara i rok trajanja mu je " + this.rokTrajanja );
    }
}
