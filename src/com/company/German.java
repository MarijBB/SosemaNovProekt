package com.company;

public class German {
    public static void main(String[] args) {
        System.out.println(" Paper, Book !!!");
        readBook ("Duden");
        readNewsPaper( "Deutschezeitung");
    }
    private int page = 45;
    public static void readBook (String name)
    {System.out.println("Book, " + name);}

    // TODO: ask someone for help

    //comentar: news papers list will be updated
    public static void readNewsPaper (String name)
    {System.out.println("NewsPapers, " + name);}
    //todo: print

}

