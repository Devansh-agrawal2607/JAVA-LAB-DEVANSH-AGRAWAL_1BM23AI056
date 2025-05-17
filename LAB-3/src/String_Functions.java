/*Develop a text processing tool for a language learning platform. The tool needs
to compare strings, concatenate strings, and create copies of strings for various languages.
Implement appropriate Java functionalities.*/
public class String_Functions {
    public static Boolean compareStrings(String str1, String str2){
        return str1.equals(str2);
    }
    public static String copyString(String Original){
        return new String(Original);
    }
    public static String concatenateString(String str1, String str2){
        return str1+str2;
    }

    public static void main(String[] args) {
        String str1= "Hello";
        String str2= " Hello";
        System.out.println("Are strings equal: "+compareStrings(str1,str2));
        System.out.println("Copy string: " + copyString(str1));
        System.out.println("Concatenate string: " + concatenateString(str1, str2));
    }
}
