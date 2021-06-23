package com.Justin;

import java.util.HashMap;
import java.util.Map;

// ***  from java docs  ***

public class FrequencyString {
    public static void frequency(String input) {
        Map<String, Integer> mapObject = new HashMap<String, Integer>();

        // convert input string to String array
        // need to optimize regex to remove punctuation
        String[] words = input.split("\\s+");

        // Initialize frequency table
        for (String word : words) {
            Integer freq = mapObject.get(word);
            mapObject.put(word, (freq == null) ? 1 : freq + 1);
        }
        // output map
        System.out.println(mapObject.size() + " distinct words:");
        System.out.println(mapObject);
    }
}
