import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode804 {

    public static void main(String[] args) {
        String[] myWords = {"new", "table", "test"};
        System.out.println(uniqueMorseRepresentations(myWords));
    }

    public static int uniqueMorseRepresentations(String[] words) {

        // Create a dictionary w/ alphabet
        // Variables
        String[] morseDict = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String,String> myDict = new HashMap<>();
        char myChar;

        // Add values to HashMap
        for (int i = 97; i < 123;i++){
            myChar = (char) i;
            myDict.put(String.valueOf(myChar),morseDict[i-97]);
        }

        // Create new set and add morse code items
        Set<String> mySet = new HashSet<>();
        String wordMorse = "";

        for (String word : words){
            wordMorse="";
            for (int i = 0; i < word.length();i++){
                wordMorse+=myDict.get(String.valueOf(word.charAt(i)));
            }
            mySet.add(wordMorse);
        }
        // Return size of set
        return mySet.size();
    }
}
