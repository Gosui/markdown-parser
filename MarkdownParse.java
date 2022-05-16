//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
//test4

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int exclamation = markdown.indexOf("!",currentIndex);
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            int openCarrot = markdown.indexOf("<", currentIndex);
            int closeCarrot = markdown.indexOf(">", openCarrot);
            if (openBracket != -1 && openParen != -1 && exclamation != openBracket -1) {
                toReturn.add(markdown.substring(openParen + 1, closeParen));
                currentIndex = closeParen + 1;
            }
            else if (openCarrot != -1) {
                toReturn.add(markdown.substring(openCarrot+1, closeCarrot));
                currentIndex = closeCarrot + 1;
            }
            else {
                currentIndex  = markdown.length();
            }
        }
        return toReturn;
    }

    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}