import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine();


        StringTokenizer stt = new StringTokenizer(str, " ");

        int a = Integer.parseInt(stt.nextToken());
        int b = Integer.parseInt(stt.nextToken());

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


    }
}
