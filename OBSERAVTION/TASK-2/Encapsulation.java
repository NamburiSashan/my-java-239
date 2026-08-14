package task1;
class books{
	   private int bookid;
	  private  String  bookname;
	   private String author;
	  private  double price;
	 public books( int id , String name , String author , double price){
	    this.bookid = id;
	    this.bookname = name;
	    this.author = author;
	    this.price = price;
	 }
	void setbookid(int id ){
	    bookid = id;
	}
	void setbookname(String name){
	    bookname = name;
	}
	void setauthor(String author ){
	   this.author = author;
	}
	void setprice(double price){
	    this.price = price;
	}
	int getbookid(){
	    return bookid;
	}
	String getbookname(){
	    return bookname;
	}
	String getauthor(){
	    return author;
	}
	double getprice(){
	    return price;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
	    books c = new books(221, "RICH DAD POOR DAD", "Robert T kiyosaki", 350.50);
	    System.out.println("book id is:" + c.getbookid());
	    System.out.println("book name is:" +c.getbookname());
	    System.out.println("author is:" + c.getauthor());
	    System.out.println("price is:" + c.getprice());

	}   
}