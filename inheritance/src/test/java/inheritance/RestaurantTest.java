package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    //test case to check if the restaurant toString() method works
    @Test
    public void testRestaurantClass() {
        Restaurant classUnderTest = new Restaurant("Nobu", "$$$$", 4);
        String expectedOutput = "Welcome to Nobu, this is a 4 star restaurant. Our price categories is $$$$.";

        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutput, classUnderTest.toString());
    }

    //test case to check if the review toString() method works
    @Test
    public void testReviewClass() {
        Review classUnderTest = new Review("Williams Osunkwo", "This restaurant is crap, I really hated it. I am definitely never coming back here again", 1);
        String expectedOutput = "Author: Williams Osunkwo\n" +
                "Comment: This restaurant is crap, I really hated it. I am definitely never coming back here again\n" +
                "Number of Stars: 1\n";

        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutput, classUnderTest.toString());
    }

    //test case to check if the addReview method works for the restaurant class
    @Test
    public void testAddReviewClass() {
        Restaurant classUnderTest = new Restaurant("Nobu", "$$$$", 4);

        Review review = new Review("Williams Osunkwo", "This restaurant is crap, I really hated it. I am definitely never coming back here again", 1);
        Review review2 = new Review("James Bond", "This restaurant is actually nice, I really enjoyed my stay here. I will definitely be coming back again, whenever i am in the city", 5);
        classUnderTest.addReview(review);
        classUnderTest.addReview(review2);
        String expectedOutput = "Welcome to Nobu, this is a 3 star restaurant. Our price categories is $$$$.\n" +
                "This are our reviews below:\n" +
                "\n" +
                "Author: Williams Osunkwo\n" +
                "Comment: This restaurant is crap, I really hated it. I am definitely never coming back here again\n" +
                "Number of Stars: 1\n" +
                "\n" +
                "Author: James Bond\n" +
                "Comment: This restaurant is actually nice, I really enjoyed my stay here. I will definitely be coming back again, whenever i am in the city\n" +
                "Number of Stars: 5\n\n";

        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutput, classUnderTest.toString());
    }


}