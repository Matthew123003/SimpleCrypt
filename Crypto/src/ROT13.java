import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;
import static java.lang.System.in;

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
        int index = s.indexOf(c);
        // If the character c is not found, return the original string s
        if (index == -1) {
            return s;
        }
        // Rotate the string until the specified character c is at the beginning
        String rotated = s.substring(index) + s.substring(0, index);

        return rotated;
    }

    public void readFile() throws IOException {
        ROT13 rot = new ROT13();
        File file = new File("/Users/matthew/Projects/SimpleCrypt/sonnet18.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            rot.crypt(sc.toString());
            System.out.println(rot.crypt(sc.toString()));
        }

    }

    public static void main(String[] args) throws IOException {
        ROT13 rot = new ROT13();
        rot.readFile();
    }

}
