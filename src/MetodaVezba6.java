public class MetodaVezba6 {
    //Zadatak4:
    //napraviti metodu `boolean palindrom(String s)`
    //input: String s
    //output: boolean isPalindrom
    //primer: palindrom("cao") -> false, palindrom("anavolimilovana") -> true */
    public static void main(String[] args) {
        System.out.println(palindrom("ana"));
    }

    public static boolean palindrom(String s){
      boolean isPalindrom= true;

      for(int i = 0; i <s.length(); i++){
          if(s.charAt(i) != s.charAt(s.length() - i -1 )){
              isPalindrom= false;
              break;
          }
      }

        return isPalindrom;
    }
}
