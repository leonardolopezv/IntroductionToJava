package theory.breachingStatements;

/*
Continue statement works same as break but the difference is it only comes out of loop for that iteration and continue to execute the code for next iterations. So it only bypasses the current iteration.
 */

public class ContinueTest {
    public static void main(String args[])
    {
        for (int j = 0; j < 10; j++)
        {
            // If the number is odd then bypass and continue with next value
            if (j%2 != 0)
                continue;
            // only even numbers will be printed
            System.out.print(j + " ");
        }
    }
}
