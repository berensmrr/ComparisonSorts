import java.io.*;
import java.util.ArrayList;

public class FileOperations {
    // read from file
    public static int[] readFromFile(String filePath) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (!line.isEmpty()) {
                list.add(Integer.parseInt(line));
            }
        }
        br.close();

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
    //write to file data
    public static void writeToFile(String filePath, int[] array) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i] + "\n");
        }
        bw.close();
    }
}