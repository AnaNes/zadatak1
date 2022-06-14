package VezbaZaTest;


import java.util.ArrayList;

public class FacebookPost {
    private String imeIPrezimefbclana;
    private String tekst;
    private ArrayList<Reakcija> reakcije;

    public FacebookPost(String imeIPrezimefbclana, String tekst) {
        this.imeIPrezimefbclana = imeIPrezimefbclana;
        this.tekst = tekst;
        this.reakcije = new ArrayList<Reakcija>();
    }


    public void dodajReakciju (Reakcija r){
        reakcije.add(r);}

    private int prebrojavanje(String tipReakcije){
        int brojac = 0;
        for(int i =0;i < reakcije.size(); i++){
            if(reakcije.get(i).getTipReakcije().equals(tipReakcije)){
                brojac++;
            }
        }
        return brojac;

    }

    public void stampanje(){
        System.out.println(this.imeIPrezimefbclana);
        System.out.println(this.tekst);
        System.out.println("Smajli: " + prebrojavanje("smajli") + "| " + "like: " + prebrojavanje("like")
                + "|" + "srce: " + prebrojavanje("srce"));
    }
}
