public class ExpressionEvaluable implements Evaluable {

    private ExpAbstraite expAb;
    private Env env;

    public ExpressionEvaluable(ExpAbstraite expAb, Env env) {
	this.expAb = expAb;
	this.env = env;
    }

    public ExpAbstraite getExpAbstraite() {
	return this.expAb;
    }

    public Env getEnv() {
	return this.env;
    }

    @Override  //permet d'appeler la methode toString de l'expression abstraite lors du test interface evaluable
    public String toString() {
	return this.getExpAbstraite().toString();
    }

    @Override
    public double evaluer() {
	return this.getExpAbstraite().evaluer(this.getEnv());
    }
}
