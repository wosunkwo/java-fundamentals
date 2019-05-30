package basiclibrary;

public class ArrayManipulation {
    public int[] roll(int n){
        int[] resultArr =  new int [n];
        int min = 1;
        int max = 6;
        int randNum;

        for(int i =0; i < n; i++) {
            randNum = min + (int)(Math.random() * ((max-min) + 1));
            resultArr[i] = randNum;
        }
        return resultArr;
    }

    public boolean containsDuplicate(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public int calcAvg(int[] arr){
        int sum = 0;
        for(int number : arr ){
            sum += number;
        }
        return sum / arr.length;
    }

    public int[] array0fArrays(int[][] arr){
        if(arr.length > 0){
            int currentAvg = calcAvg(arr[0]);
            int[] resultArr = arr[0];
            int lowestAvg = currentAvg;
            for(int i = 1; i < arr.length; i++){
                currentAvg = calcAvg(arr[i]);
                if(lowestAvg > currentAvg){
                    lowestAvg = currentAvg;
                    resultArr = arr[i];
                }
            }
            return resultArr;
        }else{
            return null;
        }
    }

}
