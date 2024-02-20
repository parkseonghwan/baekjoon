
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int c = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(bufferedReader.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');


        }

        System.out.println(sb);


    }
}
