package JednakostranicniTrougao;



public class Trougao {
    private double a;
    private double b;
    private double c;


    public Trougao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double obim() {
        return a + b + c;
    }

    public double GetA(){
        return a;
    }
}