import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
public class Main {
  public static void main (String[] args){
    int dogCount = 1;
    int catCount = 2;
    int mouseCount = 3;
    System.out.println("i have " + dogCount + " " + pluralize("dog", dogCount));
    System.out.println("i have " + catCount + " " + pluralize("cat", catCount));
    System.out.println("i have " + mouseCount + " " + pluralize("mouse", mouseCount));
    System.out.println(flipNHeads(5));
    clock();
  }

  public static String pluralize(String word, int num){
    if(num == 0 || num > 1){
      return word + 's';
    }else {
      return word;
    }
  }

  public static String flipNHeads(int n){
    int cnt = 0;
    int min = 0;
    int max = 1;
    int numOfFlips = 0;
    
    while(cnt < n){
      double randNum = min + (double)(Math.random() * ((max - min)));
      if(randNum < 0.5){
        System.out.println("tails");
        cnt = 0;
      }else{
        System.out.println("heads");
        cnt++;
      }
      numOfFlips++;
    }
    return "It took " + numOfFlips + " " + pluralize("flip", numOfFlips) + " to flip " + n + " " + pluralize("head", n) + " in a row";
  }

  public static void clock(){
    LocalDateTime now = LocalDateTime.now();
    int second = now.getSecond();
    while(true){
      now = LocalDateTime.now();
      int newSecond = now.getSecond();
      if(second != newSecond){
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
        second = newSecond;
      }
     }  
  }
}