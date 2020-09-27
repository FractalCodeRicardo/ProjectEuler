import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P022NameScores implements IProblem {

    private String Archivo = "p022_names.txt";

    @Override
    public void solve() {

        List<String> names = obtenerNombres();
        Collections.sort(names);

        long total = 0;
        int i = 0;
        while(i< names.size()) {
            total += getScore(names, i);
            System.out.println(total);
            if (i == 937)
                System.out.println(total);

            i++;
        }
        System.out.println(total);
    }

    private long getScore(List<String> names, int index) {
        String name = names.get(index).replace("\"", "");
        int value = getNameValue(name);

        return value * (index+1);
    }

    private List<String> obtenerNombres() {
        Path path = Paths.get(Archivo);
        try {
            List<String> lines =  Files.readAllLines(path);
            return Arrays.asList(lines.get(0).split(","));
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


    private int getNameValue(String name) {
        int sum = 0;

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            sum += getCharValue(letter);
        }
        return sum;
    }

    private int getCharValue(char letter) {
        int ascci = (int) letter;
        return ascci - 64;
    }



}