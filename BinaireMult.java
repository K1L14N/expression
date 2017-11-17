public class BinaireMult extends ExpBinaire {
    
    public BinaireMult(ExpAbstraite opGauche, ExpAbstraite opDroit) {
	super(opGauche, opDroit);
    }

    public String toStringOperateur() {
	return "*";
    }

    public double evaluer(Env env) {
	return getOpGauche().evaluer(env) * getOpDroit().evaluer(env);
    }

    /*plus besoin de redefinir toStringInfixe ici car on le definit dans la classe mere*/
    // @Override
    // public String toStringInfixe() {
    // 	return "(" + getOpGauche().toStringInfixe() + "*" + getOpDroit().toStringInfixe() + ")";
    // }
}

    
