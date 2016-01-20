package WordGenerator;

/**
 * Created by lucky on 1/19/16.
 */
public class WordGenerator {

//ONLY WORKS FOR CAPITAL LETTERS

    public String generateWord(char letter) {

        char[] word = new char[1 + (int)(Math.random() * 10)];
        word[0] = letter;

        if (letter >= 65 && letter <= 90) {

            for (int i = 1; i < word.length; i++) {
                word[i] = (char)(Math.random() * 26 + 65);
            }
        } else {
            return null;
        }

        return new String(word);
    }

}
