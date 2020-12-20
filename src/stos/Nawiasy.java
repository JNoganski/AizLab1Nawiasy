package stos;

import java.util.ArrayDeque;
import java.util.Deque;

public class Nawiasy {
     static boolean sprawdzNawiasy(String dane){
        Deque<Character> stos = new ArrayDeque<>();

        for(int i=0;i < dane.length();i++){
            char a = dane.charAt(i);

            if (a == '('){
                stos.push(a);
                continue;
            }
        if (stos.isEmpty())
            return false;
        char sprawdz;
        sprawdz = stos.pop();
        if (sprawdz == '(')
            return false;
        }
    return (stos.isEmpty());
        }

    }

