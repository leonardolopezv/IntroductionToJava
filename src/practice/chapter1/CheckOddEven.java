package practice.chapter1;

public class CheckOddEven {
    public static void main(String[] args) {
        int number = -2;
        System.out.println("The number is " + number);
        if (number % 2 == 0){
            System.out.println("Even number");
        } else{
            System.out.println("Odd number");
        }
        System.out.println("End of the execution");
    }

}
