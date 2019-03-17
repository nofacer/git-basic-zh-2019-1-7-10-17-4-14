package cn.school.thoughtworks.section3;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PracticeC {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //Creat dict
        Map<String, Integer> sumDict = new HashMap<String, Integer>() {
        };
        for (String str : collectionA) {
            int amount = 1;//default amount
            String key = String.valueOf(str.charAt(0));//get key
            // if input is not in regular format
            if (str.length() > 1) {
                int start = 0;
                int end = 0;
                int mark = 0;
                for (int i = 1; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (Character.isDigit(c) && mark == 0) {
                        start = i;
                        end = start;
                        mark = 1;
                        continue;
                    }
                    if (Character.isDigit(c) && mark == 1) {
                        end += 1;
                    }
                }
                String numString = str.substring(start, end + 1);
                amount = Integer.parseInt(numString);
            }
            // Update dict
            if (sumDict.containsKey(key)) {
                sumDict.put(key, sumDict.get(key) + amount);
            } else {
                sumDict.put(key, amount);
            }
        }
        // update
        for (String str : object.get("value")) {
            sumDict.put(str, sumDict.get(str) - sumDict.get(str) / 3);
        }
        return sumDict;
    }

}
