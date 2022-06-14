import java.util.Arrays;

public class NizoviZadatak2 {
    public static void main(String[] args) {
        //Napisati program koji racuna  aritmeticku sumu svih elemenata niza, od prvog elementa niza do n gde je
        // n poslednji element niza ... u prevodu niz[0] + niz[1} + niz[2] + ...
        // + niz[n] gde je n poslednji element niza
        int suma = 0;
        int[] nizovi = {5, 10, 15, 20, 25};
        for (int i = 0; i < nizovi.length; i++) {
            suma = nizovi[i] + suma;
            System.out.println(suma);}
            System.out.println("Ukupna suma je " + suma);

        System.out.println("Kraj programa!");
    }

    }



