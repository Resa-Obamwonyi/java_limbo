package chapter8;

public class TextProcessor {
    public static void main(String[] args){
        countWords("I love test automation university");
        reverseString("Cosmos");
    }

    /**
     * Splits a sting into an array by tokenizing it
     * counts words and prints them
     * @param text full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for(String word: words){
            System.out.println(word);
        }
    }

    /**
     * Prints a string in reverse order
     * @param text
     */

    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
