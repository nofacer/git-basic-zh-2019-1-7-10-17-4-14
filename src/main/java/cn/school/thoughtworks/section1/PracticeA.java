package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> result = new ArrayList<>();
        for (String str : collection1) {
            if (collection2.contains(str)) {
                result.add(str);
            }
        }

        return result;
    }
}
