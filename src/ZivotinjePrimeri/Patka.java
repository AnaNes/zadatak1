package ZivotinjePrimeri;

public class Patka extends Zivotinje {


    public Patka(String ime, String omiljenoJelo, double prosecnaStarost) {
        super(ime, omiljenoJelo, prosecnaStarost);
    }


    public void  Spavaj(){
        System.out.println("Patka spava ");;

    }

    public void jedi(){
        System.out.println("patka jede hleb");

    }

    public void svrljaj(){
        System.out.println("Patka pliva");
    }

    public void ProizvediZvuk(){
        System.out.println("kva kva");

    }


}

