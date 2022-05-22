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
        assertEquals(2, 2);
        assertEquals(1.5, 3/2.0, 0);
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

    @Test
    public void myTest1() throws IOException{
        Path fileName = Path.of("report4-1.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("`google.com");
        expectedLinks.add("google.com");
        expectedLinks.add("ucsd.edu");
        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void myTest2() throws IOException{
        Path fileName = Path.of("report4-2.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("a.com");
        expectedLinks.add("a.com(())");
        expectedLinks.add("example.com");
        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void myTest3() throws IOException{
        Path fileName = Path.of("report4-3.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParse.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("https://www.twitter.com");
        expectedLinks.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        expectedLinks.add("https://cse.ucsd.edu/");
        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void otherTest1() throws IOException{
        Path fileName = Path.of("report4-1.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParseReport.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("`google.com");
        expectedLinks.add("google.com");
        expectedLinks.add("ucsd.edu");
        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void otherTest2() throws IOException{
        Path fileName = Path.of("report4-2.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParseReport.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("a.com");
        expectedLinks.add("a.com(())");
        expectedLinks.add("example.com");
        assertEquals(expectedLinks, actualLinks);
    }

    @Test
    public void otherTest3() throws IOException{
        Path fileName = Path.of("report4-3.md");
        String markdown = Files.readString(fileName);
        ArrayList<String> actualLinks = MarkdownParseReport.getLinks(markdown);
        ArrayList<String> expectedLinks = new ArrayList<>();
        expectedLinks.add("https://www.twitter.com");
        expectedLinks.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        expectedLinks.add("https://cse.ucsd.edu/");
        assertEquals(expectedLinks, actualLinks);
    }
}