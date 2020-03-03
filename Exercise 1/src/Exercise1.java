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
public class Exercise1 {
    public static void main(String[] args) {
        String url = "https://www.youtube.com/watch?v=2MtOpB5LlUA";
        String ip  = "166.128.4.12";

        if(validateIP(ip)) {
            System.out.println("IP address " + ip + " is valid.");
        }
        else {
            System.out.println("IP address " + ip + "is not valid.");
        }

        if(validateURL(url)) {
            System.out.println("URL " + url + " is valid.");
        }
        else {
            System.out.println("URL " + url + " is not valid.");
        }
    }

    public static boolean validateIP(String ip) {
        return ip.matches("(([0-1]?[0-9]{1,2}\\.)|(2[0-4][0-9]\\.)|(25[0-5]\\.)){3}(([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))");
    }

    public static boolean validateURL(String url) {
        return url.matches("^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]");
    }
}
