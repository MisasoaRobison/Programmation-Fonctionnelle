//Misasoa ROBISON - 45009085

package org.example.tds.td2;

import java.util.function.Predicate;

public class TestPaireAcces{
    public static void main(String[] args) {

        // Prédicats taille
        Predicate<Integer> tailleTropPetite = t -> t < 100;
        Predicate<Integer> tailleTropGrande = t -> t > 200;
        Predicate<Integer> tailleIncorrecte = tailleTropPetite.or(tailleTropGrande);
        Predicate<Integer> tailleCorrecte = tailleIncorrecte.negate();

        // Prédicats poids
        Predicate<Double> poidsTropLourd = p -> p > 150.0;
        Predicate<Double> poidsCorrect = poidsTropLourd.negate();

        // Accès autorisé
        Predicate<Paire<Integer, Double>> accesAutorise = client ->
            tailleCorrecte.test(client.fst) && poidsCorrect.test(client.snd);

        // Tests
        Paire<Integer, Double> client1 = new Paire<>(120, 60.0);
        Paire<Integer, Double> client2 = new Paire<>(90, 50.0);
        Paire<Integer, Double> client3 = new Paire<>(180, 160.0);
        Paire<Integer, Double> client4 = new Paire<>(210, 70.0);

        System.out.println(client1 + " => accès autorisé ? " + accesAutorise.test(client1));
        System.out.println(client2 + " => accès autorisé ? " + accesAutorise.test(client2));
        System.out.println(client3 + " => accès autorisé ? " + accesAutorise.test(client3));
        System.out.println(client4 + " => accès autorisé ? " + accesAutorise.test(client4));
    }
}
















