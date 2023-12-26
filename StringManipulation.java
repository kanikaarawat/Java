/*WAP in Java
 * 1)Use Random Number Generating function.
 * 2)Use Random String Generating Function.
 * 3)Convert Integer to String
 * 4)Convert Integer to Float
 * 5)Convert String to Double
 * 6)Wap to reverse a string using reverse().
 * 7)Wap to reverse the same string without using reverse(). You may use other functions.
 * 8)Wap to convert a byte array into string using 3 different encodings of your choice. Print both the byte and String conversions.
 * 
 * Output:-
 * Converting Integer to String:-
 * Integer: ....
 * String: ....
 * Converting Integer to Float:-
 * Integer: ....
 * Float: ....
 * Converting String to Integer:-
 * String: ....
 * Integer: ....
 * Reversing:
 * Original String: ....
 * Using reverse(): ....
 * Without Using reverse(): ....
 * Counting byte to String:
 * Byte: ....
 * String using <encoding>: ....
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
 */

import java.util.Random;
import java.io.UnsupportedEncodingException;

public class StringManipulation {
    public static void main(String[] args) {
        // Creating a random number generator
        Random random = new Random();
        
        // Generating a random integer between 1 and 100
        int randomInt = generateRandomNumber(1, 100);

        // Generating a random string of 10 characters that may include letters and numbers
        String randomString = generateRandomString(10, false);
        
        // Generating a single numeric character
        String numericString = generateRandomString(1, true);

        // Task 1: Converting Integer to String
        System.out.println("Converting Integer to String:");
        System.out.println("Integer: " + randomInt);
        System.out.println("String: " + Integer.toString(randomInt));

        // Task 2: Converting Integer to Float
        System.out.println("Converting Integer to Float:");
        System.out.println("Integer: " + randomInt);
        System.out.println("Float: " + (float) randomInt);

        // Task 3: Converting String to Integer
        System.out.println("Converting String to Integer:");
        System.out.println("String: " + numericString);
        try {
            int stringToInt = Integer.parseInt(numericString);
            System.out.println("Integer: " + stringToInt);
        } catch (NumberFormatException e) {
            // Handling the exception when the string is not numeric
            System.out.println("Exception: It is a non-numeric String");
        }

        // Task 4: Reversing a String
        System.out.println("Reversing:");
        String originalString = generateRandomString(15, false);
        
        // Using StringBuilder to reverse the string
        String reversedString = reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Using reverse(): " + reversedString);
        
        // Reversing a string without using StringBuilder
        String reversedStringWithoutReverse = reverseStringWithoutStringBuilder(originalString);
        System.out.println("Without Using reverse(): " + reversedStringWithoutReverse);

        // Task 5: Counting bytes and converting to String
        System.out.println("Counting byte to String:");
        
        // Getting the byte array of the original string
        byte[] byteArray = originalString.getBytes();
        System.out.println("Byte: " + byteArray);

        // Converting the byte array to a string using UTF-8 encoding
        String utf8String = convertByteArrayToString(byteArray, "UTF-8");
        System.out.println("String using UTF-8: " + utf8String);

        // Task 6: Converting to String using UTF-16 encoding
        byte[] byteArrayUTF16 = convertStringToByteArray(originalString, "UTF-16");
        
        // Converting the byte array to a string using UTF-16 encoding
        String utf16String = convertByteArrayToString(byteArrayUTF16, "UTF-16");
        System.out.println("String using UTF-16: " + utf16String);

        // Task 7: Converting to String using ISO-8859-1 encoding
        String iso8859String = convertByteArrayToString(byteArray, "ISO-8859-1");
        System.out.println("String using ISO-8859-1: " + iso8859String);
    }

    public static int generateRandomNumber(int min, int max) {
        // Generate a random number within the specified range
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static String generateRandomString(int length, boolean numericOnly) {
        // Generate a random string with the given length and character options
        String characters = numericOnly ? "1234567890" : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder randomString = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            // Append random characters to the string
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }

        return randomString.toString();
    }

    public static String reverseString(String original) {
        // Reverse a string using the StringBuilder's reverse() method
        return new StringBuilder(original).reverse().toString();
    }

    public static String reverseStringWithoutStringBuilder(String original) {
        // Reverse a string without using the StringBuilder's reverse() method
        char[] chars = original.toCharArray();
        char[] reversedChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversedChars[i] = chars[chars.length - 1 - i];
        }
        return new String(reversedChars);
    }

    public static String convertByteArrayToString(byte[] byteArray, String encoding) {
        // Convert a byte array to a string using the specified encoding
        try {
            return new String(byteArray, encoding);
        } catch (UnsupportedEncodingException e) {
            // Handle the case of unsupported encoding
            return "Unsupported Encoding: " + e.getMessage();
        }
    }

    public static byte[] convertStringToByteArray(String str, String encoding) {
        // Convert a string to a byte array using the specified encoding
        try {
            return str.getBytes(encoding);
        } catch (UnsupportedEncodingException e) {
            // Handle the case of unsupported encoding
            e.printStackTrace();
            return new byte[0];
        }
    }
}
