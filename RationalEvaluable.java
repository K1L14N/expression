public class RationalEvaluable extends Rational implements Evaluable {
    
    private int num;
    private int denom;

    public RationalEvaluable(int num, int denom) {
	super(num, denom);
    }

    public RationalEvaluable(int n) {
	super(n);
    }

    public double evaluer() {
	return this.toDouble();
    }
}
