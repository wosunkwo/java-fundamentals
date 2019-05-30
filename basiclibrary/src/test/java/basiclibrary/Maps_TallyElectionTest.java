package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class Maps_TallyElectionTest {
    /********************** Methods to Test the Weather function ****************************************/
    @Test
    public void mapsTestTruthy(){
        Maps_TallyElection classUnderTest = new Maps_TallyElection();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String expectedOutput = "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69";
        assertEquals("this should return 'true'", expectedOutput, classUnderTest.weather(weeklyMonthTemperatures));
    }

    @Test
    public void mapsTestFalsey(){
        Maps_TallyElection classUnderTest = new Maps_TallyElection();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String expectedOutput = "High: 72";

        assertFalse("this should return 'false'", expectedOutput == classUnderTest.weather(weeklyMonthTemperatures));
    }

    /********************** Methods to Test the Tally function ****************************************/
    @Test
    public void tallyTestTruthy(){
        Maps_TallyElection classUnderTest = new Maps_TallyElection();

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String expectedOutput = "Bush";

        assertEquals("this should return 'True'", expectedOutput, classUnderTest.tally(votes));
    }

    @Test
    public void tallyTestFalsey(){
        Maps_TallyElection classUnderTest = new Maps_TallyElection();

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String expectedOutput = "Hedge";

        assertFalse("this should return 'False'", expectedOutput == classUnderTest.tally(votes));
    }

}