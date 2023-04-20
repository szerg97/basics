package com.lambda;

public class LambdaApplication {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++){
            if (i < 1){
                System.out.println("\nin 3 lines of code:");

                Printable thing = inputName("Mr. John");
                String text = inputPrefixAndSuffix(thing);
                print(text);
            }
            else{
                System.out.println("\nin just 1 line of code:");

                print(inputPrefixAndSuffix(inputName("Mr. Peter")));
            }
        }
    }

    private static Printable inputName(String name){
        return (p, s) -> String.format("%s %s%s", p, name, s);
    }

    private static String inputPrefixAndSuffix(Printable thing){
        return thing.set("Dear", "!");
    }

    private static void print(String s){
        System.out.println(s);
    }
}
