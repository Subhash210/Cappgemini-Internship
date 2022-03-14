package assignment9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
    
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	} 
    
}




public class Assignment9Q2 {
	
    public static int maxComments(List<News> news) {
    	
    	news.stream().
    }

    public static int budgetCount (List < News > news) {}
    public static String maxCommentsByUser (List < News > news) {}

    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {}

    public static void main(String[] args) {
    	
    	ArrayList<News> newsList = new ArrayList<>();
    	
    	News N1 = new News(1, "Captain", "Thor", "Your shield broken Captain");
    	News N2 = new News(2, "Thor", "Iron Man", "I have enough budget to get your shild fix"); 
    	News N3 = new News(3, "Black Widow", "Thor", "Asgard has enough budget to fix the damage done by hulk");
    	News N4 = new News(1, "Captain", "Spider Man", "You look exhausted Cap");     	
    	News N5 = new News(2, "Thor", "Captain", "I can lift your hammer dude");
    	News N6 = new News(1, "Captain", "Iron Man", "You want someting to eat");
    	
    	newsList.add(N1);
    	newsList.add(N2);
    	newsList.add(N3);
    	newsList.add(N4);
    	newsList.add(N5);
    	newsList.add(N6);
    }
}
