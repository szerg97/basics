package com.sandbox.palindrome;

public class PalindromeChecker {

    public boolean test(String text){
        String textWithoutSpaces = withoutSpaces(text.toLowerCase());
        return isPalindrome(textWithoutSpaces);
    }

    private String withoutSpaces(String text){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if(current != ' ')
                sb.append(current);
        }
        return sb.toString();
    }

    private boolean isPalindrome(String text){
        int i = 0;
        while (i < text.length()){
            char current = text.charAt(i);
            char opposite = text.charAt(text.length()-1-i);
            if (current != opposite){
                break;
            }
            i++;
        }
        return i == text.length();
    }
}
