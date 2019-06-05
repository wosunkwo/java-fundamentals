package inheritance;

import org.junit.Test;

import java.util.ArrayList;

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
                "Number of Stars: 1\n"+
                "For: ";

        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutput, classUnderTest.toString());
    }

    //test case to see if reviews are associated to the restaurants they are created for
    @Test
    public void testReviewToRestaurantClass() {
        Restaurant burgerKing = new Restaurant("Burger King", "$$$$", 4);
        Restaurant tacoBell = new Restaurant("Taco Bell", "$$", 2);

        Review review1 = new Review("Williams Osunkwo", "This restaurant is crap, I really hated it. I am definitely never coming back here again", 1);
        Review review2 = new Review("James Bond", "This restaurant is actually nice, I really enjoyed my stay here. I will definitely be coming back again, whenever i am in the city", 5);
        burgerKing.addReview(review2);
        tacoBell.addReview(review1);

        String expectedOutputName1 = "Burger King";
        String expectedOutputReview1 = "[Author: James Bond\n" +
                "Comment: This restaurant is actually nice, I really enjoyed my stay here. I will definitely be coming back again, whenever i am in the city\n" +
                "Number of Stars: 5\n" +
                "For: ]";

        String expectedOutputName2 = "Taco Bell";
        String expectedOutputReview2 = "[Author: Williams Osunkwo\n" +
                "Comment: This restaurant is crap, I really hated it. I am definitely never coming back here again\n" +
                "Number of Stars: 1\n" +
                "For: ]";

        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutputName1, burgerKing.getName());
        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutputReview1, burgerKing.getReview().toString());

        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutputName2, tacoBell.getName());
        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutputReview2, tacoBell.getReview().toString());
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
                "For: \n" +
                "Author: James Bond\n" +
                "Comment: This restaurant is actually nice, I really enjoyed my stay here. I will definitely be coming back again, whenever i am in the city\n" +
                "Number of Stars: 5\n" +
                "For: \n";

        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutput, classUnderTest.toString());
    }


//test case to make sure duplicate reviews dont get added to the restaurant
    @Test
    public void testforDuplicateReviews() {
        Restaurant burgerKing = new Restaurant("Burger King", "$$$$", 2);

        Review review1 = new Review("Williams Osunkwo", "This restaurant is crap, I really hated it. I am definitely never coming back here again", 1);
        burgerKing.addReview(review1);
        burgerKing.addReview(review1);

        int expectedOutput = 1;


        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutput, burgerKing.getReview().size());

    }

}