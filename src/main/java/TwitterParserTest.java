import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class TwitterParserTest extends TwitterParser {

    //Source: http://www.vogella.com/tutorials/JUnit/article.html

    String tweet1 = "I like @apples more than #bananas , check the bananas at www.bananas.com";
    String tweet2 = "I like @oranges and @pineapples because #they are #delicious and you can #learn more at www.pineapples.com or http://www.oranges.com";
    String tweet3 = "#Lorem ipsum dolor sit amet, @consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat mass";


    @Test
    public void testMentions() {
        TwitterParser tweet = TwitterParser.getInput(tweet1);
        ArrayList<String> testMentions = new ArrayList<String>();
        testMentions.add("@apples");
        assertEquals(testMentions, tweet.getAllMentions());
    }

    @Test
    public void testHashtags(){
        TwitterParser tweet = TwitterParser.getInput(tweet1);
        ArrayList<String> testHashtags = new ArrayList<String>();
        testHashtags.add("#bananas");
        assertEquals(testHashtags, tweet.getAllHashtags());
    }

    @Test
    public void testUrls(){
        TwitterParser tweet = TwitterParser.getInput(tweet1);
        ArrayList<String> testUrls = new ArrayList<String>();
        testUrls.add("www.bananas.com");
        assertEquals(testUrls, tweet.getAllUrls());
    }

    //Source: https://users.ece.utexas.edu/~miryung/teaching/EE461L-Spring2012/labs/testing.html
    @Test
    public void testNumberOfMentions() {
        ArrayList<String> mentions = new ArrayList<String>();
        mentions.add("@oranges");
        mentions.add("@pineapples");
        assertEquals(mentions.size(), 2);
        assertTrue(mentions.size() == 2);
        assertFalse(mentions.size() == 3);
        assertFalse(mentions.size() != 2);
    }

    @Test
    public void testNumberOfHashtags() {
        ArrayList<String> hashtags = new ArrayList<String>();
        hashtags.add("#they");
        hashtags.add("#delicious");
        hashtags.add("#learn");
        assertEquals(hashtags.size(), 3);
        assertTrue(hashtags.size() == 3);
        assertFalse(hashtags.size() == 4);
        assertFalse(hashtags.size() != 3);

    }

    @Test
    public void testNumberOfUrls() {
        ArrayList<String> urls = new ArrayList<String>();
        urls.add("www.pineapples.com");
        urls.add("https://www.oranges.com/");
        assertEquals(urls.size(),2);
        assertTrue(urls.size() == 2);
        assertFalse(urls.size() == 3);
        assertFalse(urls.size() != 2);
    }

    @Test
    public void testLength() {
        assertTrue(tweet1.length() <= 280);
        assertFalse(tweet1.length() > 280);
        assertTrue(tweet2.length() <= 280);
        assertFalse(tweet2.length() > 280);
        assertFalse(tweet3.length() <= 280);
        assertTrue(tweet3.length() > 280);
    }
}
