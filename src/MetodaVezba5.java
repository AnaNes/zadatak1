public class MetodaVezba5 {
    //Zadatak3:
    //napraviti metodu `String obrniString(String s)`
    //input: String s
    //output: String sObrnuto
    //primer: obrniString("cao") -> "oac", obrniString("naravno") -> "onvaran", obrniString("ana") -> "ana"
    public static void main(String[] args) {
        String s="Vise";
        System.out.println(obrniString());

    }
  public static String obrniString(){
      String s = "Dokle";
      String obrnuto= "";
      char a;
      for(int i =0; i<s.length();i++){
          a=s.charAt(i);
          obrnuto= a+obrnuto;
      }



        return obrnuto;
  }

}
