package pasta;

public class GlavnaKasa {
    public static void main(String[] args) {
        Sastojak s1 = new Sastojak("Zacin C",200);
        Sastojak s2 = new Sastojak("Kackavalj",500);
        Sastojak s3 = new Sastojak("So", 150);
        Sastojak s4 = new Sastojak("ulje", 200);

        Pasta p1 = new Pasta();
        p1.dodajSastojak(s1);
        p1.dodajSastojak(s2);
        p1.dodajSastojak(s3);
        p1.dodajSastojak(s4);


        p1.brisiSastojak(s1);


        p1.stampanje();

    }
}
