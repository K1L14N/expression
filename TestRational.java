public class TestRational {
    public static void main(String[] args) {
        Rational r = new Rational(6, 4);
        System.out.println("r = " + r);
        System.out.println("\tas double, r = " + r.toDouble());

        Rational s = new Rational(2);
        System.out.println("s = " + s);

        r.add(s);
        System.out.println("r + s = " + r);
        
        Rational t = new Rational(34, 8);
        System.out.println("t = " + t + " (17/4 if reduced)");
        
        Rational st = Rational.mult(s, t);
        System.out.println("st = " + st + " (17/4 if reduced)");
    }
}