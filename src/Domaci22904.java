import java.util.Scanner;

public class Domaci22904 {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.println("Koliko clanova ima niz");
        int n = skener.nextInt();
        String[] nizA = new String[n];
        double[] cena = new double[n];
        double min;
        double max;
        for (int i = 0; i < n; i++) {
            System.out.println("upisi naziv " + (i + 1) + " prizvoda :");
            nizA[i] = skener.next();


        }
        for (int i = 0; i < n; i++) {
            System.out.println("upisi " + (i + 1) + " cenu prozivoda :");
            cena[i] = skener.nextDouble();
        }
        min = cena[0];
        max = cena[0];

        for (int i = 0; i < n; i++) {
            if (min > cena[i]) {
                {
                    min = cena[i];


                }

            }
        }

        for (int i = 0; i < n; i++) {
            if (max < cena[i]) {
                {
                    max = cena[i];

                }
            }
        }


        System.out.println("Minimalna cena je " + min);

        System.out.println("Maksimalna cena je " + max);
    }
    }
