// Misasoa ROBISON - 45009085

package org.example.tds.td1;

import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

//import org.tds.td1.*;

public interface Arbre <X extends Sommable <X> & Comparable<X>>{
    int taille(); // nombre de valeurs
    boolean contient(final X val); // vrai si val est contenue dans l'arbre, faux sinon
    Set<X> valeurs(); // ensemble des valeurs différentes dans l'arbre
    X somme(); // somme des valeurs
    X min(); // valeur minimale
    X max(); // valeur maximale
    boolean estTrie(); // vrai si l'arbre est trié, faux sinon
}