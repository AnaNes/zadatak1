public class VezbanjeZaTest1 {
    public static void main(String[] args) {
        //Zadatak 1) Napraviti niz koji ce sadrzati nazive gradove i treba odstampati sve gradove osim grada "Prag"

        String [] NaziviGradova = {"Beograd","Milano","Prag","London","Nis"};
        for(int i =0; i < NaziviGradova.length; i++) {
            if( NaziviGradova[i] != "Prag") {
                System.out.println(NaziviGradova[i]);
            }
        }



    }
}
