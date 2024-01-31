import java.io.IOException;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        double i = scan.nextDouble();
        double j = scan.nextDouble();
        System.out.println(i / j);
    }
}