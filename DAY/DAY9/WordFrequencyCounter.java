package com.helloworld;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> wordMap = new HashMap<>();
        System.out.println("Please enter a paragraph of text:");
        String paragraph = scanner.nextLine();
        String[] words = paragraph.split("\\s+");
        for(String word : words){
            word = word.toLowerCase().replaceAll("[^a-z]" ,"");
            if(!word.isEmpty()){
                int frequency = wordMap.getOrDefault(word,0);
                frequency++;
                wordMap.put(word,frequency);
            }

        }
        System.out.println("Word\tFrequency");
        for(Map.Entry<String,Integer>  entry : wordMap.entrySet()){
            String word = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(word+"\t"+frequency);
        }
        scanner.close();


    }

    }
