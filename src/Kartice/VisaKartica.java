package Kartice;

public class VisaKartica extends PlatnaKartica{

    private String imeIprezime;

    public VisaKartica(double suma, String brojKartice, int mesec, int godina, String imeIprezime) {
        super(suma, brojKartice, mesec, godina);
        this.imeIprezime = imeIprezime;
    }



    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public void izvrsiTransakciju (double trosak) {
        double provizija = trosak * 0.018;
        if (provizija < 4) {
            super.izvrsiTransakciju(trosak + 4);
        } else {
            super.izvrsiTransakciju(trosak + provizija);
        }
    }
        public void stampanje() {
            System.out.println(" Visa card ");
            super.stampanje();
            System.out.println(getImeIprezime());
        }




    }

