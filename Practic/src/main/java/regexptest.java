import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class regexptest {
    public static void main(String[] args) {


        System.out.println("---===   1   ===---");
        Pattern p = Pattern.compile("J(\\w*)", Pattern.CASE_INSENSITIVE);
        String text = "Java is fun; JavaScript is funny.; JFunny ; just";
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println("Found '" + m.group(0) + "' at position "
                    + m.start() + "-" + m.end());
            if (m.start(0) < m.end(0))
                System.out.println("Suffix is " + m.group(1));
        }

        System.out.println("---===   2   ===---");
        text = "test a=\"1\" b=\"2\" c=\"3\" bar d=\"4\" e=\"5\"";
        System.out.println(text + "\n");
        Matcher m1 = Pattern.compile("([a-z]*)(([ \t]+[a-z]=\"[0-9]\")*)").matcher(text);
/*
* Matcher m1 = Pattern .compile(
* "([a-z]*)( +[a-z]=\"[0-9]\")( +[a-z]=\"[0-9]\")( +[a-z]=\"[0-9]\")")
* .matcher(text);
*/
        while (m1.find()) {
            System.out.println(m1.group());
            System.out.println(m1.group(1));
            Matcher m2 = Pattern.compile("([a-z])=\"([0-9])\"").matcher(
                    m1.group(2));
            while (m2.find()) {
                System.out.println(" " + m2.group(1) + " -> " +
                        m2.group(2));
            }
        }


        System.out.println("---===   3   ===---");
        p = Pattern.compile("J2SE");
        String candidateString_1 = "J2SE is the only one for me";
        String candidateString_2 = "For me, it's J2SE, or nothing at all";
        String candidateString_3 = "J2SEistheonlyoneforme";
        Matcher matcher = p.matcher(candidateString_1);
        String msg = ":" + candidateString_1 + ": matches?: ";
        System.out.println(msg + matcher.lookingAt());
        matcher.reset(candidateString_2);
        msg = ":" + candidateString_2 + ": matches?: ";
        System.out.println(msg + matcher.lookingAt());
        matcher.reset(candidateString_3);
        msg = ":" + candidateString_3 + ": matches?: ";
        System.out.println(msg + matcher.lookingAt());

        System.out.println("---===   4   ===---");


    }
}

class Splitter {

    private Pattern pattern;
    private boolean keepDelimiters;

    public Splitter(Pattern pattern, boolean keepDelimiters) {
        this.pattern = pattern;
        this.keepDelimiters = keepDelimiters;
    }

    public Splitter(Pattern pattern) {
        this(pattern, true);
    }

    public String[] split(String text) {

        int last_match = 0;
        LinkedList<String> list_splitted = new LinkedList<>();
        Matcher m = pattern.matcher(text);
        while (m.find()) {
            list_splitted.add(text.substring(last_match, m.start()));
            if (keepDelimiters) {
                list_splitted.add(m.group());
            }
            last_match = m.end();
        }
        list_splitted.add(text.substring(last_match));
        return list_splitted.toArray(new String[list_splitted.size()]);
    }

    public static void main(String[] argv) {
        Pattern pattern;
        try {
            pattern = Pattern.compile("\\W+");
        } catch (PatternSyntaxException e) {
            System.err.println(e.toString());
            return;
        }
        Splitter splitter = new Splitter(pattern);
        String text = "Hello World!";
        int counter = 1;
        for (String part : splitter.split(text)) {
            System.out.printf("Part %d: \"%s\"\n", counter++, part);
        }
    }
}