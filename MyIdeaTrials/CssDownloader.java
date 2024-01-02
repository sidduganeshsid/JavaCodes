import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class CssDownloader {
    public static void main(String[] args) {
        String url = "https://example.com"; // Replace with the desired website URL
        String outputDirectory = "css-files"; // Replace with the desired output directory

        try {
            // Connect to the website and get the HTML document
            Document doc = Jsoup.connect(url).get();

            // Select all CSS links in the HTML document
            Elements cssLinks = doc.select("link[rel=stylesheet]");

            // Create the output directory if it doesn't exist
            File outputDir = new File(outputDirectory);
            if (!outputDir.exists()) {
                outputDir.mkdirs();
            }

            // Download each CSS file
            for (Element link : cssLinks) {
                String cssUrl = link.absUrl("href");
                String fileName = cssUrl.substring(cssUrl.lastIndexOf("/") + 1);

                try (InputStream inputStream = new URL(cssUrl).openStream();
                     OutputStream outputStream = new FileOutputStream(new File(outputDirectory, fileName))) {

                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }
                    System.out.println("Downloaded: " + fileName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("All CSS files downloaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
