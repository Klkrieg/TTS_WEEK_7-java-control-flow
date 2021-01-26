package com.tts;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

  public static void main(String[] args) {
    //System.out.println("Hello world. \nEnter a sentence and I will parse it into its constituent numbers, uppercase letters, and lowercase letters.");
    Scanner input = new Scanner(System.in);
//    String myString = input.nextLine();
//    AsciiChars.printNumbers(myString);
//    AsciiChars.printLowerCase(myString);
//    AsciiChars.printUpperCase(myString);
    System.out.println("Now, lets have some fun! What's your first name?");
    String name = input.nextLine();
    System.out.printf("Hello, %s!\n Would you like to continue to the interactive section of this program? [yes | no]\n ", name);
    String yesOrNo = input.nextLine();
    if(yesOrNo.equalsIgnoreCase("no") || yesOrNo.equalsIgnoreCase("n")){
      System.out.println("Please return later to complete the survey.");
      System.exit(0);
    }else if(yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("yes")){
      System.out.println("Wonderful! I am going to ask you a series of questions to generate your lucky numbers!");
      System.out.println("1/7: Is your car red?[yes | no]");
      String yesOrNo2 = input.nextLine();
      System.out.println("2/7: What is the name of your favorite pet?");
      String petName = input.nextLine();
      System.out.printf("3/7: How old is %s?\n", petName);
      int petAge = input.nextInt();
      System.out.println("4/7: What is your lucky number?");
      int luckyNumber = input.nextInt();
      System.out.println("5/7: Do you have a favorite sport person? If so what is their jersey number? If not press enter.");
      int jerseyInt = input.nextInt();
      System.out.println("6/7: Now what are the last two digits in the year of your car?");
      int carYear = input.nextInt();
      System.out.println("7/7: What is the first name of your favorite actor or actress?");
      String actName = input.nextLine();
      System.out.println("Great, Your lucky numbers are...");


    }


  }
}
