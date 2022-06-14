package ZivotinjePrimeri;

public abstract class Zivotinje {
    private String ime;
    private String omiljenoJelo;
    private double prosecnaStarost;

    public Zivotinje(String ime, String omiljenoJelo, double prosecnaStarost) {
        this.ime = ime;
        this.omiljenoJelo = omiljenoJelo;
        this.prosecnaStarost = prosecnaStarost;
    }
        public abstract void Spavaj();

        public abstract void jedi();

        public abstract void svrljaj();

        public abstract void ProizvediZvuk();




    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getOmiljenoJelo() {
        return omiljenoJelo;
    }

    public void setOmiljenoJelo(String omiljenoJelo) {
        this.omiljenoJelo = omiljenoJelo;
    }

    public double getProsecnaStarost() {
        return prosecnaStarost;
    }

    public void setProsecnaStarost(double prosecnaStarost) {
        this.prosecnaStarost = prosecnaStarost;
    }
}
