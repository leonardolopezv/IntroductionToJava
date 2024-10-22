package practice.chapter4;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int i = LOWERBOUND; i <= UPPERBOUND; i++){
            sum += i;
        }
        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);

        average = (double) sum / UPPERBOUND;
        System.out.println("Average: " + average);
    }
}