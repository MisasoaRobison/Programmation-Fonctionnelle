//Misasoa ROBISON - 45009085

package org.example.tds.td2;

import java.util.*;
import java.util.stream.Collectors;

public class TestToString{
    public static void main(String[] args){
        //Les lambdas
        ToString<List<String>> l2s = list -> String.join(", ", list);
        ToString<Map<String, Integer>> m2s = map -> 
            map.entrySet()
                .stream()
                .map(e -> e.getKey() + ": "+ e.getValue())
                .collect(Collectors.joining(", "));

        List<String> liste = Arrays.asList("pomme", "banane", "cerise");
        Map<String, Integer> map = new HashMap<>();
        map.put("Jean", 23);
        map.put("Marie", 30);
        map.put("Paul", 18);

        System.out.println("Liste formatée : " + l2s.convertir(liste));
        System.out.println("Map formatée : " + m2s.convertir(map));
    }
}