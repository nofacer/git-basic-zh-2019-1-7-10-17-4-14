package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> result = new HashMap<String, Integer>() {
        };
        for (String str : collection1) {
            if (result.containsKey(str)) {
                result.put(str, result.get(str) + 1);
            }
            else{
                result.put(str, 1);
            }
        }
        return result;
    }
}
