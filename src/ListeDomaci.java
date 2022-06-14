import java.util.ArrayList;
import java.util.Scanner;

public class ListeDomaci {
    //Napisati metodu koja vraca ArrayList-u vasih omiljenih zivotinja, unos vrsiti preko Scanner-a.
    //Napraviti drugu metodu koja stampa sadrzaj liste. Napraviti metodu
    //public static ArrayList<String> dodaj(ArrayList<String> listaZaDodavanje, String nazivZivotinije)
    //koja dodaje datu zivotinju u listu.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Moje omiljene zivotinje su ");
        ArrayList<String> omiljeneZivotinje=new ArrayList<>();
        omiljeneZivotinje.add(sc.next());
        omiljeneZivotinje.add(sc.next());
        omiljeneZivotinje.add(sc.next());


        listaZaDodavanje(omiljeneZivotinje);




    }

    public static void listaZaDodavanje( ArrayList nazivZivotinja){
        for(int i =0; i < nazivZivotinja.size(); i++){
            System.out.println(nazivZivotinja.get(i));
        }

    }
}
