package ZiviSvet;

public abstract class ZivoBice {
    public String vrsta;
    public boolean ugrozeno;
    public boolean otrovno;

    public ZivoBice(String vrsta, boolean ugrozeno, boolean otrovno){
        this.vrsta= vrsta;
        this.ugrozeno=ugrozeno;
        this.otrovno= otrovno;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public boolean isUgrozeno() {
        return ugrozeno;
    }

    public void setUgrozeno(boolean ugrozeno) {
        this.ugrozeno = ugrozeno;
    }

    public boolean isOtrovno() {
        return otrovno;
    }

    public void setOtrovno(boolean otrovno) {
        this.otrovno = otrovno;
    }
}


