package core.basesyntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileWork {
    public List<String> readFromFile(String fileName) {
        if (fileName.isEmpty()) return new ArrayList<>();

        String[] splitted = fileName.split("\\W+");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < splitted.length; i++) {
            String name = splitted[i].toLowerCase();
            if (!name.isEmpty() && name.charAt(0) == 'w') {
                result.add(name);
            }
        }
        return result;
    }
}



