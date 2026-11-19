public class Assignment01Q02 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double piApproximation = 0;
        for (int i = 0; i < n; i++) {
            piApproximation += Math.pow(-1, i) / (2 * i + 1);
        }
        piApproximation *= 4;
        System.out.println("Approximation of PI: " + piApproximation);
        System.out.println("Math.PI: " + Math.PI);
    }
}