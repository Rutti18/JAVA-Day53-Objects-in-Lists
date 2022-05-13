import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {
	
	private String name;
	private boolean isDog;

	//class constructor
	public Animal(String name, boolean isDog) {
		this.name = name;
		this.isDog = isDog;
	}
	//get name
	public String getName() {
		return name;
	}
	// get isDog 
	public boolean isDog() {
		return isDog;
	}
	// for printing the values  
    @Override  
    public String toString() {  
        String str = getName() + " is a dog = "+isDog();  
        return str;  
    }  

	public static void main(String[] args) {
		  List animals = new ArrayList();
		  Scanner scanObj = new Scanner(System.in);
		  String name;
		  boolean isDog;
		  String input1 = "empty"; //store user input for name
		  String input2 = ""; //store user input for isDog
		  System.out.print("Animal Menu \n");
		  System.out.print("Entering nothing will stop the loop\n");
		  while (!input1.isEmpty()) {//break the loop when user enters ""
			  System.out.print("Please enter a name");
			  input1 = scanObj.nextLine();  // Read user input
			  name = input1;
			  System.out.print("Is it a dog? yes or no: ");
			  input2 = scanObj.nextLine();  // Read user input
			  if(input2.equals("yes")) {
				  isDog = true;
			  }else {
				  isDog = false;
			  }
			  if(!input1.isEmpty())
			  animals.add(new Animal(name,isDog));
			} 
		  
		  for (int i=0; i<animals.size(); i++) {
			  System.out.println(animals.get(i).toString());
		  }

	}

}
