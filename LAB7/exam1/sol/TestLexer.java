import java_cup.runtime.Symbol;
import java.io.*;

public class TestLexer {
    public static void main(String[] args) {
        try {
            scanner s = new scanner(new FileReader("input.txt"));
            Symbol token;
            while ((token = s.next_token()).sym != sym.EOF) {
                System.out.println("Token: " + sym.terminalNames[token.sym] + 
                                  " Value: " + token.value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
