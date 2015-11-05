import junit.framework.TestCase;

public class TestMovieList extends TestCase {
	public void testEmptyListSize() {
		MovieList emptyList = new MovieList();
		assertEquals("Size of empty movie list should be 0.", 0,
				emptyList.size());
	}

	public void testSizeAfterAddingOne() {
		Movie starWars = new Movie("Star Wars");
		MovieList oneItemList = new MovieList();
		oneItemList.add(starWars);
		assertEquals("Size of one item list should be 1.", 1,
				oneItemList.size());
	}

	public void testSizeAfterAddingTwo() {
		Movie starWars = new Movie("Star Wars");
		Movie starTrek = new Movie("Star Trek");
		MovieList twoItemList = new MovieList();
		twoItemList.add(starWars);
		twoItemList.add(starTrek);
		assertEquals("Size of a two item list should be 2.", 2,
				twoItemList.size());
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(TestMovieList.class);
	}
}