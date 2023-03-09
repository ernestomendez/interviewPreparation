package com.dxesoft.exercices;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParenthesis {

    private final Character OPEN_BRACKET = '{';
    private final Character openParenthesis = '(';
    private final Character openCorchete = '[';


    public boolean isValid(String expression) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> closing = getCharacterCharacterMap();

        for (int i = 0; i < expression.length(); i++) {
            final Character symbol = expression.charAt(i);

            if (isOpenSymbol(symbol)) {
                stack.push(symbol);
            } else {
                if (stack.empty()) {
                    return false;
                }
                final Character top = stack.pop();

                final Character closingSymbol = closing.get(top);

                if (!symbol.equals(closingSymbol)) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    private Map<Character, Character> getCharacterCharacterMap() {
        Map<Character, Character> closing = new HashMap<>();

        closing.put(OPEN_BRACKET, '}');
        closing.put(openParenthesis, ')');
        closing.put(openCorchete, ']');
        return closing;
    }

    private boolean isOpenSymbol(Character s) {
        if (OPEN_BRACKET.equals(s)) {
            return true;
        } else if (openParenthesis.equals(s)) {
            return true;
        } else return openCorchete.equals(s);
    }
}
