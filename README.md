# Twitter Parsing Engine

All the old commits can be found at https://github.com/MahaBKT/Twitter-Messaging-Engine   
A new repo was created for a cleaned up project structure that includes all working files.  
We created our project in IntelliJ and build it using Maven (we have included the pom.xml) file. 

## About & Running
For our project we built a parser that would take the tweet from that the user would input once the program is run. Running the program prompts the user to enter a tweet that can include mentions, hashtags, and URLs. Once a tweet is inputted, the program then parses through the tweet and stores all the mentions, hastags, and URLs in theirown respective ArrayLists and then print out the ArrayList and its size for each. It also only runs for tweets that follow the 280 character rule of Twitter. Any input greater than 280 characters will recieve a response of "Sorry, your tweet exceeds 280 characters."  

The program can be run in the IntelliJ IDEA IDE that was used to create this project.   
   
Additionally, the follwing link containns the screenshotd of what the outputs of running the program and running the tests are: https://drive.google.com/open?id=182xZkQOC6HrVeenYgcnBmDUCI7hsIBNI  

## Testing  
We tested several methods such as making sure that the mentions, hashtags, and URLS were being stored correctly, and that the size of the ArrayLists was accurate. We also tested out character length method. This was out first time creating JUnit tests, so the tests are basic tests that correspond to our TwitterParser class.  
  
## Challenges  
We faced challenges when creating our tests an realized that our IntelliJ did not have teh junit libraries and that they had to be manually added. Additionally, we faced several challenges with GitHub and the commits, thus leading to the creation of a new repository. But, the getting into the habit of making frequent commits was really helpful and illustrated the usefulness of having a version control system

## Sources  
Source on Tokenizer: https://crunchify.com/java-stringtokenizer-and-string-split-example/  
Source on Unique Values: https://stackoverflow.com/questions/13429119/get-unique-values-from-arraylist-in-java  
Source on JUnit Testing: http://www.vogella.com/tutorials/JUnit/article.html  
Source on Testing Size: https://users.ece.utexas.edu/~miryung/teaching/EE461L-Spring2012/labs/testing.html  

