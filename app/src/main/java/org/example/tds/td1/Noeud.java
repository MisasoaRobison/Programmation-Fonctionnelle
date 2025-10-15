// Misasoa ROBISON - 45009085

package org.tds.td1;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import org.tds.td1.*;



public class Noeud implements Arbre {
    private final List <Arbre> fils;
    private Integer value; //pour le noeud

    public Noeud(Integer value, List<Arbre> fils){
        this.value = value;
        this.fils = new ArrayList<>(fils);
    }
    public Noeud(Integer value){
        this.value = value;
        this.fils = new ArrayList <>();
    }
    @Override public int taille(){
        int taille = (value!=null) ? 1:0; //en comptant le noeud courrant
        for (Arbre a : fils){
            if (a!=null) taille += a.taille();
        }
        return taille;
    }
    @Override public boolean contient(final Integer val){
        if (val==null && value == null){
            return true;
        }
        if (value != null && value.equals(val)){
            return true;
        }
        for (Arbre a : fils){
            if (a!=null && a.contient(val)){
                return true;
            }
        }
        return false;
    }
    @Override public Set<Integer> valeurs(){
        Set<Integer> ensemble = new HashSet<>();
        if (value != null) ensemble.add(value);
        for (Arbre a : fils){
            if (a!=null) ensemble.addAll(a.valeurs());
        }
        return ensemble;
    }
    @Override public Integer somme(){
        Integer somme = (value!=null) ? value : 0;
        for (Arbre a : fils){
            somme+=a.somme();
        }
        return somme;
    }
    @Override public Integer min(){
        Integer min = (value!=null) ? value : null;
        for (Arbre a : fils){
            Integer fils_min = a.min();
            min = (fils_min!=null && (min == null || fils_min < min)) ? fils_min : min;
        }
        return min;
    }
    @Override public Integer max(){
        Integer max = (value!=null) ? value : null;
        for (Arbre a : fils){
            Integer fils_max = a.max();
            max = (fils_max!=null && (max==null || fils_max > max)) ? fils_max : max;
        }
        return max;
    }
    @Override public boolean estTrie(){
        for (Arbre a : fils){
            if (a!=null && !a.estTrie()){
                return false;
            }
        }
        Integer current = value; //je vais utiliser pour comparer avec les valeurs pour les fils
        for (Arbre a : fils){
            Integer fils_min = a.min();
            if (current != null && fils_min!=null && fils_min < current){
                return false;
            }
            Integer max = a.max();
            current = (max != null)? max: current;
        }
        return true;
    }

}