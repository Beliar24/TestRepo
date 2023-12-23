package strings;

import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.format;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "someEmail@gmail.com";
//        String s2 = "John2John";

//        char[] array = new char[10];
//
//        s1.getChars(0, 4, array, 6);
//        System.out.println(s1.equals(s2));
//        System.out.println(Arrays.toString(s1.getBytes()));
//        System.out.println(s1.equalsIgnoreCase(s2));

        Pattern pattern = Pattern.compile(".+\\@(gmail|ukr)\\.(com|ua)");
        Matcher matcher = pattern.matcher(s1);

        System.out.println(matcher.find());

    }

//    public static String f(String src, Object args) {
//        return format(src, args);
//    }
}
