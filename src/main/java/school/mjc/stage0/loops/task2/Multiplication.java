package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive > 0) {
            int i = 0;
            while (i != multiplyByAndToInclusive + 1) {
                System.out.println(i++ * multiplyByAndToInclusive);
            }
        } else if (multiplyByAndToInclusive < 0) {
            int i = 0;
            while (i != -multiplyByAndToInclusive + 1) {
                System.out.println(i++ * multiplyByAndToInclusive);
            }
        } else {
            System.out.println("");
        }

    }
}
