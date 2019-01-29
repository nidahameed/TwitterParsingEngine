import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner newTweet = new Scanner(System.in);

        System.out.println("Hello! Please enter a tweet. Your tweet can include mentions, hashtags, and URLs. Your tweet must not exceed 280 characters.");
        String tweet = newTweet.nextLine();

        //makes sure that tweet meets the 280 characters requirement
        if (tweet.length() <= 280) {
            TwitterParser tp = TwitterParser.getInput(tweet);

            System.out.println("Mentions used in your tweet: " + tp.getAllMentions());
            System.out.println("Number of mentions used in your tweet: " + tp.numberOfMentions());
            System.out.println("Hashtags used in your tweet: " + tp.getAllHashtags());
            System.out.println("Number of hashtags used in your tweet: " + tp.numberOfHashtags());
            System.out.println("URLs used in your tweet: " + tp.getAllUrls());
            System.out.println("Number of URLs used in our tweet: " + tp.numberOfUrls());
        } else {
            System.out.println("Sorry, you tweet exceeds 280 characters.");
        }


    }
}