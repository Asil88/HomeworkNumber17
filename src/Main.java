import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
   static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Matcher matcher = checkIp(scanner.nextLine());
        printIp(matcher);
        }

    public static Matcher checkIp (String s){
        Pattern compile = Pattern.compile("(([0-9])+(\\.|$)){4}");
        return compile.matcher(s);
    }

    public static void printIp(Matcher matcher){
        while (matcher.find()) {
            System.out.println(matcher.group());
            checkIp(scanner.nextLine());
        }
    }
}

 /*  Scanner scanner = new Scanner(System.in);
        Pattern compile = Pattern.compile("(([0-9])+(\\.|$)){4}");
        Matcher matcher = compile.matcher(scanner.nextLine());
        while (matcher.find()) {
            System.out.println(matcher.group());*/