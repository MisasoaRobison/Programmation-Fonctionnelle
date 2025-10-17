//Misasoa ROBISON - 45009085

package org.example.tds.td1;

import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.*;

import java.util.ArrayList;

public class Entier implements Sommable<Entier>, Comparable<Entier>{
    private int x;

    public Entier(int x){
        this.x=x;
    }

    @Override 
    public Entier sommer(Entier x){
        return new Entier(this.x + x.x);
    }

    @Override
    public int compareTo(Entier autre){
        return Integer.compare(this.x, autre.x);
    } 

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj instanceof Entier e) {
            return this.x == e.x;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(x);
    }


}