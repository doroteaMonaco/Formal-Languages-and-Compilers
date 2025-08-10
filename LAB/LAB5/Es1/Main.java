package Es1;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a FileReader for the input file
            Yylex lexer = new Yylex(new FileReader(args[0]));
            // Create a parser instance
            parser parser = new parser(lexer);
            // Start parsing
            Object result = parser.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}