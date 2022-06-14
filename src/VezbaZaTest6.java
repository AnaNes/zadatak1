public class VezbaZaTest6 {
    public static void main(String[] args) {


        int[] prviNiz = {1,2,3,4,5,6,7,8,9};
        int drugiNiz[] = new int[3];
        int j=0;
        for(int i=0; i< prviNiz.length; i++){
            if(prviNiz[i]%2 == 0 && j <=2) {
                drugiNiz[j]=prviNiz[i];
                j++;



            }
        }
        System.out.println(drugiNiz[0]);
        System.out.println(drugiNiz[1]);
        System.out.println(drugiNiz[2]);
    }
}
