import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TvShow {
	
	private String showName;
	private int noOfEpisodes;
	private String genre;

	public String getShowName() {
		return showName;
	}

	public int getNoOfEpisodes() {
		return noOfEpisodes;
	}

	public String getGenre() {
		return genre;
	}
	
	public TvShow(String showName, int noEpisodes, String genre) {
		this.showName = showName;
		this.genre = genre;
		this.noOfEpisodes = noEpisodes;
	}
	
	
	// for printing the values  
    @Override  
    public String toString() {  
        String str = "The name of the show is "+getShowName() + " with "+ getNoOfEpisodes() + "number of episodes. The genre is + "+ getGenre();  
        return str;  
    }  

	public static void main(String[] args) {
		  List tvshows = new ArrayList();
		  Scanner scanObj = new Scanner(System.in);
		  
		  String showName;
		  String genre;
		  String noOfEpisodes = ""; 

		  String input1 = "empty"; //store user input for name
		  while (!input1.isEmpty()) {//break the loop when user enters ""
			  System.out.print("Please enter name of the show:");
			  input1 = scanObj.nextLine();  // Read user input
			  showName = input1;
			  
			  
			  System.out.print("How many episodes?");
			  input1 = scanObj.nextLine();  // Read user input
			  noOfEpisodes = input1;
			  
			  System.out.print("What is the genre?");
			  input1 = scanObj.nextLine();  // Read user input
			  genre = input1;
			  
			  if(!input1.isEmpty())
				  tvshows.add(new TvShow(showName,Integer.parseInt(noOfEpisodes), genre));
			} 
		  
		  for (int i=0; i<tvshows.size(); i++) {
			  System.out.println(tvshows.get(i).toString());
		  }
		
	}
	
}
