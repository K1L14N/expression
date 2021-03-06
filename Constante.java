public class Constante extends ExpAbstraite implements Evaluable {
    
    private double valeur;

    public Constante(double valeur) {
	this.valeur = valeur;
    }

    public double getValeur() {
	return this.valeur;
    }

    /*une fois arrive au type variable, on va evaluer et retourner la valeur associee au nom*/
    public double evaluer(Env env) {
	return this.getValeur();
    }

    @Override
    public double evaluer() {
	return this.getValeur();
    }

    public String toStringInfixe() {
	return new String().valueOf(valeur);
    }

}
