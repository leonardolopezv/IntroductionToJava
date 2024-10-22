package practice.chapter1;

public class PrintNumberInWord {
    public static void main(String[] args) {

        int number = 7;

        if (number == 1){
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else {
            System.out.println("OTHER VALUE");
        }

        switch (number){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("other value");
        }
    }
}
