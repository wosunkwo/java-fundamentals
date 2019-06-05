package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
        //test case to check if the shop toString() method works
        @Test
        public void testShopClass() {
            Shop classUnderTest = new Shop("Walmart", "You can come here to get your everyday items", "$$$");
            String expectedOutput = "Welcome to Walmart. Our description is: You can come here to get your everyday items. We are a $$$ shop";

            assertEquals("this should return true if the expected output and the actual output are the same", expectedOutput, classUnderTest.toString());
        }

        //test case to check if the relationship between the shop class abd review class works
    @Test
    public void testReviewShopClass() {
        Shop classUnderTest = new Shop("Walmart", "You can come here to get your everyday items", "$$$");
        Review review = new Review("Williams", "I like it", 4);
        classUnderTest.addReview(review);

        String expectedOutput = "Welcome to Walmart. Our description is: You can come here to get your everyday items. We are a $$$ shop\n" +
                "These are our reviews below:\n" +
                "\n" +
                "Author: Williams\n" +
                "Comment: I like it\n" +
                "Number of Stars: 4\n" +
                "For: \n";

        assertEquals("this should return true if the expected output and the actual output are the same", expectedOutput, classUnderTest.toString());
    }
}

