import java.util.Scanner;

public class MetodaVezba4 {
    //Zadatak2:
    //napraviti metodu `int stepen(int broj, int n)`
    //input: int broj, int n
    //output: broj "na" n, odnosno, broj^n
    //primer: stepen(2, 3) -> 8, stepen(4, 3) -> 64, stepen(0, 2) -> 0, stepen(3, 0) -> 1, stepen(-1, 3) -> -1
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Upisite broj");
        int broj= sc.nextInt();
        System.out.println("Upisite ceo broj koji ce biti stepen");
        int stepen= sc.nextInt();
        System.out.println(stepen(broj,stepen));


    }
    public static int stepen(int x,int y) {
        int z = 1;
        System.out.println("Broj " + x + " na stepen " + y + " jednak je ");
        for (int i = 1; i <= y; i++) {
            z = z * x;

        }

        return z;
    }




}
