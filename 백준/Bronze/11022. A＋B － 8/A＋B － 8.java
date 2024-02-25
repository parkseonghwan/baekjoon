import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 1; i <= a; i++) {
            int n = 0;
            int j = 0;
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ").append(n).append(" "+"+"+" ").append(j).append(" "+"="+" ").append(n+j).append('\n');
        }
        br.close();
        System.out.println(sb);

    }
}
