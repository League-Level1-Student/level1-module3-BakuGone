package _05_netflix;

public class Netflix implements Runnable {
	
	public void main() {
		
		Movie k12 = new Movie("K-12", 3);
		Movie beeMovie = new Movie("The Bee Movie", 1);
		Movie mhaTwoHeros = new Movie("My Hero Academia: The Two Heros", 4);
		Movie filler = new Movie("Filler", 2);
		Movie spongebobTheAnime = new Movie("Spongebob the Anime", 5);
		
		beeMovie.getTicketPrice();
		
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(k12);
		queue.addMovie(beeMovie);
		queue.addMovie(mhaTwoHeros);
		queue.addMovie(filler);
		queue.addMovie(spongebobTheAnime);
		
		queue.printMovies();
		queue.sortMoviesByRating();
		System.out.println("The best movie in your queue is " + queue.getBestMovie());
		System.out.println("The second best movie in your queue is " + queue.getMovie(1));
		
	}

	@Override
	public void run() {

		main();
	}
}
