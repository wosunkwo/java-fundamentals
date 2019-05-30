package linter;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinterClassTest {

    @Test
    public void linterTestEmptyFile() {
        LinterClass classUnderTest = new LinterClass();
        String path = "src/main/resources/empty_file.js";
        String expectedOutput = "";
        assertEquals("this should return 'true'", expectedOutput, classUnderTest.semicolonChecker(path));

    }
    @Test
    public void linterTestNoErrors(){
        LinterClass classUnderTest = new LinterClass();
        String path = "src/main/resources/no_errors_file.js";
        String expectedOutput = "";
        assertEquals("this should return 'true'", expectedOutput, classUnderTest.semicolonChecker(path));
    }

    @Test
    public void linterTestOneErrors(){
        LinterClass classUnderTest = new LinterClass();
        String path = "src/main/resources/one_error_file.js";
        String expectedOutput = "Line 6: Missing semicolon.\n";
        assertEquals("this should return 'true'", expectedOutput, classUnderTest.semicolonChecker(path));
    }

    @Test
    public void linterTestFewErrors(){
        LinterClass classUnderTest = new LinterClass();
        String path = "src/main/resources/few_errors_file.js";
        String expectedOutput = "Line 4: Missing semicolon.\n"+
                "Line 5: Missing semicolon.\n" +
                "Line 7: Missing semicolon.\n";
        assertEquals("this should return 'true'", expectedOutput, classUnderTest.semicolonChecker(path));
    }

    @Test
    public void linterTestManyErrors(){
        LinterClass classUnderTest = new LinterClass();
        String path = "src/main/resources/many_errors_file.js";
        String expectedOutput = "Line 1: Missing semicolon.\n"+
                "Line 2: Missing semicolon.\n" +
                "Line 3: Missing semicolon.\n" +
                "Line 4: Missing semicolon.\n" +
                "Line 5: Missing semicolon.\n" +
                "Line 6: Missing semicolon.\n";
        assertEquals("this should return 'true'", expectedOutput, classUnderTest.semicolonChecker(path));
    }
}