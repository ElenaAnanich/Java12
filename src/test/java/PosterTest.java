import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    @Test
    public void showAll() {
        Poster film = new Poster();

        film.add("Film1");
        film.add("Film2");
        film.add("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouNull() {
        Poster film = new Poster();

        film.add("");
        String[] expected = {""};
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouOne() {
        Poster film = new Poster();


        film.add("Film1");

        String[] expected = {"Film1"};
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showAFindLast() {
        Poster film = new Poster(10);

        film.add("Film1");
        film.add("Film2");
        film.add("Film3");
        film.add("Film4");
        film.add("Film5");
        film.add("Film6");
        film.add("Film7");
        film.add("Film8");
        film.add("Film9");
        film.add("Film10");

        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showAFindLast2() {
        Poster film = new Poster(8);

        film.add("Film1");
        film.add("Film2");
        film.add("Film3");
        film.add("Film4");
        film.add("Film5");
        film.add("Film6");
        film.add("Film7");
        film.add("Film8");
        film.add("Film9");
        film.add("Film10");

        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3"};
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}