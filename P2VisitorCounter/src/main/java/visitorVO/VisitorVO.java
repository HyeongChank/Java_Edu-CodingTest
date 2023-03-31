package visitorVO;

import java.util.Date;

public class VisitorVO {
	private String name;
	private String tel;
	private String story;
	private int score;
	private Date date;
	public VisitorVO() {
		
	}
	public VisitorVO(String name, String tel, String story, int score, Date date) {
		this.name = name;
		this.tel = tel;
		this.story = story;
		this.score = score;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "VIsitorVO [name=" + name + ", tel=" + tel + ", story=" + story + ", score=" + score + "]";
	}
	
	
}
