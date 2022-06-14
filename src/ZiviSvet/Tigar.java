package ZiviSvet;

public  class Tigar extends Zivotinja {

    public Tigar(String vrsta, boolean ugrozeno, boolean otrovno){
        super(vrsta, ugrozeno, otrovno);
    }
    public void spavaj(){
        System.out.println("Tigar spava na otvorenom");
    }
    public  void jedi(){
        System.out.println("Tigar jede sve ");
    }

    public void svrljaj(){
        System.out.println("Tigar lovi");
    }

    public void proizvediZvuk(){
        System.out.println("Tigar rice");
    }


}

