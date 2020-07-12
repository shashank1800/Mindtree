package Exe_28;

public class Book {

	private String bookTitle;
	private double price;
	private int yearOfPublicaiton;
	private String authorsName;

	public Book(String authorsName, String bookTitle, double price,
			int yearOfPublicaiton) {

		this.bookTitle = bookTitle;
		this.price = price;
		this.yearOfPublicaiton = yearOfPublicaiton;
		this.authorsName = authorsName;
	}

	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYearOfPublicaiton() {
		return yearOfPublicaiton;
	}
	public void setYearOfPublicaiton(int yearOfPublicaiton) {
		this.yearOfPublicaiton = yearOfPublicaiton;
	}
	public String getAuthorsName() {
		return authorsName;
	}
	public void setAuthorsName(String authorsName) {
		this.authorsName = authorsName;
	}

	@Override
	public String toString() {
		return "Author : " + this.authorsName + "\n" + "Price : " + this.price
				+ "\n" + "Year of Publication : " + this.yearOfPublicaiton;
	}

}
