import com.aventrix.jnanoid.jnanoid.NanoIdUtils;

import java.util.Random;

public class Util {
    public static String generateId(int size){
        Random rd = new Random();
        String numbers = "1234567890";
        String character = "~!@#$%^&*()_+";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String allCharacter = numbers + character + alphabet + alphabet.toUpperCase();

        char[] ch = allCharacter.toCharArray();

        String id = NanoIdUtils.randomNanoId(rd, ch, size);
        return id;
    }
}
