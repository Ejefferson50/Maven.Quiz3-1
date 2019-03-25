package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {

        String[] words = str.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String newWord = null;
            if (VowelUtils.startsWithVowel(word) == true) {
                newWord = String.valueOf(builder.append(word + "way"));
            } else {
                Integer vowelIndex = VowelUtils.getIndexOfFirstVowel(word);
                if (vowelIndex == -1) {
                    newWord = word + "ay";
                } else {
                    String beginning = word.substring(0, vowelIndex);
                    String ending = word.substring(vowelIndex);
                    newWord = ending + beginning + "ay";
                }
            }
            words[i] = newWord;
        }


        return String.join(" ", words);
    }
}

