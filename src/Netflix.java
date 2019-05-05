
public class Netflix {
	public static void main(String[] args) {
		Movie jaws = new Movie("Jaws", 5);
		Movie titanic = new Movie("Titanic,", 1);
		Movie rocky = new Movie("Rocky", 3);
		Movie matrix = new Movie("Matrix", 5);
		Movie avatar = new Movie("Avatar", 5);
		System.out.println(jaws.getTicketPrice());
		NetflixQueue queue= new NetflixQueue();
		queue.addMovie(jaws);
		queue.addMovie(titanic);
		queue.addMovie(rocky);
		queue.addMovie(matrix);
		queue.addMovie(avatar);
		queue.printMovies();
		
		
	}

}
