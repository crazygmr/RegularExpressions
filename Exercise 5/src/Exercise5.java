import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise5 {
    public static void main(String[] args) {
        String string = "Hello, my name is Joel Trejo and I'm a computer science major and plan on getting a masters in\n" +
                "cyber-security. If you need in contact with me call me at (123) 456-7890 and leave your name, reason for calling\n" +
                "and a number to get back to you with. If for some reason the first method won't work you can also contact\n" +
                "my mother at 123-456-7890. Thank you and have a good day.\n";
        Pattern format1 = Pattern.compile("\\([1-9][0-9]{2}\\)\\s[1-9][0-9]{2}[-][0-9]{4}");
        Pattern format2 = Pattern.compile("[1-9][0-9]{2}[-][1-9][0-9]{2}[-][0-9]{4}");
        Matcher Format1 = format1.matcher(string);
        Matcher Format2 = format2.matcher(string);

        if(Format1.find()) {
            System.out.println("There is a number in the format (XXX) XXX-XXXX: " + Format1.group());
        }
        if(Format2.find()) {
            System.out.println("There is a phone number in the format of XXX-XXX-XXXX: " + Format2.group());
        }
    }
}
