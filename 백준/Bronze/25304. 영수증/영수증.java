import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st;

        int total = Integer.parseInt(bufferedReader.readLine());
        int tcount = Integer.parseInt(bufferedReader.readLine());
        int tprice = 0;

        for (int i = 0; i < tcount; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            tprice += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }


        System.out.println(total - tprice == 0 ? "Yes" : "No");
    }
}
