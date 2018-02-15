import java.util.*;
public class Aaaaaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int counter = 1;
        System.out.print("Enter an integer: ");
        num = input.nextInt();
        System.out.print(num + ", ");
        Hailstone.Calc(num, counter);
    }
}
