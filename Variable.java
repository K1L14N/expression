public class Variable extends ExpAbstraite {
    
    private String nom;

    public Variable(String nom) {
	this.nom = nom;
    }

    public String getNom() {
	return this.nom;
    }

    /*une fois arrive au type variable, on va evaluer et retourner la valeur associee au nom*/
    public double evaluer(Env env) {
	return env.obtenirValeur(this.nom);
    }

    public String toStringInfixe() {
	return getNom();
    }

}
