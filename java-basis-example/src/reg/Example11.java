package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example11 {

    public static void main(String args[]) {
        final String case1 = "aabc abc bc acb";
        final Pattern pattern1 = Pattern.compile("a*b");
        final Matcher matcher1 = pattern1.matcher(case1);
        boolean result1 = matcher1.find();

        while (result1) {
            if (result1) { // true
                System.out.println("Case 1");
                System.out.println(matcher1.group()); //aab,ab,b
            }
            result1 = matcher1.find();
        }

        final String case2 = "aabc abc bc";
        final Pattern pattern2 = Pattern.compile("a+b");
        final Matcher matcher2 = pattern2.matcher(case2);
        boolean result2 = matcher2.find();

        while (result2) {
            if (result2) { // true
                System.out.println("Case 2");
                System.out.println(matcher2.group()); //aab,ab
            }
            result2 = matcher2.find();
        }

        final String case3 = "aabc abc bc";
        final Pattern pattern3 = Pattern.compile("a?b");
        final Matcher matcher3 = pattern3.matcher(case3);
        boolean result3 = matcher3.find();

        while (result3) {
            if (result3) { // true
                System.out.println("Case 3");
                System.out.println(matcher3.group()); //ab,ab
            }
            result3 = matcher3.find();
        }


    }
}





