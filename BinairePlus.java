public class BinairePlus extends ExpBinaire {
    
    public BinairePlus(ExpAbstraite opGauche, ExpAbstraite opDroit) {
	super(opGauche, opDroit); /*besoin de preciser les param pour super car il n'y a pas de constructeur sans parametre dans ExpBinaire*/
    }

    public String toStringOperateur() {
	return "+";
    }

    public double evaluer(Env env) {
	return getOpGauche().evaluer(env) + getOpDroit().evaluer(env);
    }

    /* plus besoin de la methode toStringInfixe ici car on le definit dans ExpBinaire*/
    // @Override
    // public String toStringInfixe() {
    // 	return "(" + getOpGauche().toStringInfixe() + "+" + getOpDroit().toStringInfixe() + ")";
    // }
}

    
