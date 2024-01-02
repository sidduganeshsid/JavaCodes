import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HtmlExtractorAndDownloader {
    public static void main(String[] args) {
        String url = "https://github.com/JyothikaHoney"; // Replace with the desired website URL
        String outputFilePath = "output.html"; // Replace with the desired output file path

        try {
            // Create a URL object
            URL website = new URL(url);

            // Open a connection to the URL
            URLConnection connection = website.openConnection();

            // Create a BufferedReader to read the HTML content
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Create a BufferedWriter to write the HTML content to a file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            // Read the HTML content line by line and write it to the file
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add newline character for each line
            }

            // Close the BufferedReader and BufferedWriter
            reader.close();
            writer.close();

            System.out.println("HTML content has been successfully extracted and saved to " + outputFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
