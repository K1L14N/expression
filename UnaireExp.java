import java.lang.Math.*;

public class UnaireExp extends ExpUnaire {
    
    public UnaireExp(ExpUnaire valeur) {
	super(valeur);
    }
    
    public double evaluer(Env env) {
	return Math.exp(getValeur().evaluer(env));
    }

    @Override
    public String toStringInfixe() {
	return "exp(" + getValeur().toStringInfixe() + ")";
    }

}
