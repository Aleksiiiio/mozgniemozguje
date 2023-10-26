import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

//        //zad 1--------------------------------------------------
//        System.out.println("Podaj wyraz do sprawdzenia czy sklada sie z malych liter");
//        isLowerCase(scaner.nextLine());
//
//        //zad 2---------------------------------------------------
//        System.out.println("Podaj zdanie");
//        System.out.println("Zdanie składa sie z " + countWordsInSentence(scaner.nextLine()) + " wyrazów");
//
//        //zad 3---------------------------------------------------
//        System.out.println("Podaj drugie zdanie");
//        System.out.println(upperCasedSentence(scaner.nextLine()));
//
//        //zad 4-------------------------------------------------
//        System.out.println("Podaj trzecie zdanie");
//        String sentenceScanner = scaner.nextLine();
//        System.out.println("Wyrazy w zdaniu maja ta sama dlugosc?: " + isSameLength(sentenceScanner));
//        System.out.println("Wyrazy w zdaniu sa palindromami?: " + isPalindrom(sentenceScanner));
//        System.out.println("Oba wyrazy sa tej samej dlugosci i palindromami?: " + isSameLengthAndPalindrom(sentenceScanner));
//
//        //zad 5------------------------------------------------
//        System.out.println("Trzycyfrowe liczby palindromiczne to: ");
//        System.out.println(Arrays.toString(palindromicThreeDigitNumbers()));
//
//        //zad 6----------------------------------------------
//        System.out.println("Czterocyfrowe liczby palindromiczne to: ");
//        System.out.println(Arrays.toString(palindromicFourDigitNumbers()));
//
//        //zad 7---------------------------------------------
//        System.out.println("Podaj wyraz");
//        String s = scaner.nextLine();
//        System.out.println(upString(s));
//        System.out.println(isPalindrom(s));
//        //zad 8-------------------------------------------


        //zad 9------------------------------------------
        System.out.println("Podaj liczbe a");
        long a = scaner.nextLong();
        System.out.println("Podaj liczbe b");
        long b = scaner.nextLong();
        System.out.println(Arrays.toString(isPalindromicNumber(a, b)));
    }

//    //zad 1-----------------------------------------------
//    public static boolean isLowerCase(String word) {
//        if (word.equals(word.toLowerCase())) {
//            System.out.println("MOCIUM PANIE");
//            return true;
//        } else {
//            System.out.println("BÓJ SIE BOGA");
//            return false;
//        }
//    }
//
//    //zad 2-------------------------------------------------
//    public static int countWordsInSentence(String sentence) {
//        String[] sentenceWords = sentence.split(" ");
//        return sentenceWords.length;
//    }
//
//    //zad 3---------------------------------------------------
//    public static String upperCasedSentence(String sentence) {
//        String[] sentenceWords = sentence.split(" ");
//        ArrayList<String> upperCased = new ArrayList<String>();
//        for (String string : sentenceWords) {
//            char letter = string.charAt(0);
//            char letterUpper = Character.toUpperCase(letter);
//            String rest = string.substring(1);
//            String restLower = rest.toLowerCase();
//            upperCased.add(letterUpper + restLower);
//
//        }
//        return String.join(" ", upperCased);
//    }
//
////    //zad 4-------------------------------------------------
//
//    public static boolean isSameLength(String sentence) {
//        String[] words = sentence.split(" ");
//        int wordLength = words[0].length();
//        boolean isSame = false;
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].length() != wordLength) {
//                isSame = false;
//            } else isSame = true;
//
//        }
//        return isSame;
//    }
//
//    public static boolean isPalindrom(String sentence) {
//        String[] words = sentence.split(" ");
//        boolean isPalindrom = false;
//        for (String word : words) {
//            StringBuilder sb = new StringBuilder();
//            sb.append(word);
//            String reversedWord = String.valueOf(sb.reverse());
//            if (word.equals(reversedWord)) {
//                isPalindrom = true;
//            } else {
//                isPalindrom = false;
//                break;
//            }
//        }
//        return isPalindrom;
//    }
//
//    public static boolean isSameLengthAndPalindrom(String sentence) {
//        String[] words = sentence.split(" ");
//        boolean iSLAP = false;
//        for (String word : words) {
//            if (isSameLength(sentence) && isPalindrom(sentence)) {
//                iSLAP = true;
//            } else iSLAP = false;
//        }
//        return iSLAP;
//    }
//
//    //zad 5--------------------------------------------
//    public static Integer[] palindromicThreeDigitNumbers() {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        for (int i = 100; i < 1000; i++) {
//            int firstNumber = i / 100;
//            int lastNumber = i % 10;
//            if (firstNumber == lastNumber) {
//                numbers.add(i);
//            }
//
//        }
//        return numbers.toArray(new Integer[0]);
//    }
//
//    //zad 6------------------------------------------------
//    public static Integer[] palindromicFourDigitNumbers() {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        for (int i = 1000; i < 10000; i++) {
//            int firstNumber = i / 1000;
//            int lastNumber = i % 10;
//            String secondNumber = Integer.toString(i);
//            char secondNum1 = secondNumber.charAt(1);
//            int secondNum2 = Character.getNumericValue(secondNum1);
//            String thirdNumber = Integer.toString(i);
//            char thirdNum1 = thirdNumber.charAt(2);
//            int thirdNum2 = Character.getNumericValue(thirdNum1);
//            if ((firstNumber == lastNumber) && (secondNum2 == thirdNum2)) {
//                numbers.add(i);
//            }
//
//        }
//        return numbers.toArray(new Integer[0]);
//    }
//
//    //zad 7--------------------------------------------------
//    public static String upString(String s) {
//        return s.toUpperCase();
//    }
//
//    //TODO zad 8-----------------------------------
////    public static String isPalindrom2(){
////
////    }

    //zad 9------------------------------------------
    public static Integer[] isPalindromicNumber(long a, long b) {
        long lower;
        long higher;
        String number;
        String numberReversed;
        ArrayList<Integer> alist = new ArrayList<Integer>();
        if (a < b) {
            lower = a;
            higher = b;
        } else {
            lower = a;
            higher = b;
        }
        for (int i = 0; i < Math.pow(10, 5); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            number = String.valueOf(sb);
            numberReversed = String.valueOf(sb.reverse());
            if (i >= lower && i <= higher) {
                if (number.equals(numberReversed)) {
                    alist.add(i);
                }
            }
        }
        return alist.toArray(new Integer[0]);
    }
}