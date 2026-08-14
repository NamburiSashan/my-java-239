package task1;
class book{
	int bookid;
	String bookname;
	String author;
	double price;
	void display() {
		System.out.println("book id name is " + bookid);
		System.out.println("bookname is " + bookname);
		System.out.println("book author is " + author);
		System.out.println("price of the book is " + price);
	}
}

public class BookId {
	public static void main(String[] args) {
		book b = new book();
		b.bookid = 244;
		b.bookname = "RICH DAD POOR DAD";
		b.author = "Robert T Kiyosaki";
		b.price = 399;
		book l = new book();
		l.bookid = 221;
		l.bookname = "The Psychology of Money";
		l.author = "Morgan Housel";
		l.price = 599;
		b.display();
		l.display();
	}

}
