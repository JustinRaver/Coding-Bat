package Warmup2;

/**
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 * <p>
 * <p>
 * altPairs("kitten") → "kien"
 * altPairs("Chocolate") → "Chole"
 * altPairs("CodingHorror") → "Congrr"
 */
public class AltPairs {
    public String altPairs(String str) {
        int count = 0;
        String temp = "";
        while (count < str.length()) {
            temp += str.substring(count, count + 1);
            if (count % 2 == 0) {
                count++;
            } else {
                count += 3;
            }
        }
        return temp;
    }
}
