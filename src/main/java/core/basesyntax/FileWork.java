package core.basesyntax;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileWork {
    public String[] readFromFile(String fileName) throws IOException {
        if (fileName.length() == 0 || fileName == null) {
            return new String[0];
        }

        String s = Files.readString(Paths.get(fileName));
        String[] splitted = s.split("\\W+");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < splitted.length; i++) {
            String name = splitted[i].toLowerCase();
            if (!name.isEmpty() && name.charAt(0) == 'w') {
                result.add(name);
            }
        }
        Collections.sort(result);
        return result.toArray(new String[0]);
    }
}



