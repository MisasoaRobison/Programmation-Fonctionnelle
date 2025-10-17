// Misasoa ROBISON - 45009085

package org.example.tds.td1;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.*;
//import org.tds.td1.*;



public class Noeud<X extends Sommable<X> & Comparable<X>> implements Arbre<X> {
    private final List <Arbre<X>> fils;
    private X value; //pour le noeud

    public Noeud(List<Arbre<X>> fils){
        if (fils != null)
            this.fils = new ArrayList<Arbre<X>>(fils);
        else this.fils = new ArrayList<Arbre<X>>();
    }
    @Override public int taille(){
        int taille = 0;
        for (Arbre<X> a : fils){
            if (a!=null) taille += a.taille();
        }
        return taille;
    }
    @Override public boolean contient(final X val){
        for (Arbre<X> a : fils){
            if (a.contient(val)) return true;
        }
        return false;
    }
    @Override public Set<X> valeurs(){
        Set<X> ensemble = new HashSet<>();
        if (value != null) ensemble.add(value);
        for (Arbre a : fils){
            if (a!=null) ensemble.addAll(a.valeurs());
        }
        return ensemble;
    }
    @Override public X somme(){
        if (fils.isEmpty()) return null;

        X somme = fils.get(0).somme();
        for (int i=1; i<fils.size(); i++){
            somme = somme.sommer(fils.get(i).somme());
        }
        return somme;
    }

    @Override public X min(){
        if (fils.isEmpty()) return null;

        X minValue = fils.get(0).min();
        for (int i=1; i<fils.size(); i++){
            X current_min = fils.get(i).min();
            if (current_min.compareTo(minValue) < 0){
                minValue = current_min;
            }
        }
        return minValue;
    }
    @Override public X max(){
        if (fils.isEmpty()) return null;

        X maxValue = fils.get(0).max();
        for(int i=1; i<fils.size(); i++){
            X current_max = fils.get(i).max();
            if (current_max.compareTo(maxValue) > 0){
                maxValue = current_max;
            }
        }
        return maxValue;
    }
    /*@Override public Integer max(){
        Integer max = null;
        for (Arbre a : fils){
            Integer m = a.max();
            if (m!=null){
                if (max == null || m > max){
                    max = m;
                } 
            }
        }
        return max;
    }

    @Override public boolean estTrie(){
        Integer previous = null;

        for (Arbre a : fils){
            if (a.estTrie()){
                return false;
            }

            Integer current_min = a.min();
            if(previous != null && current_min != null && previous > current_min){
                return false;
            }

            Integer current_max = a.max();
            if (current_max != null){
                previous = current_max;
            }
        }
        return true;
    }*/
   @Override public boolean estTrie(){
    X lastMax = null;
    for (Arbre<X> a : fils){
        if (!a.estTrie()) return false;

        X current_min = a.min();
        if (lastMax!=null && current_min.compareTo(lastMax)<0){
            return false;
        }
        lastMax = a.max();
    }
    return true;
   }
}