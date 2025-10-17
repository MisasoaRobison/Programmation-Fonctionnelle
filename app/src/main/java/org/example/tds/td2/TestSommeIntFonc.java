//Misasoa ROBISON - 45009085

package org.example.tds.td2;

import java.util.Scanner;

public class TestSommeIntFonc{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        //Les 4 lambdas à écrire
        Somme<Integer> sommeEntier = (a, b) -> a + b;
        Somme<Double> sommeDouble = (a, b) -> a + b;
        Somme<Long> sommeLong = (a, b) -> a + b;
        Somme<String> sommeString = (a, b) -> a + b;

        System.out.println("Test Entier : ");
        System.out.print("Entrez 2 entiers : ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        System.out.println(int1+"+"+int2+" = "+sommeEntier.somme(int1,int2));

        System.out.println("Test Double : ");
        System.out.print("Entrez 2 doubles : ");
        Double db1 = scanner.nextDouble();
        Double db2 = scanner.nextDouble();
        System.out.println(db1+"+"+db2+" = "+sommeDouble.somme(db1,db2));

        System.out.println("Test Long : ");
        System.out.print("Entrez 2 Long : ");
        Long long1 = scanner.nextLong();
        Long long2 = scanner.nextLong();
        System.out.println(long1+"+"+long2+" = "+sommeLong.somme(long1,long2));

        scanner.nextLine(); 
        System.out.println("Test Chaine : ");
        System.out.print("Entrez 2 chaines de caractere : ");
        String char1 = scanner.nextLine();
        String char2 = scanner.nextLine();
        System.out.println(char1+"+"+char2+" = "+sommeString.somme(char1,char2));

        scanner.close();
    }
}