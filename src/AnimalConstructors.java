
public class AnimalConstructors {
	Animals animals;
	Books books;
	TvShows shows;
	
	
	public static void main(String args[]) {
		Animals animals = new Animals("Max", true);
		Books books = new Books("The Gaurdian", 10, 1973);
		TvShows shows = new TvShows("Game of Thrones", 10, "Drama");
		AnimalConstructors animalConst = new AnimalConstructors(animals,books, shows);
	}
	
	public AnimalConstructors(Animals animals, Books books, TvShows show) {
		this.animals = animals;
		this.books = books;
		this.shows = show;
		// System.out.println(animals.name);
		
	}
}
	
	class Animals {
		private String name;
		private boolean isDog;

		//class constructor
		public Animals(String name, boolean isDog) {
			this.name = name;
			this.isDog = isDog;
			System.out.println(name + " " + isDog);
			
		}
 	}
	
	 class Books {
		private String title;
		private int noOfPages;
		private int publicationYear;

		public Books(String name, int pages, int  year) {
			this.title = name;
			this.noOfPages = pages;
			this.publicationYear = year;
			System.out.println(title+ " " +noOfPages + " " +publicationYear);
		}
	}
	
	class TvShows {
		
		private String showName;
		private int noOfEpisodes;
		private String genre;

		public TvShows(String showName, int noEpisodes, String genre) {
			this.showName = showName;
			this.genre = genre;
			this.noOfEpisodes = noEpisodes;
			System.out.println(showName+ " " + noOfEpisodes + " " +genre);
		}
		
	}
