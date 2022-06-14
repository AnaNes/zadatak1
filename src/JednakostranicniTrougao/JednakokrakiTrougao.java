package JednakostranicniTrougao;

public class JednakokrakiTrougao {

    private double a; // osnovica
    private double b; // kraci

    public JednakokrakiTrougao(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double obim() {
        return a + b + b;
    }

    public double povrsina() {
        return 0.5 * a * Math.sqrt(( b + 0.5 * a) + (b - 0.5 * a));
    }
}