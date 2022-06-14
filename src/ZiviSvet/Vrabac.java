package ZiviSvet;

public  class Vrabac extends Zivotinja {

    public Vrabac(String vrsta, boolean ugrozeno, boolean otrovno) {
        super(vrsta, ugrozeno, otrovno);
    }

    public  void spavaj(){
        System.out.println("Vrabac spava na grani ");
    }

    public  void jedi() {
        System.out.println("Vrabac jede mrvice");
    }

    public  void svrljaj(){
        System.out.println("Vrabac seta po parku");
    }

    public  void proizvediZvuk(){
        System.out.println("Vrabac cvrkuce");
    }
}






