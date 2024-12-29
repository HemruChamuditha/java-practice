import java.util.Scanner;
class Example{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number One : ");
        int numberOne = input.nextInt();

        System.out.println("Enter Number two : ");
        int numberTwo = input.nextInt();

        System.out.println("A. Addition");
        System.out.println("B. Subtraction");
        System.out.println("C. Multiplication");
        System.out.println("D. Division");

        System.out.print("--->");
        String option = input.next();

        switch (option){
            case "A":
                add(numberOne, numberTwo);
                break;
            case "B":
                sub(numberOne, numberTwo);
                break;
            case "C":
            case "D":
            default:
                System.out.println("Ended");
                break;
        }
    }
    //Add method
    public static void add(int numberOne, int numberTwo){
        System.out.println("Sum is : " + (numberOne + numberTwo));

    }
    public static void sub(int numberOne, int numberTwo){


        if (numberOne > numberTwo){
            System.out.println("Subtraction is : " + numberOne + " - " + numberTwo + " = " + (numberOne-numberTwo) );
        }else{
            System.out.println("Subtraction is : " + numberTwo + " - " + numberOne + " = " + (numberTwo-numberOne) );
        }
    }
    public static void multi(){

    }
    public static void div(){

    }
}