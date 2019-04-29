package ktoo2;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.lang.*;


/**
 * Hello world!
 */
public class Program {

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        TextAnalytics text = new TextAnalytics("C:\\Users\\Student Admin\\Desktop\\prog.pohikursus\\kt2.txt");
        String array_string = Arrays.toString(text.array_of_words);
        System.out.println(array_string);

    }
}