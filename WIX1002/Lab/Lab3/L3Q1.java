import java.util.Scanner;

public class L3Q1{
    public static void main(String[]args){
        
        Scanner input= new Scanner(System.in);

        System.out.print("Enter two integer number: ");
        int num1= input.nextInt();
        int num2= input.nextInt();

        System.out.print("Enter the operand: ");
        char operand=input.next().charAt(0);

        switch(operand){
            case '+' -> System.out.println(num1+""+operand+""+num2+"="+(num1+num2));
            case '-' -> System.out.println(num1+""+operand+""+num2+"="+(num1-num2));
            case '*' -> System.out.println(num1+""+operand+""+num2+"="+(num1*num2));
            case '/' -> System.out.println(num1+""+operand+""+num2+"="+(num1/num2));
            default -> System.out.println("Invalid operand");
        }
        
    }
}