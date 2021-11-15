package Library;

import DominoTable.DominoTile;

public class ReaderProfile {
	private String firstName;
	private String lastName;
	private int klas;
	private String paralelka;
	private long phoneNumber;
	private Book[] takenBooks;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getklas() {
		return klas;
	}
	
	public String getParalelka() {
		return paralelka;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setKlas(int klas) {
		this.klas = klas;
	}
	
	public void setParalka(String paralelka) {
		this.paralelka = paralelka;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public ReaderProfile(String firstName, String lastName, int klas , String paralelka, long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.klas = klas;
		this.paralelka = paralelka;
		this.phoneNumber = phoneNumber;
	}
	
	public ReaderProfile(Book b) {
		takenBooks[0] = b;
	}
	
	public void printTakenBooks() {
		for(Book book : takenBooks) {
				if(book != null) {
					System.out.println(book);
				}
			}
		}
	
	public String toString() {
		return String.format("Ime: %s %s \nKlas: %d \nParalelka: %s \nTelefon: %d \nVzetiKnigi:", 
				firstName, lastName, klas, paralelka,phoneNumber);
		//printTakenBooks()
		
	}
	
	
}
