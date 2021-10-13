package Logic1;

/**
 * Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)
 * <p>
 * <p>
 * fizzString("fig") → "Fizz"
 * fizzString("dib") → "Buzz"
 * fizzString("fib") → "FizzBuzz"
 */
public class FizzString {
    public String fizzString(String str) {
        String ret = "";
        if (str.startsWith("f")) {
            ret += "Fizz";
        }
        if (str.endsWith("b")) {
            ret += "Buzz";
        }
        if (ret.isEmpty()) {
            return str;
        }
        return ret;
    }
}
