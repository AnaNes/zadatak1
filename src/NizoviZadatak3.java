import java.util.Scanner;

public class NizoviZadatak3 {
    public static void main(String[] args) {
        //Napisati program koji izracunava geometrijsku sumu
        // parnih brojeva na neparnim indeksima: niz[0] * niz[1] * ... * niz[n]
        Scanner sc=new Scanner(System.in);

        int[] niz={1,4,5,6,15,};
        int suma = 0;
        for(int i = 0;i <niz.length; i++) {

        if(i%2 !=0 && niz[i]%2 == 0) {
            suma = suma +niz[i];

        }

        }
        System.out.println("Suma brojeva na neparnim pozicijama je: " + suma);
    }
}
