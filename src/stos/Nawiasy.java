package stos;

import java.util.ArrayDeque;
import java.util.Deque;
//push test
public class Nawiasy {
    static boolean sprawdzNawiasy(String dane) {
        Deque<Character> stos = new ArrayDeque<>();

        for (int i = 0; i < dane.length(); i++) {
            char a = dane.charAt(i);

            if (a == '(') {
                stos.push(a);
            } else {
                if (a == ')') {
                    if (stos.isEmpty()) {
                        return false;
                    } else {
                        if (stos.peek() == '(') {
                            stos.pop();
                        }
                    }
                }
            }

        }
        return stos.isEmpty();
    }
}