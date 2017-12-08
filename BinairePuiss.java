import java.lang.Math.*;

public class BinairePuiss extends ExpBinaire {
    
    public BinairePuiss(ExpAbstraite opGauche, ExpAbstraite opDroit) {
	super(opGauche, opDroit);
    }

    public String toStringOperateur() {
	return "^";
    }

    public double evaluer(Env env) {
	return math.pow(getOpGauche().evaluer(env), getOpDroit().evaluer(env));
    }

}

    
