import java.util.ArrayList;
import java.util.StringTokenizer;

public class TwitterParser {
    private ArrayList<String> mentionsList = new ArrayList<String>();
    private ArrayList<String> hashtagsList = new ArrayList<String>();
    private ArrayList<String> urlsList = new ArrayList<String>();

    private String tweet;

    public static TwitterParser getInput(String input){
        TwitterParser tp = new TwitterParser();
        tp.tweet = input;
        tp.parse();
        return tp;
    }

    //Source on Tokenizer: https://crunchify.com/java-stringtokenizer-and-string-split-example/
    private void parse() {
        StringTokenizer st = new StringTokenizer(this.tweet);
        while (st.hasMoreElements()) {
            String token = st.nextToken();
            if (token.startsWith("@")) {
                mentionsList.add(token);
            } else if (token.startsWith("#")) {
                hashtagsList.add(token);
            } else if (token.startsWith("www.") || token.startsWith("https://")) {
                urlsList.add(token);
            }
        }
    }

    //Source: https://stackoverflow.com/questions/13429119/get-unique-values-from-arraylist-in-java
    //MENTIONS
    public ArrayList<String> getAllMentions() {
        ArrayList<String> uniqueMentions = new ArrayList<String>();
        uniqueMentions.addAll(mentionsList);
        return uniqueMentions;
    }

    public int numberOfMentions() {
        ArrayList<String> unique = new ArrayList<String>();
        unique.addAll(mentionsList);
        return unique.size();
    }

    //HASHTAGS
    public ArrayList<String> getAllHashtags() {
        ArrayList<String> uniqueHashtags = new ArrayList<String>();
        uniqueHashtags.addAll(hashtagsList);
        return uniqueHashtags;
    }

    public int numberOfHashtags() {
        ArrayList<String> unique = new ArrayList<String>();
        unique.addAll(hashtagsList);
        return unique.size();
    }

    //URLS
    public ArrayList<String> getAllUrls() {
        ArrayList<String> uniqueUrls = new ArrayList<String>();
        uniqueUrls.addAll(urlsList);
        return uniqueUrls;
    }

    public int numberOfUrls() {
        ArrayList<String> unique = new ArrayList<String>();
        unique.addAll(urlsList);
        return unique.size();
    }
}
