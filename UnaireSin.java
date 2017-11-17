import java.lang.Math.*;

public class UnaireSin extends ExpUnaire {

    public UnaireSin(ExpAbstraite valeur) {
	super(valeur);
    }
    
    public double evaluer(Env env) {
	return Math.sin(getValeur().evaluer(env));
    }

    @Override
    public String toStringInfixe() {
	return "sin(" + getValeur().toStringInfixe() + ")";
    }

}
