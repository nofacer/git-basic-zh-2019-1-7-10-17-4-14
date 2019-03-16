package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.ArrayList;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result = new ArrayList<>();
        for (String str : collection1) {
            for (List<String> subCollection : collection2) {
                if (subCollection.contains(str)) {
                    result.add(str);
                }
            }
        }
        return result;
    }
}
