import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int count = n / 4;
        
        String s = ("long" + " ").repeat(Math.max(0, count)) + "int";
        System.out.println(s);


    }
}
