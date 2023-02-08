package com.company;


public class Book {
    public static void main(String[] args) {
        System.out.println(" Language, Dictionary !!!");

        LearnLanguage("Duden");
        useDictionery( "Duden2");
        // comments: check dictionary names
    }
    public static void LearnLanguage (String name)
    {
        // TODO: Check support for multiple names
        System.out.println(" Language, "+name);
    }
    public static void goToClass ( String name)
    { System.out.println("Class, " + name );}

    public static void practiseSpeaking (String name)
    {System.out.println("Language," + name);}
    // comment: check which language should be tested

    public static void useDictionery (String name)
    {
        // comments: info from meeting on 12.02
        // TODO: include library check
        System.out.println("Dictionary, "+name);
    }
 }
