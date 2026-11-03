// https://www.eg.bucknell.edu/~xmeng/Course/CS6337/Note/master/node50.html
import java.util.Random;
import eduni.distributions.*;

public class ExponentialRandomNumbers {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random(123);

        // Specify the rate parameter (λ) for the exponential distribution
        double lambda = 0.5; // You can adjust this value as needed

        ContinuousGenerator distrib = new Negexp(0.5, 123);

        // Generate random exponential numbers
        for (int i = 0; i < 5; i++) {
            double randomExponential = -Math.log(1 - random.nextDouble()) / lambda;
            System.out.println("Random Exponential Number: " + randomExponential);

            double anotherRandom = distrib.sample();
            System.out.println("2. Random Exponential Number: " + anotherRandom);
        }
    }
}