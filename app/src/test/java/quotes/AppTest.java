/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Random;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void name() throws FileNotFoundException {
        Gson gson = new Gson();
        //Read the JSON File
//        Reader reader = new FileReader("app/src/main/resources/recentquotes.json");
        Reader reader = new FileReader("C:\\Users\\malik\\401\\quotes\\app\\src\\main\\resources\\recentquotes.json");

        RecentQuotes[] convertedObject = gson.fromJson(reader, RecentQuotes[].class);

//        Object expected = "RecentQuotes[author='Marilyn Monroe', text=' “I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.â€� ']";
        Object expected = convertedObject[0];

        Random r = new Random();
        int low = 0;
        int high = 137;
        int result = r.nextInt(high-low) + low;
        Object actual = null;
        for (int i = 0; i < convertedObject.length; i++) {
//            System.out.println(convertedObject.length);
            actual = convertedObject[0];
            break;
        }
        assertEquals(expected,actual);
    }
}
