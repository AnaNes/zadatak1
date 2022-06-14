package ZiviSvet;

import java.util.ArrayList;

public class Ekosistem {
    public static void main(String[] args) {
        Zivotinja a1 = new Vrabac("ptica", true,false);
        Zivotinja a2 = new Tigar("sisar", true, false) ;
        Biljka b1 = new Lala("dvorisno cvece",false,false,"lala","Tulip",false);
        Biljka b2 = new Suncokret("poljsko cvece",false,false,"Suncokret","Helianthus annuus",false);


        ArrayList<Zivotinja> listaZivotinja = new ArrayList<>();
        listaZivotinja.add(a1);
        listaZivotinja.add(a2);

        ArrayList<Biljka> listaBiljaka= new ArrayList<>();
        listaBiljaka.add(b1);
        listaBiljaka.add(b2);

        for(Zivotinja a : listaZivotinja){
            if(a instanceof Vrabac){
                System.out.println("Vrabac je vrste " + a.vrsta );
            }
            if(a instanceof Tigar){
                System.out.println("Tigar je vrsta " + a.vrsta);
            }

            if(a.ugrozeno){
                System.out.println("Ugrozena je vrsta");
            }
            else{
                System.out.println("nije ugrozena vrsta");
            }
            if(a.otrovno){
                System.out.println("Otrovna je vrsta");
            }
            else{
                System.out.println("Nije otrovna vrsta ");
            }
            a.spavaj();
            a.jedi();
            a.svrljaj();
            a.proizvediZvuk();
        }

    }






}
