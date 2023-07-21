
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class wordcount {
    public static void main(String[] args){
        Scanner sc = null;
        try{
            sc = new Scanner(new File("input.txt"));
        }catch (FileNotFoundException e){
            System.out.println("File not found: "+ e.getMessage());
            return;
        }
        int count = 0;
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] words = line.split("\\s+");
            for (String word : words){
                if(word.equalsIgnoreCase("Java")){
                    count++;
                }
            }
        }
        sc.close();
        System.out.println("Total occurrences of Java"+count);
    }
}
