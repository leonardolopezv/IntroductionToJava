package practice.chapter4;

public class HarmonicSum {
    public static void main(String[] args) {

        final int MAX_DENOMINATOR = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++){
            sumL2R += ((double) 1 /denominator);
        }
        System.out.println("The sum from left to right is: " + sumL2R);

        for (int denominator = MAX_DENOMINATOR; denominator > 0; denominator--){
            sumR2L += ((double) 1 /denominator);
        }
        System.out.println("The sum from right to left is: " + sumR2L);

        absDiff = Math.abs(sumL2R - sumR2L);
        System.out.println("The difference is: " + absDiff);
    }
}
