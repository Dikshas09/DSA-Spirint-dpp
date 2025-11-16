//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0, r;
        int n = sc.nextInt();
        System.out.println(n);
        while (n != 0) {
            r = n % 10;
            s = s + r;
            n = n / 10;
        }
        System.out.println("sum of the digit=" + s);
    }
}