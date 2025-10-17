//Misasoa ROBISON - 45009085

package org.example.tds.td1;

import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.*;


public class Chaine implements Sommable<Chaine>, Comparable<Chaine>{
    private String c;

    public Chaine(String c){
        this.c = c;
    }

    @Override public Chaine sommer (Chaine s){
        return new Chaine(c+s.c);
    }

    @Override
    public int compareTo(Chaine autre){
        return this.c.compareTo(autre.c);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj instanceof Chaine ch) {
            return this.c.equals(ch.c);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return c.hashCode();
    }
}