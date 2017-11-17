import java.util.*;

public class Env {
    
    private Map<String, Double> hm; //classe Double et non type double
    
    public Env() {
	this.hm = new HashMap<String, Double>();
    }
    
    public void associer(String nom, double val) {
	hm.put(nom, val);
    }
    
    public double obtenirValeur(String nom) {
	Double val = hm.get(nom);
	if (val == null) {
	    throw new IllegalArgumentException("Pas de valeur associee pour " + nom);
	}
	return val;
    }
    
    public String toString() {
	String s = new String();
	s += "HashMap : \n";
	Set<Map.Entry<String, Double>> couples = hm.entrySet();
	Iterator<Map.Entry<String, Double>> itCouples = couples.iterator();
	while (itCouples.hasNext()) {
	    Map.Entry<String, Double> couple = itCouples.next();
	    s += "\t" + couple.getKey()
		+ " : " + couple.getValue();
	}
	return s;
    }
    
}

