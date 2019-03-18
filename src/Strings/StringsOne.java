package Strings;

public class StringsOne {
    public static void main(String[] args){
        String s1 = "Welcome to JAVA",
               s2 = "Programming is fun",
               s3 = "Welcome to JAVA";

        System.out.println(s1 == s2);                   // false
        System.out.println(s2 == s3);                   // false
        System.out.println(s1.equals(s2));              // false
        System.out.println(s1.equals(s3));              // true
        System.out.println(s2.compareTo(s3));           // -7
        System.out.println(s1.compareTo(s2));           // 7
        System.out.println(s2.compareTo(s2));           // 0
        System.out.println(s1.charAt(0));               // W
        System.out.println(s1.indexOf('j'));            // -1
        System.out.println(s1.indexOf("to"));           // 8
        System.out.println(s1.lastIndexOf('a'));    // -1
        System.out.println(s1.lastIndexOf("o", 15)); //9
        System.out.println(s1.substring(5));            // me to JAVA
        System.out.println(s1.substring(5, 11));        // me to
        System.out.println(s1.startsWith("Wel"));       // true
        System.out.println(s1.endsWith("JAVA"));        // true
        System.out.println(s1.toLowerCase());           // welcome to java
        System.out.println(s1.toUpperCase());           // WELCOME TO JAVA
        System.out.println(s1.concat(s2));              // Welcome to JAVAProgramming is fun
        System.out.println(s1.contains(s2));            // false
        System.out.println("\t     Wel     \t".trim()); // Wel
        System.out.println('1' + 1);                    // 50
        System.out.println("1" + 1);                    // 11
        System.out.println("1" + "Welcome" + 1 + 1);
        System.out.println("1" + "Welcome" + (1 + 1));
        System.out.println('1' + 1 + 1);
    }
}
