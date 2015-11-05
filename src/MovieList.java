import java.util.*;

public class MovieList {
	private Collection movies = new ArrayList();

	public int size() {
		return movies.size();
	}

	public void add(Movie aMovie) {
		movies.add(aMovie);
	}

	public boolean contains(Movie aMovie) {
		return movies.contains(aMovie);

	}
}