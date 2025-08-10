import java.io.*;

public class Main {
    static public void main(String argv[]){
        try{
            scanner s = new scanner(new FileReader(argv[0]));
            parser p = new parser(s);
            Object result = p.parse().value;
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

