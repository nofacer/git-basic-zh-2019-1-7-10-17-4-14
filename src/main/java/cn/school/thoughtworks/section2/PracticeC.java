package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<String, Integer>() {
        };
        for (String str : collection1) {
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
            if (result.containsKey(key)) {
                result.put(key, result.get(key) + amount);
            } else {
                result.put(key, amount);
            }
        }
        return result;
    }
}
