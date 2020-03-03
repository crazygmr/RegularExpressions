import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Java Program By Joel Trejo for OOP2 Spring 2020
 *
 *              @@@@@@@@@    @@
 *	         @@       @@@ @@@
 *	       @@@         @@@@@
 *	      @@
 *	     @@   @@@@@@@
 *	    @@   @@     @@
 *	   @@   @@       @@
 *	   @   @@         @@
 *	   @   @    @@@@   @@
 *	   @   @   @@  @@   @@
 *	   @   @@  @@   @@   @@
 *	   @   @@@      @@   @@
 *	   @@   @@@   @@@    @@
 *	   @@@   @@@ @@@    @@@
 *	   @ @@   @@@@@    @@@
 *	   @  @@          @@@
 *	   @   @@        @@@
 *	   @@@@@@@@@@@@@@@@
 *
 */
public class Exercise4 {
    public static void main(String[] args) {
        String email = "jtrejo9@mail.stmarytx.edu";
        String password = "Math3matics";

        if(validEmail(email)) {
            System.out.println("This email is valid.");
        }
        else {
            System.out.println("This email is not valid");
        }

        if(validPassword(password)) {
            System.out.println("This password is valid.");
        }
        else {
            System.out.println("This password is not valid.");
        }
    }

    public static boolean validEmail(String email) {
        return email.matches("[a-z]+[0-99]*@mail.stmarytx.edu");
    }

    public static boolean validPassword(String password) {
        Pattern lowerCase = Pattern.compile("[a-z]+");
        Matcher lowercase = lowerCase.matcher(password);
        Pattern upperCase = Pattern.compile("[A-Z]+");
        Matcher uppercase = upperCase.matcher(password);
        Pattern Digit     = Pattern.compile("[0-9]+");
        Matcher digit     = Digit.matcher(password);
        Pattern Special   = Pattern.compile("[!@#$%^&*()_<>]+");
        Matcher special   = Special.matcher(password);
        return (lowercase.find() && uppercase.find() && digit.find() && special.find());
    }
}
