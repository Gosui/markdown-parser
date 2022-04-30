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
        assertEquals(3, 2 + 1);
    }

    @Test
    public void getLink() throws IOException{
        Path fileName = Path.of("test-file.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("https://something.com");
        expectedLinks.add("some-thing.html");
        assertEquals(expectedLinks, actualLinks);

        fileName = Path.of("test-file2.md");
        markdown = Files.readString(fileName);
        actualLinks = MarkdownParse.getLinks(markdown);
        expectedLinks = new ArrayList<>();
        expectedLinks.add("https://something.com");
        expectedLinks.add("some-page.html");
        assertEquals(expectedLinks, actualLinks);

        fileName = Path.of("test-file3.md");
        markdown = Files.readString(fileName);
        actualLinks = MarkdownParse.getLinks(markdown);
        expectedLinks = new ArrayList<>();
        assertEquals(expectedLinks, actualLinks);

        fileName = Path.of("test-file4.md");
        markdown = Files.readString(fileName);
        actualLinks = MarkdownParse.getLinks(markdown);
        expectedLinks = new ArrayList<>();
        assertEquals(expectedLinks, actualLinks);

        fileName = Path.of("test-file5.md");
        markdown = Files.readString(fileName);
        actualLinks = MarkdownParse.getLinks(markdown);
        expectedLinks = new ArrayList<>();
        expectedLinks.add("page.com");
        assertEquals(expectedLinks, actualLinks);

        fileName = Path.of("test-file6.md");
        markdown = Files.readString(fileName);
        actualLinks = MarkdownParse.getLinks(markdown);
        expectedLinks = new ArrayList<>();
        assertEquals(expectedLinks, actualLinks);


        fileName = Path.of("test-file7.md");
        markdown = Files.readString(fileName);
        actualLinks = MarkdownParse.getLinks(markdown);
        expectedLinks = new ArrayList<>();
        assertEquals(expectedLinks, actualLinks);

        fileName = Path.of("test-file8.md");
        markdown = Files.readString(fileName);
        actualLinks = MarkdownParse.getLinks(markdown);
        expectedLinks = new ArrayList<>();
        assertEquals(expectedLinks, actualLinks);
    }
}