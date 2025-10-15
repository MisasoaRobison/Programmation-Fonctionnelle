// Misasoa ROBISON - 45009085
package org.tds.td1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.tds.td1.*;
public class Feuille implements Arbre {

    private Integer value;

    public Feuille (Integer value){
        this.value = value;
    }

    @Override public int taille(){
        return 1; //c'est la taille d'une feuille tout simplement
    }
    @Override public boolean contient(final Integer val){
        if(val == null && value == null){
            return true;
        }
        if(val == null  || value == null){
            return false;
        }
        return value.equals(val);
    }
    @Override public Set<Integer> valeurs(){
        if (value == null){
            return new HashSet <> ();
        }
        else{
            return new HashSet<>(Collections.singleton(value));
        }
    }
    @Override public Integer somme(){
        return value;
    }
    @Override public Integer min(){
        return value;
    }
    @Override public Integer max(){
        return value;
    }
    @Override public boolean estTrie(){
        return true;
    }

}