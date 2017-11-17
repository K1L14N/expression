public abstract class ExpUnaire extends ExpAbstraite {
    
    private ExpAbstraite operande;

    public ExpUnaire(ExpAbstraite operande) {
	this.operande = operande;
    }

    public ExpAbstraite getValeur() {
	return this.operande;
    }
}
