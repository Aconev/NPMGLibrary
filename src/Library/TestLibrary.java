package Library;

public class TestLibrary {

	public static void main(String[] args) {
		Book book1 = new Book("1", "1", "1", 1230000000000L);
		ReaderProfile uchenik1 = new ReaderProfile("Gosho", "Losho",11, "a",1230000000008L);
		
		System.out.println(book1);
		System.out.println(uchenik1);

	}

}
