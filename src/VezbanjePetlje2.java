public class VezbanjePetlje2 {
    public static void main(String[] args) {
        //Ponovi zadatak FizzBuzz ALI umesto od 1 do 100 koristite niz koji cete ucitati u program
        int[] niz={3,5, 6, 8, 10, 16};

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 3 == 0 && niz[i] % 5 == 0) {
                System.out.println("fizzbuzz " + "broj je" + i);
            }
            if (niz[i] % 3 == 0) {
                System.out.println("fizz je " + i);
            }
            if (niz[i] % 5 == 0) {
                System.out.println("buzz je " + niz[i]);
            } else {
                System.out.println(niz[i]);
            }

        }
    }
}

