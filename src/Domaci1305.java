import com.sun.imageio.plugins.jpeg.JPEGStreamMetadataFormat;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Domaci1305 {

    //Napisati funkciju koja od korisnika prikuplja njegove najdraze pesme, kao rezultat vrtatiti niz tih
    //pesama (niz String-ova). Od korisnika najpre traziti koliko pesama zeli da unese
    public static void main(String[] args) {


        System.out.println("Lista najdrazih vasih pesama je " + Arrays.toString(nizPesama()));


    }
    public static String [] nizPesama() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Unesite broj pesama");
        System.out.println("Unesite naziv pesme");
        int brojPesama= sc.nextInt();
        String [] pesme=new String[brojPesama];
        for(int i = 0; i <brojPesama; i++) {
            System.out.println("Unesite vasu " +(i+1) + "Najdrazu pesmu");
            pesme[i]=sc.nextLine();

        }

        return pesme;
    }
}
