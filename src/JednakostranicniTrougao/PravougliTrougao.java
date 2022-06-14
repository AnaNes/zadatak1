package JednakostranicniTrougao;


public class PravougliTrougao {
    private double a, b, c;

    public PravougliTrougao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double obim() {
        return a + b + c;
    }

    public double povrsina() {
        return a * b / 2;
    }
}