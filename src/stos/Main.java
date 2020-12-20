package stos;

public class Main {

    public static void main(String[] args) {

        Nawiasy nawiasy = new Nawiasy();
        String dane = "( ( ) (( )) )";
        if (nawiasy.sprawdzNawiasy(dane)){
            System.out.println("Nawiasy zagnieżdzone prawidłowo");
        }
        else{
            System.out.println("Nawiasy zagnieżdżone nieprawidłowo");
        }


    }
}
