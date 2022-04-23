import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLink() throws IOException{
        Path fileName = Path.of("/Users/tony/Documents/GitHub/markdown-parser/test-file.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("https://something.com");
        expectedLinks.add("some-thing.html");
        assertEquals(expectedLinks, actualLinks);
    }
}