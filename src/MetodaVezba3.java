public class MetodaVezba3 {

    //napraviti metodu int apsolut(int broj)
    //input: int broj
    //output: int apsolutBroj
    //primer: apsolut(5) -> 5, apsolut(-5) -> 5, apsolut(0) -> 0

    public static void main(String[] args) {
        System.out.println(apsolut(5));
    }

    public static int apsolut(int broj) {
     int apsolutBroj= broj;
     if(apsolutBroj<0){
         apsolutBroj=apsolutBroj * (-1); }

         return apsolutBroj;

         }

     }





