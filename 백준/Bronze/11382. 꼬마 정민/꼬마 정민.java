


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");

        long a  = Long.parseLong(stringTokenizer.nextToken());
        long b = Long.parseLong(stringTokenizer.nextToken());
        long c = Long.parseLong(stringTokenizer.nextToken());

        System.out.println(a + b + c);


    }
}
