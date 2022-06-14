package pasta;

import java.util.ArrayList;

public class Pasta {

    public ArrayList<Sastojak> listaSastojka;

    public Pasta() {
        this.listaSastojka = new ArrayList<Sastojak>();
    }


    public void dodajSastojak(Sastojak c){
        this.listaSastojka.add(c);
    }

    public void brisiSastojak(Sastojak sastojak){
       for(int i =0; i < listaSastojka.size(); i++){
           if(listaSastojka.get(i).equals(sastojak)){
               listaSastojka.remove(i);
           }
       }
    }
    public double cenaSastojka(){
        double cena = 0;
        for(int i=0; i < listaSastojka.size(); i++){
        cena= cena + listaSastojka.get(i).getCena();
        }
        return cena;

    }

    public void stampanje(){
        System.out.println("Pasta sa sastojcima je: ");
        for(int i = 0; i< listaSastojka.size(); i++){
            System.out.println(listaSastojka.get(i).getNaziv() + listaSastojka.get(i).getCena());
        }
        System.out.println("Cena paste je " + " " + cenaSastojka() + " .din");

    }

}
