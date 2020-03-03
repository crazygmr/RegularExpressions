import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise6 {
    public static final String[] spamWords = {"nigerian", "disclaimer", "urgent", "necessary", "free",
                                "4u", "guarantee", "profits", "congratulations", "opportunity", "unlimited",
                                "scam", "amazing", "mailto", "mlm", "unsecured", "winner", "winning", "hormone",
                                "insurance", "spam", "ringtones", "pharmacy", "blackjack", "was", "chatroom",
                                "duty-free", "shoes"};
    static String email, spam;
    public static void main(String[] args) throws IOException {
        Scanner scanner, scanner1;
        try(BufferedReader infile = new BufferedReader(new FileReader("email.txt"))) {
            StringBuilder builder = new StringBuilder();
            String line = infile.readLine();

            while(line != null) {
                builder.append(line);
                builder.append(System.lineSeparator());
                line = infile.readLine();
            }
            email = builder.toString();
        }
        try(BufferedReader infile = new BufferedReader(new FileReader("spam.txt"))) {
            StringBuilder builder = new StringBuilder();
            String line = infile.readLine();

            while(line != null) {
                builder.append(line);
                builder.append(System.lineSeparator());
                line = infile.readLine();
            }
            spam = builder.toString();
        }
        email = email.replaceAll("[.,]", " ");
        email = email.replaceAll("\\s{2,}", " ");
        int wordCount = 0;
        int spamCount = 0;
        String[] token = email.split(" ");
        for(String tokens : token) {
            for(String spamWord : spamWords) {
                if(tokens.equals(spamWord)) {
                    spamCount++;
                }
            }
            wordCount++;
        }
        System.out.printf("The total number of words in the email is %d and the total number of spam words in the email is %d.%n", wordCount, spamCount);
        System.out.printf("Based on the limited list of spam words provided, the ratio of real words to spam words is : " +
                "%1.5f percent.%n", (double)(spamCount) / wordCount * 100);
        System.out.printf("Based on the ratio of words to spam, this email is likely to not be spam, which is correct.%n%n");

        spam = spam.replaceAll("[.,]", " ");
        spam = spam.replaceAll("\\s{2,}", " ");
        int wordCount1 = 0;
        int spamCount1 = 0;
        token = spam.split(" ");
        for(String tokens : token) {
            for(String spamWord : spamWords) {
                if(tokens.equals(spamWord)) {
                    spamCount++;
                }
            }
            wordCount++;
        }
        System.out.printf("The total number of words in the spam mail is %d and the total number of spam words in the spam mail is %d.%n", wordCount, spamCount);
        System.out.printf("Based on the limited list of spam words provided, the ratio of real words to spam words is :" +
                " %1.5f percent.%n", (double)(spamCount) / wordCount * 100);
        System.out.printf("Based on the ratio of words to spam, this email is likely to not be spam, which is incorrect.%n");
    }
}
