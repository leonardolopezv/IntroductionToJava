package theory.breachingStatements;

/*
Break statement is used to terminate the execution and bypass the remaining code in loop. It is mostly used in loop to stop the execution and comes out of loop. When there are nested loops then break will terminate the innermost loop.
 */
public class BreakTest {
    public static void main(String args[])
    {
        for (int j = 0; j < 5; j++)
        {
            // come out of loop when i is 4.
            if (j == 4)
                break;
            System.out.println(j);
        }
        System.out.println("After loop");
    }
}

