import java.lang.Math.*;

public class UnaireCos extends ExpUnaire {
    
    public UnaireCos(ExpUnaire valeur) {
	super(valeur);
    }
    
    public double evaluer(Env env) {
	return Math.cos(getValeur().evaluer(env));
    }

    @Override
    public String toStringInfixe() {
	return "cos(" + getValeur().toStringInfixe() + ")";
    }

}
