public class Hailstone {
    public static void Calc(int num) {
    	int counter = 0;
        try {
            if(num % 2 == 0) {
                num /= 2;
                System.out.print(num + ", ");
            } else {
                num *= 3;
                num += 1;
                System.out.print(num + ", ");
            }
            if(num == 1) {
            	counter++;
            	if(counter == 2) {
            		System.out.println("\nProgram done!");
            		System.exit(0);
            	}
            }
            Calc(num);
        } catch (StackOverflowError e) {
            System.out.println("\nProgram done!");
        }
    }
}
