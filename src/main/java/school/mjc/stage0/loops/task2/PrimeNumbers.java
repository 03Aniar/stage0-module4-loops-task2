package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while ( i != printToInclusive) {
            int j = 2;
            int flag = 1;
            while (j < i / 2) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
                j++;
            }
            if (flag == 1) {
                System.out.println(i);
            }
            i++;

        }

    }

}
