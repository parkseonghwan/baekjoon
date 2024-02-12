import java.io.BufferedReader;
import java.io.InputStreamReader;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        System.out.print((A >= 90) ? "A" : (A >= 80) ? "B" : (A >= 70) ? "C" : (A >= 60) ? "D" : "F");

    }

}
