package ZiviSvet;



public abstract class Zivotinja extends ZivoBice {

    public Zivotinja(String vrsta, boolean ugrozeno, boolean otrovno) {
        super(vrsta, ugrozeno, otrovno);
    }

    public abstract void spavaj();

    public abstract void jedi();

    public abstract void svrljaj();

    public abstract void proizvediZvuk();




}




