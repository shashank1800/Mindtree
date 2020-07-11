package Exe_31;

public class Customer {
	
	private String name;
	private String mobNo;
	private double feedbackRating;

	public Customer() {
	}
	

	public Customer(String name, String mobNo, double feedbackRating) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		this.feedbackRating = feedbackRating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public double getFeedbackRating() {
		return feedbackRating;
	}

	public void setFeedbackRating(double feedbackRating) {
		this.feedbackRating = feedbackRating;
	}
	
	

}
