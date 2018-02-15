public class Hailstone {
    public static void Calc(int num, int counter) {
        if(num % 2 == 0) {
            num /= 2;
            System.out.print(num + ", ");
        } else {
                num *= 3;
                num += 1;
                System.out.print(num + ", ");
        }
        if(num == 1) {
            System.out.println("\nProgram done!");
            System.out.println(counter + " iterations to solution.");
		    System.exit(0);
        }
        counter++;
        Calc(num, counter);
    }
}
