package stos;

public class Main {

    public static void main(String[] args) {

        Nawiasy nawiasy = new Nawiasy();
        String dane = "(  () (( )) )";
        String dane2 = "()(()";
        if (nawiasy.sprawdzNawiasy(dane)){
            System.out.println("Nawiasy (  () (( )) ) zagnieżdzone prawidłowo");
        }
        else{
            System.out.println("Nawiasy (  () (( )) ) zagnieżdżone nieprawidłowo");
        }
        if (nawiasy.sprawdzNawiasy(dane2)){
            System.out.println("Nawiasy ()(() zagnieżdzone prawidłowo");
        }
        else{
            System.out.println("Nawiasy ()(() zagnieżdżone nieprawidłowo");
        }


    }
}
