import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

	private String title;
	private int noOfPages;
	private int publicationYear;
	
	
	public String getTitle() {
		return title;
	}


	public int getNoOfPages() {
		return noOfPages;
	}


	public int getPublicationYear() {
		return publicationYear;
	}

	
	public Book(String name, int pages, int  year) {
		this.title = name;
		this.noOfPages = pages;
		this.publicationYear = year;
	}

	public Book(String name) {
		this.title = name;
	}

	
	// for printing the values  
    @Override  
    public String toString() {  
    	  String str = "";
    	  str = getTitle() + " , "+ getNoOfPages() + " , "+ getPublicationYear();  
    	if(getNoOfPages() == 0 || getPublicationYear() ==0 ) {
    		str =  getTitle();
    	}	
         
        return str;  
    }  
    
	// for printing the values  
    public String titleToString() {  
        String str = getTitle() ;  
        return str;  
    }  
    
    
    public static void main(String[] args) {
  	  List books = new ArrayList();
  	 List titles = new ArrayList();
	  Scanner scanObj = new Scanner(System.in);
	  
	  String title;
	  int  year;
	  int  pages; 

	  String input1 = "empty"; 
	  String input2 = "";//store user input for name
	  while (!input1.isEmpty()) {//break the loop when user enters ""
		  System.out.print("Enter book name:");
		  input1 = scanObj.nextLine();  // Read user input
		  title = input1;
		  
		  
		  System.out.print("No of pages?");
		  input2 = scanObj.nextLine();  // Read user input
		  if ( input2.isEmpty()) input2="0";
		  pages = Integer.parseInt(input2);
		  
		  System.out.print("Year published?");
		  input2 = scanObj.nextLine();  // Read user input
		  if ( input2.isEmpty()) input2="0";
		  year = Integer.parseInt(input2);
		  
		  if(!input1.isEmpty())
			  books.add(new Book(title,pages, year));
		  	  titles.add(new Book(title));
		} 
	  
		  System.out.print("What is to be printed?");
		  input1 = scanObj.nextLine();  // Read user input
	  
		  if (input1.equals("everything")){
				  for (int i=0; i<books.size(); i++) {
					  	System.out.println(books.get(i).toString());
				  }
	    	
		  } else if (input1.equals("name")){
			  for (int i=0; i<titles.size(); i++) {
				  	System.out.println(titles.get(i).toString());
			  }
  	 
		  }
    }

}
