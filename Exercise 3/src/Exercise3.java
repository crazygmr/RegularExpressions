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
public class Exercise3 {
    public static void main(String[] args) {
        String licence = "ADV391";
        Pattern expression = Pattern.compile("DV");
        Matcher matcher = expression.matcher(licence);

        if(validPlate(licence)) {
            if(matcher.find()) {
                System.out.println("This licence plate does indicate a disabled veteran.");
            }
            else {
                System.out.println("This licence plate does not indicate a disabled veteran.");
            }
        }
        else {
            System.out.println("This license plate is not valid.");
        }
    }

    public static boolean validPlate(String licencePlate) {
        return licencePlate.matches("[A-NP-Z]{3}[0-9]{3}");
    }
}
