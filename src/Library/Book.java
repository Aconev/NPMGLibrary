package Library;

public class Book {

	private String bookName;
	private String author;
	private String publisherHouse;
	private long isbn;

	public Book() {
		bookName = "";
		author = "";
		publisherHouse = "";
		isbn = 0;
	}
	
	public Book(String bookName, String author, String publisherHouse, long isbn) {
		this.bookName = bookName;
		this.author = author;
		this.publisherHouse = publisherHouse;
		this.isbn = isbn;
	}

	String getBookName() {
		return bookName;
	}
	
	String getAuthor() {
		return author;
	}
	
	String publisherHouse() {
		return publisherHouse;
	}
	
	Long isbn() {
		return isbn;
	}
	
	public String toString() {
		return String.format("Book Name:%s \nAuthor:%s \nPublisher House:%s \nIsbn:%d"
				, bookName, author, publisherHouse, isbn );
	}
	
}
