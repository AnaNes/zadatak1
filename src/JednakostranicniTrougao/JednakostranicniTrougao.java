package JednakostranicniTrougao;


public class JednakostranicniTrougao extends Trougao {
    private double a;

    public JednakostranicniTrougao(double a) {
        //System.out.println("ovo nece da radi");
        super(a, a, a);// super mora biti prva 'komanda' u child klasi
    }


    public double povrsina() {
        return Math.pow(this.a * Math.sqrt(3) / 2, 2) * Math.sqrt(3) / 2;
    }

}