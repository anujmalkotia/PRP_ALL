class Author{
	String name;
	String email;
	Char gender;
	void setname(String n){
		name=n;
		}
	void setemail(String e){
		email=e;
		}
	void setgender(Char g){
		gender=g;
		}
	void getAuthorDetails(){
		System.out.println( "Author Name: " + name + "Email: " + email + "Gender" + gender );
		}
	}
class Book{
	String name;
	Double price;
	int qtyInStock;
	Author au= new Author();
	void setName(String bn){
		bname= bn;
		}
	void setPrice(Double p){
		price=p;
		}
	void setqty(int q){
		qtyInStock = q;
		}
	void getBookDetails(){
		System.out.println( "Name: " + bname + "Price : " + price + "Quantity: " + qtyInStock );
		}
	}
class mainmethod{
	public static void main(String args[]){
		Author au = new Author();
		au.setname("JK Rowling");
		au.setemail("jkrwling@yahoo.in");
		au.setgender("Female");
		au.getAuthorDetails();
		Book bo = new Book();
		bo.setName("Harry Potter");
		bo.setPrice(600.00);
		bo.setqty(45);
		bo.getBookDetails();
		}
	}
		
		