package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int i = 0;
            int two = 2;
            int temp = 1;
            while ( i != power + 1) {
                System.out.println(temp);
                temp = temp * 2;
                i++;
            }
        }


    }
}
