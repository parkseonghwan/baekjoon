import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str;
        StringBuilder sb = new StringBuilder();

        while(true){
            str = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            if (a == 0 && b == 0){
                break;
            }
            sb.append(a+b).append('\n');
        }
        System.out.println(sb);
    }

}
