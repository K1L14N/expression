import java.util.*;

public class Env {
    
    // previous to q6 private Map<String, Double> hm; //classe Double et non type double
    private HashMap<String, Evaluable> hm;

    public Env() {
	this.hm = new HashMap<String, Evaluable>();
    }
    
    public void associer(String nom, Evaluable val) {
	hm.put(nom, val);
    }
    
    public double obtenirValeur(String nom) {
	Evaluable val = hm.get(nom);
	if (val == null) {
	    throw new IllegalArgumentException("Pas de valeur associee pour " + nom);
	}
	return val.evaluer();
    }
    
    public String toString() {
	String s = new String();
	s += "HashMap : \n";
	Set<Map.Entry<String, Evaluable>> couples = hm.entrySet();
	Iterator<Map.Entry<String, Evaluable>> itCouples = couples.iterator();
	while (itCouples.hasNext()) {
	    Map.Entry<String, Evaluable> couple = itCouples.next();
	    s += "\t" + couple.getKey()
		+ " : " + couple.getValue();
	}
	return s;
    }
    
}

