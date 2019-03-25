package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private static final char[] VOWELS = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
    public static Boolean hasVowels(String word) {
        char[] wordAsArray = word.toCharArray();
        for (int i = 0; i < wordAsArray.length; i++) {
            for (int j = 0; j < VOWELS.length; j++) {
                if (wordAsArray[i] == VOWELS[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String wordToLowerCase= word.toLowerCase();
        String vowels ="aeiou";
        for (int index = 0; index <wordToLowerCase.length() ; index++) {
            if(vowels.contains(String.valueOf(wordToLowerCase.charAt(index)))){
                return index;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        for (int i = 0; i < VOWELS.length; i++) {
            if (character == VOWELS[i]) {
                return true;
            }
        }
        return false;
    }

}
