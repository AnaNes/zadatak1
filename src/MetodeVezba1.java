public class MetodeVezba1 {
    public static void main(String[] args) {
        //napravi metodu koja prima kao parametar String a vraca kao rezultat broj reci u datom string-u.
        String recenica = "Ana je trudna!";

        int duzinaRecenice= racunajBrojReci(recenica);
        System.out.println("Duzina recenice je " + duzinaRecenice);
        }
     public static int racunajBrojReci(String recenica){
        return recenica.split(" ").length;
    }
}
