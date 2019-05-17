package dto;

public class Book {

	private int bookId;
	private String bookName;
	private String author;
	private int  pageCosunt;
	private int price;
	public Book(int bookId, String bookName, String author, int pageCosunt, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.pageCosunt = pageCosunt;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", pageCosunt=" + pageCosunt
				+ ", price=" + price + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPageCosunt() {
		return pageCosunt;
	}
	public void setPageCosunt(int pageCosunt) {
		this.pageCosunt = pageCosunt;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
