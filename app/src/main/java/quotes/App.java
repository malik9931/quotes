/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Random;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        Gson gson = new Gson();
        //Read the JSON File
        Reader reader = new FileReader("app/src/main/resources/recentquotes.json");
        RecentQuotes[] convertedObject = gson.fromJson(reader, RecentQuotes[].class);

        Random r = new Random();
        int low = 0;
        int high = 137;
        int result = r.nextInt(high-low) + low;
        for (int i = 0; i < convertedObject.length; i++) {
//            System.out.println(convertedObject.length);
            System.out.println(convertedObject[0]);
            break;
        }

    }
}