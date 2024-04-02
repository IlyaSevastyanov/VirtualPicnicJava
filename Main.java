import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        System.out.println("Количество слов в файле: " + FileWordStatistics.countOfWords(map));
        System.out.println();
        FileWordStatistics.printFileData(map);
        System.out.println();
        System.out.println("Cамое длинное слово: "  + FileWordStatistics.longestWord(map));
    }

}