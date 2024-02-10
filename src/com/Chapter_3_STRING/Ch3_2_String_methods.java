package com.Chapter_3_STRING;

public class Ch3_2_String_methods {
    public static void main(String[] args) {
        String name = "Fr1sk";
        System.out.printf("%s\n\n", name);


        int value = name.length();
        // Returns the length of this string
        System.out.printf("%d \n\n", value);


        String lstring = name.toLowerCase();
        // Converts all the characters in this String to a lower case
        System.out.printf("%s \n\n", lstring);


        String ustring = name.toUpperCase();
        // Converts all the characters in this String to an upper case
        System.out.printf("%s \n\n", ustring);


        String nonTrimedString = "      Fr1sk      ";
        System.out.println(nonTrimedString);
        System.out.println(nonTrimedString.trim() + "\n");
        // Returns a string whose value is this string, with all leading and trailing space removed


        System.out.println(name.substring(2) + "\n");
//        System.out.println(name.substring(int start));
//        It will print the string from the given starting point to the end
//        [NOTE: Index starts from 0, but we can enter any number within limit]

        System.out.println(name.substring(1, 3) + "\n");
//        System.out.println(name.substring(int start, int end));
//        It will print the string from the given starting point to the given end point
//        [NOTE: The starting point is included but the ending point is not included]

        System.out.println(name.replace("1", "o"));
        System.out.println(name.replace('k', 't'));
        System.out.println(name.replace("r1sk", "ist") + "\n");
//        It will replace the particular existing character with the new character which we want to insert

        String additionalSring = "Pritam is Fr1sk and Fr1sk is Pritam";
        System.out.println(additionalSring.replaceAll("is", "was") + "\n");
//        It will replace ALL the same given character with the new character

        System.out.println(name.startsWith("fr1"));
        System.out.println(name.startsWith("Fr1") + "\n");
//        It will check whether the string is starts with it ("Fr1" in this case) or not
//        It will return as Boolean

        System.out.println(name.endsWith("st"));
        System.out.println(name.endsWith("sk") + "\n");
//        It will check whether the string is ends with it ("sk" in this case) or not
//        It will return as Boolean

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4) + "\n");
//        It will return character at the given index position

        System.out.println(name.indexOf("F"));
        System.out.println(name.indexOf("r"));
        System.out.println(name.indexOf("1"));
        System.out.println(name.indexOf("s"));
        System.out.println(name.indexOf("k") + "\n");
//        It will return the index of the given string
//        This id exactly opposite of .charAt

        String modifiedString = "Harryrryrryrry";

        System.out.println(modifiedString.indexOf("rry") + "\n");
//        It will find from the start and return the index value
//        Left ---> Right

        System.out.println(modifiedString.indexOf("rry", 4) + "\n");
//        It will find from the particular given and return the index value
//        Left ---> Right

        System.out.println(modifiedString.lastIndexOf("rry", 7) + "\n");
//        It will find from the start to the particular given point
//        Left ---> Right

        System.out.println(name.equals("Fr1sk"));
        System.out.println(name.equals("fr1sk") + "\n");
//        It will match the character of the string
//        It is case-sensitive
//        It will return as Boolean

        System.out.println(name.equalsIgnoreCase("Fr1sk"));
        System.out.println(name.equalsIgnoreCase("fr1sk") + "\n");
//        It will match the character of the string
//        It is NOT case-sensitive
//        It will return as Boolean
    }
}
