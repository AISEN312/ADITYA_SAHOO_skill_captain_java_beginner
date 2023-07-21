import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class SentenceWriter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a sentence:");
        String sentence = sc.nextLine() ;
        sc.close();
        FileWriter fw = null;
        try {
            fw = new FileWriter("output.txt");
            fw.write(sentence);
            System.out.println("The sentence has been written to the output.txt file successfully.");

        }catch (IOException e){
            System.out.println("An error occurred while writing to the output.txt file: " + e.getMessage());
        }finally {
            if(fw!=null){
                try{
                    fw.close();
                } catch (IOException e){
                    System.out.println("An error occurred while closing the output.txt file: " + e.getMessage());
                }
            }
        }
    }

}
