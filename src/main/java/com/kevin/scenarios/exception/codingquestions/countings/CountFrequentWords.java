package com.kevin.scenarios.exception.codingquestions.countings;

import java.util.HashMap;
import java.util.Map;

public class CountFrequentWords {
    public static void main(String[] args) {
        String value = "Im kevin Im manu Im Raj";
        String[] s = value.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String words : s) {
            wordCount.put(words, wordCount.getOrDefault(words, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        String maxWord = null;
        int maxCount=0;

        for (Map.Entry<String,Integer> entry : wordCount.entrySet())
        {
            if(entry.getValue()>maxCount)
            {
                maxWord=entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Most frequent word: " + maxWord + " (Count: " + maxCount + ")");
    }
}
