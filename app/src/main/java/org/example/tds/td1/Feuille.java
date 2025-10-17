// Misasoa ROBISON - 45009085
package org.example.tds.td1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.*;


//import org.tds.td1.*;
public class Feuille <X extends Sommable<X> & Comparable<X>> implements Arbre <X>{

    private X value;

    public Feuille(X value){
        this.value = value;
    }

    @Override public int taille(){
        return (value != null)?1:0; //c'est la taille d'une feuille tout simplement
    }
    @Override public boolean contient(final X val){
        return value.equals(val);
    }
    @Override public Set<X> valeurs(){
        if (value == null){
            return new HashSet <> ();
        }
        else{
            return new HashSet<>(Collections.singleton(value));
        }
    }
    @Override public X somme(){
        return value;
    }
    @Override public X min(){
        return value;
    }
    @Override public X max(){
        return value;
    }
    @Override public boolean estTrie(){
        return true;
    }

}