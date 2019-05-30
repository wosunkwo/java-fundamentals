package basiclibrary;
import java.util.*;

public class Maps_TallyElection {
    public String weather(int[][] arr) {
        int MAX = 0;
        int MIN = arr[0][0];
        String resultStr = "";
        HashSet<Integer> uniqueTemp = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                uniqueTemp.add(arr[i][j]);
                if (MAX < arr[i][j]) {
                    MAX = arr[i][j];
                }
                if (i == 0 && j == 0) {
                    continue;
                } else if (MIN > arr[i][j]) {
                    MIN = arr[i][j];
                }
            }
        }
        resultStr = resultStr + "High: " + MAX;
        resultStr = resultStr + "\n" + "Low: " + MIN;

        for (int i = MIN + 1; i < MAX; i++) {
            if (!uniqueTemp.contains(i)) {
                resultStr = resultStr + "\n" + "Never saw temperature: " + i;
            }
        }
        return resultStr;
    }


    public static String tally(List<String> arrList) {
        //Create a hashmap to store all the unique names and the number of times they appear
        HashMap<String, Integer> wordCount = new HashMap<>();

        //loop through the arraylist and store the names found and then number of times they are found into the hashmap
        for (String name : arrList) {
            if (wordCount.containsKey(name)) {
                int countSoFar = wordCount.get(name);
                wordCount.put(name, countSoFar + 1);
            } else {
                wordCount.put(name, 0);
            }
        }

        int mostVoteCount = 0;
        String mostWordCount = "";

        //loop through the hashmap to find the key that has the most value i.e the name that occurs the most
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if(entry.getValue() > mostVoteCount){
                mostVoteCount = entry.getValue();
                mostWordCount = entry.getKey();
            }
        }
        return mostWordCount;
    }
}