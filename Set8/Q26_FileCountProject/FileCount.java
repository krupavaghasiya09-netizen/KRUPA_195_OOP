import java.io.*;

public class FileCount {
    public static void main(String[] args) {
        
            if (args.length == 0) {
            System.out.println("Please provide file name as argument");
            return;
        }

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                 charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() != 0) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
