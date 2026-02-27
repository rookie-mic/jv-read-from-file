package core.basesyntax;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWork fileWork = new FileWork();
        System.out.println(fileWork.readFromFile(
                "C:\\intellijProjects\\jv-read-from-file\\src\\main\\testFile"));
    }
}
