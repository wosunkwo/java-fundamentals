package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    @Test
    public void testTheaterClass() {
        Theater classUnderTest = new Theater("AMC");
        classUnderTest.addMovie("Endgame");
        classUnderTest.addMovie("Iron Man");
        classUnderTest.addMovie("Avengers");

        String expectedOutput = "Hello, Welcome to AMC theater. These are our current list of movies:\n" +
                "Avengers\n" +
                "Endgame\n" +
                "Iron Man\n" +
                "\n" +
                "These are our current list of reviews:\n";


        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutput, classUnderTest.toString());
    }

    @Test
    public void testReviewTheaterClass() {
        Theater theater = new Theater("AMC");
        Review review = new Review("Williams", "I like it", 2);
        theater.addReview(review);

        String expectedOutput = "Hello, Welcome to AMC theater. These are our current list of movies:\n" +
                "\n" +
                "These are our current list of reviews:\n" +
                "Author: Williams\n" +
                "Comment: I like it\n" +
                "Number of Stars: 2\n" +
                "For: \n";

        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutput, theater.toString());
    }


    @Test
    public void testReviewMovieTheaterClassHappy() {
        Theater amcTheater = new Theater("AMC");
        amcTheater.addMovie("Avengers");
        Review review = new Review("Williams", "I like it", 2, amcTheater, "Avengers");

        String expectedOutput = "Hello, Welcome to AMC theater. These are our current list of movies:\n" +
                "Avengers\n" +
                "\n" +
                "These are our current list of reviews:\n" +
                "Author: Williams\n" +
                "Comment: I like it\n" +
                "Number of Stars: 2\n" +
                "For: Avengers\n";

        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutput, amcTheater.toString());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testReviewMovieTheaterClassSad() {
        Theater amcTheater = new Theater("AMC");
        amcTheater.addMovie("Avengers");
        Review review = new Review("Williams", "I like it", 2, amcTheater, "Iron Man");

        amcTheater.toString();

    }
}