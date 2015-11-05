import java.util.*;

public class MovieList {
	private int numberOfMovies = 0;
	private ArrayList<Movie> movies;

	public MovieList() {
		movies = new ArrayList<Movie>();
	}

	public int size() {
		return numberOfMovies++;
	}

	public void add(Movie aMovie) {
		movies.add(aMovie);
	}

}