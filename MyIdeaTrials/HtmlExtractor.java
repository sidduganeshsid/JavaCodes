import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HtmlExtractor {
    public static void main(String[] args) {
        String url = "https://github.com/JyothikaHoney"; // Replace with the desired website URL

        try {
            // Create a URL object
            URL website = new URL(url);

            // Open a connection to the URL
            URLConnection connection = website.openConnection();

            // Create a BufferedReader to read the HTML content
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Read and print the HTML content line by line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
