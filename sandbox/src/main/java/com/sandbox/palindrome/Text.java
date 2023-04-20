package com.sandbox.palindrome;

public record Text(String text) {

    public String getReversed() {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i > -1; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public boolean isPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        return palindromeChecker.test(text);
    }
}
