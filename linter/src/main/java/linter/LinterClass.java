package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LinterClass {

    public void semicolonChecker(){
        try{
            String errorMessage = "Missing semicolon";
            int lineCounter = 0;
            Scanner sc = new Scanner(new File("src/main/resources/gates.js"));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                lineCounter++;
                if(!(line.isEmpty()) && !(line.endsWith("{")) && !(line.endsWith("}")) && !(line.contains("if")) && !(line.contains("else"))){
                    if(!(line.endsWith(";"))){
                        System.out.println("Line " + lineCounter + ": " + errorMessage);
                    }
                }

            }

        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.out.println(e);
        }
    }
}
