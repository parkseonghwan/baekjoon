
import java.io.BufferedReader;
import java.io.InputStreamReader;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if (((a % 4 == 0) && (a % 100 != 0)) || a % 400 == 0) {
            System.out.println(1);
        } else System.out.println(0);

    }

}
