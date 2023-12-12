package Lab3.OtherProjects.hust.soict.dsai.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
        try {
            // Read a text file into a String using StringBuffer (no garbage)
            String content = readTextFileWithoutGarbage("garbage.txt");
            System.out.println("No garbage created successfully. Length: " + content.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read a text file into a String using StringBuilder (no garbage)
    private static String readTextFileWithoutGarbage(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder sb = new StringBuilder();
        String line;

        // Read each line from the file and append using StringBuilder (efficient, no garbage)
        while ((line = reader.readLine()) != null) {
            sb.append(line); // Using StringBuilder to concatenate strings (no garbage)
        }

        reader.close();
        return sb.toString();
    }
}