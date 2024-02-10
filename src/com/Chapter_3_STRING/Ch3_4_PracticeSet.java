package com.Chapter_3_STRING;

public class Ch3_4_PracticeSet {
    public static void main(String[] args) {



        System.out.println("Question 1\n");
        System.out.println("Write a java program to convert a string to lowercase");

        String name = "CSGO is best";
        name = name.toLowerCase();
        System.out.println(name.toLowerCase());
        // OR (because they are the same)
        System.out.println(name);
        System.out.println("\n\n");



        System.out.println("Question 2\n");
        System.out.println("Write a java program to replace spaces with underscores");

        String name2 = "CSGO is best";
        name2 = name2.replace(" ", "_");
        System.out.println(name2.replace(" ", "_"));
        System.out.println(name2);
        System.out.println("\n\n");



        System.out.println("Question 3\n");
        System.out.println("Write a java program to fill in a letter template which looks likes below:");
        System.out.println("letter = \"Dear <name>, Thanks a lot\"");
        System.out.println("replace <name> with a string (some name)");

        String name3 = "Dear <|name|>, Thanks a lot";
        name3 = name3.replace("<|name|>", "Fr1sk");
        System.out.println(name3);
        System.out.println(name3.replace("<|name|>", "fr1sk"));
        System.out.println("\n\n");



        System.out.println("Question 4\n");
        System.out.println("Write a java program detect double and spaces in a program in a string");

        String name4 = "CSGO  is   best";
        System.out.println(name4.indexOf("  "));
        System.out.println(name4.indexOf("   "));
        System.out.println("\n\n");



        System.out.println("Question 5\n");
        System.out.println("Write a java program to format the following letter using escape sequence characters:");
        System.out.println("\"Dear Sir, \n\tThis JAVA course is nice. \n\tThanks\"");

        String letter = "\"Dear Sir, \n\tThis JAVA course is nice. \n\tThanks\"";
        System.out.println(letter);
    }
}
