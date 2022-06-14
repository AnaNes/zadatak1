package ZiviSvet;

public  class Biljka extends ZivoBice {

    public String narodniNaziv;
    public String latinskiNaziv;
    public boolean lekovita;

    public Biljka(String narodniNaziv, boolean ugrozeno, boolean otrovno, String latinskiNaziv, String vrsta, boolean lekovita){
        super ( vrsta , ugrozeno,otrovno);
        this.narodniNaziv=narodniNaziv;
        this.latinskiNaziv=latinskiNaziv;
        this.lekovita= lekovita;
    }

    public String getNarodniNaziv() {
        return narodniNaziv;
    }

    public void setNarodniNaziv(String narodniNaziv) {
        this.narodniNaziv = narodniNaziv;
    }

    public String getLatinskiNaziv() {
        return latinskiNaziv;
    }

    public void setLatinskiNaziv(String latinskiNaziv) {
        this.latinskiNaziv = latinskiNaziv;
    }

    public boolean isLekovita() {
        return lekovita;
    }

    public void setLekovita(boolean lekovita) {
        this.lekovita = lekovita;
    }
}
