// Misasoa ROBISON - 45009085

package org.tds.td1;

import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import org.tds.td1.*;

public interface Arbre {
    int taille(); // nombre de valeurs
    boolean contient(final Integer val); // vrai si val est contenue dans l'arbre, faux sinon
    Set<Integer> valeurs(); // ensemble des valeurs différentes dans l'arbre
    Integer somme(); // somme des valeurs
    Integer min(); // valeur minimale
    Integer max(); // valeur maximale
    boolean estTrie(); // vrai si l'arbre est trié, faux sinon
}