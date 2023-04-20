package com.sandbox.palindrome;

public class App {
    public static void main(String[] args) {
        Text text = new Text("Indul a görög aludni");
        System.out.printf("The reversed form of \"%s\" is: \"%s\"%n", text.text(), text.getReversed());

        String result = text.isPalindrome() ? "\"%s\" IS palindrome" : "%s IS NOT palindrome";
        System.out.printf(result, text.text());
    }
}
