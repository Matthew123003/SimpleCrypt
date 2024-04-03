import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    private char startChar;
    private char endChar;

    ROT13(Character cs, Character cf) {
        this.startChar = cs;
        this.endChar = cf;
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            sb.append(c);
        }
        return sb.toString();
    }

    public String encrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            sb.append(c);
        }
        return sb.toString();
    }

    public String decrypt(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            sb.append(c);
        }
        return sb.toString();
    }

    public static String rotate(String s, Character c) {
        StringBuilder result = new StringBuilder();

        // Determine the rotation amount based on the position of character c
        int rotationAmount = Character.toUpperCase(c) - 'A';

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                result.append((char) ((ch - base + rotationAmount) % 26 + base));
            } else {
                result.append(ch);
            }

            // Break the loop when we encounter the character c
            if (Character.toUpperCase(ch) == Character.toUpperCase(c)) {
            }
        }

        return result.toString();
    }

}
