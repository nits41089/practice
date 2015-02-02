class Movie{
	String title;
	String genre;
	int rating;
	
	void playIt(){
		System.out.println("Playing the movie");
	}
}

class MovieTestDrive{
	public static void main(String[] args){
		Movie one = new Movie();
		one.title = "Singham";
		one.genre = "Action";
		one.rating = -2;

		Movie two = new Movie();
		two.title = "PK";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();

		Movie three = new Movie();
		three.title = "Baby";
		three.genre = "Action";
		three.rating = 4;
	}
}
