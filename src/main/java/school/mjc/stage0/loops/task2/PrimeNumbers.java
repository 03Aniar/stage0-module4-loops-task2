package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        for(int j=2;j<=printToInclusive;j++){
            int counter=0;
            for(int i=1;i<=j;i++){
                if(j%i==0){
                    counter++;
                }
            }
            if(counter==2)
                System.out.println(j);
        }

    }

}
