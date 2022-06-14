public class VezbanjePetlje {
    public static void main(String[] args) {
        /*FizzBuzz:Napisati program koji za brojeve od 1 do 100 racuna sledece:
        ako je broj deljiv sa 3 i sa 5 ispisuje "fizzbuzz" (plus ispisuje taj broj)
        ako je broj deliv sa 3 ispisuje "fizz" (plus ispisuje taj broj)
        ako je broj deljiv sa 5 izpisuje "buzz" (plus ispisuje taj broj)*/


        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz " + "broj je" + i);
            }
            if (i % 3 == 0) {
                System.out.println("fizz je " + i);
            }
            if (i % 5 == 0) {
                System.out.println("buzz je " + i); }
            else{
                    System.out.println(i);
                }


            }
        }
    }

