import java.util.Scanner;

public class Domaci12804 {
    public static void main(String[] args) {
        //Program koji racuna minimum od n ucitanih celih brojeva, gde je n > 0 dati prirodan broj
        Scanner sc=new Scanner(System.in);
        System.out.print("Upisite duzinu niza ");
        int min;
        int duzinNiza=sc.nextInt();
        int nizA[]=new int[duzinNiza];

        for(int i=0; i<duzinNiza; i++){


            System.out.println( "Uneli ste broj :");
            nizA[i]=sc.nextInt();
        }
        min=nizA[0];
        for(int i=0; i<duzinNiza; i++){
            if(min>nizA[i]){{

                min=nizA[i];}
            }
        }
        System.out.print("Najmanji broj je "+min);




    }
}






