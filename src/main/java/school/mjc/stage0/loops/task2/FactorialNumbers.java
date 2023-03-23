package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int temp = 1;
        while (i != printToInclusive + 1) {
            if (i == 0) {
                System.out.println(1);
                i++;
            } else {
                temp *= i;
                System.out.println(temp);
                i++;
            }

        }

    }
}
