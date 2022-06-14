package Automobil;

public class Automobil {

    public String marka;
    public String model;
    public String gorivo;
    public int brojVrata;
    public int godiste;

    /*public Automobil(){

    }*/

    public Automobil(String marka, String model,String gorivo,int brojVrata,int godiste) {
        this.marka=marka;
        this.model=model;
        this.gorivo=gorivo;
        this.brojVrata=brojVrata;
        this.godiste=godiste;
    }
    public void stampanje(){
        System.out.println("Automobil je marke " + this.marka + " model je " + this.model + " koristi "
                        + this.gorivo + " broj vrata mu je " + this.brojVrata + " godiste " + this.godiste);
    }

}
