import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

    public class WordCounter {

        public int getWordCount(File file) throws FileNotFoundException {
            return getWordCount(new BufferedReader(new FileReader(file)));
        }

        public int getWordCount(BufferedReader reader) {
            int wordCount = 0;
            try {
                String line;
                while ((line = reader.readLine()) != null) {
                    wordCount += line.trim().split(" ").length;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return wordCount;
        }
    }