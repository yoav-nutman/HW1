public class Assignment01Q03 {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int current = 1;
        int previous = 0;
        int next;

        for (int i = 0; i < x; i++) {
            next = current + previous;
            previous = current;
            current = next;
            System.out.print(current + " ");
        }

        int oddCount = 0;
        oddCount = x - x/3;
        System.out.println("\nNumber of odd Fibonacci numbers: " + oddCount);
    }
}