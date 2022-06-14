package ZivotinjePrimeri;

public class Macka extends Zivotinje{


    public Macka(String ime, String omiljenoJelo, double prosecnaStarost) {
        super(ime, omiljenoJelo, prosecnaStarost);
    }

    @Override
    public void Spavaj() {

    }


    public void spavaj(){
        System.out.println("Macka spava");

    }

    public void jedi(){
        System.out.println("Macka jede granule");

    }

    public void svrljaj(){
        System.out.println("Macka se igra sa konopcem");

    }

    @Override
    public void ProizvediZvuk() {

    }

    public void proizvediZvuk(){
        System.out.println("mjau");
    }
    public void Predi(){
        System.out.println(super.getIme() + "Prede");
    }
}
