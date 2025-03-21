import java.io.*;

public class FileRead{
    public static void main(String[] args) {
        String fileName = "Test.txt"; // File to read

        try {
            // Create FileReader and BufferedReader
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("Reading from file:");
            while ((line = bufferedReader.readLine()) != null) { // Read line by line
                System.out.println(line);
            }

            // Close resources
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error reading the file!");
        }
    }
}
