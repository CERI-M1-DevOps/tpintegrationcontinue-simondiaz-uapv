package liste;

public class Noeud {
    private Object element;
    private Noeud suivant;

    /**
     * Description de la méthode
     * @param e Entier qui est la "valeur" du noeud
     * @param suivant Noeud qui est le noeud suivant
     */
    public Noeud(int e, Noeud suivant) {
        element = e;//
        this.suivant = suivant;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * Description de la méthode
     * @return me noeud suivant, cependant il peut etre null
     */
    public Noeud getSuivant() {
        return suivant;
    }

    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    public String toString() {
        return "Noeud(" + element + ")";
    }
}
