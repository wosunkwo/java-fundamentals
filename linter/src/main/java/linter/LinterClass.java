package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LinterClass {

    public String semicolonChecker(String path){
        String resultStr = "";
        try{
            String errorMessage = "Missing semicolon.";
            int lineCounter = 0;
            Scanner sc = new Scanner(new File(path));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                lineCounter++;
                if(!(line.isEmpty()) && !(line.endsWith("{")) && !(line.endsWith("}")) && !(line.contains("if")) && !(line.contains("else"))){
                    if(!(line.endsWith(";"))){
                        resultStr = resultStr + "Line " + lineCounter + ": " + errorMessage + "\n" ;
//                        System.out.println("Line " + lineCounter + ": " + errorMessage);

                    }
                }

            }
        return resultStr;
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            System.out.println(e);
            return "";
        }

    }
}
