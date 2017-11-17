public abstract class ExpBinaire extends ExpAbstraite {

    private ExpAbstraite opGauche;
    private ExpAbstraite opDroit;

    public ExpBinaire(ExpAbstraite opGauche, ExpAbstraite opDroit) {
	this.opGauche = opGauche;
	this.opDroit = opDroit;
    }

    public ExpAbstraite getOpGauche() {
	return this.opGauche;	
    }

    public ExpAbstraite getOpDroit() {
	return this.opDroit;
    }

    public String toStringInfixe() {
	String s = "(" + opGauche.toStringInfixe() + this.toStringOperateur() + opDroit.toStringInfixe() + ")";
	return s;
    }
    /*l'operateur change en fonction des types, cette methode abstraite est definie dans les classes filles*/

    abstract String toStringOperateur();
}
