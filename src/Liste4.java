import java.util.ArrayList;

public class Liste4 {
    public static void main(String[] args) {
        //Zadatak 2 - Napraviti listu (nedefinisanog tipa) koja ce se zvati "recenica".
        // U tu listu po ovom redosledu dodeliti clanove: voli, 3, Milovana, Ana
      //odstampati listu
        //nakon toga zameniti redosled i odstampati listu da ona glasi Ana voli Milovana
       //Za stampanje napraviti posebnu metodu


        ArrayList  recenica= new ArrayList<>();
        recenica.add("voli");
        recenica.add(3);
        recenica.add("Milovana");
        recenica.add("Ana");


        stampanje(recenica);
        recenica.remove(1);

        Object rezervacija= recenica.get(0);
        recenica.set(0,recenica.get(2));
        recenica.set(2,recenica.get(1));
        recenica.set(1,rezervacija);
        stampanje(recenica);
    }

    public static void stampanje(ArrayList srce) {
        for (int i=0; i< srce.size(); i++){
            System.out.println(srce.get(i));
        }
        System.out.println("---------");
    }
}
