package com.tts;
public class AsciiChars
{
    public static void printNumbers(String input) {
        StringBuilder outString = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) >= 48 && input.charAt(i) <= 57){
                outString.append(input.charAt(i));
            }
        }
        System.out.printf("Number Chars in string: %s\n", outString);
    }

    public static void printLowerCase(String input)
    {
        // TODO: print valid lowercase alphabetic input
        StringBuilder outString = new StringBuilder();
        for(int i=0; i < input.length(); i++){
            if(input.charAt(i)>=97 && input.charAt(i) <= 122){
                outString.append(input.charAt(i));
            }
        }
        System.out.printf("Lowercase Chars in string: %s\n", outString);
    }

    public static void printUpperCase(String input)
    {
        // TODO: print valid uppercase alphabetic input
        StringBuilder outString = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) >= 65 && input.charAt(i) <= 90){
                outString.append(input.charAt(i));
            }
        }
        System.out.printf("Uppercase Chars in string: %s\n", outString);
    }
}
