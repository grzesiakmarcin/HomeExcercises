package strings.polimorphism;
/*
You are given four classes — Publication, Newspaper, Article and Announcement.
You need to override methods getType() and getDetails() in classes inherited from the class Publication.

Then you need to implement getInfo() in the class Publication using getType() and getDetails().
The method should return a String with a type of publication in the first place, then details
in round brackets and the title after a colon. Examples are shown below.


Sample Input:
Publication; The new era
Sample Output:
Publication: The new era


Sample Input:
Newspaper; Football results; Sport news
Sample Output:
Newspaper (source - Sport news): Football results


Sample Input:
Article; Why the Sun is hot; Dr James Smith
Sample Output:
Article (author - Dr James Smith): Why the Sun is hot


Sample Input 4:
Announcement; Will sell a house; 30
Announcement (days to expire - 30): Will sell a house

 */
public class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
    return "Publication: "+title;
    }


    public String getType(){return "" ;}

    public String getDetails() {return"";}




}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    @Override
    public String getDetails() {
        return source;

    }
    public String getType(){return "Newspaper";}
}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getType() {
        return"Article ";
    }

    @Override
    public String getDetails() {
        return "(author- "+author+"): ";
    }



}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    // write your code here

}