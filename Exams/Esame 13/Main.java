
import java.io.*;
import java_cup.runtime.*;


public class Main {
    static public void main(String argv[]) {    
        try {
            /* Scanner instantiation */
            Scanner l = new Scanner(new FileReader(argv[0]));
            /* Parser instantiation */
            parser p = new parser(l);
            /* Run the parser */
            Object result = p.parse();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


