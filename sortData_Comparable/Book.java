package sortData_Comparable;

public class Book implements Comparable<Book> {
	
	String bookName;
	int ISBN;
	
	
	public Book(String bookName, int iSBN) {
		this.bookName = bookName;
		this.ISBN = iSBN;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	@Override
	public int compareTo(Book b) {
		//return this.ISBN - b.ISBN;
		return this.getBookName().compareTo(b.bookName);
	}
	
	@Override
	public String toString() {

		return bookName+" "+ISBN;
	}

}
