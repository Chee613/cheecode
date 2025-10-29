import java.util.Scanner;

public class L3Q6{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the radius od a circle: ");
        double radius=input.nextDouble();
        System.out.print("Enter the x-coordinate of a point: ");
        int x=input.nextInt();
        System.out.print("Enter the y-coordinate of a point: ");
        int y=input.nextInt();

        double distance=Math.sqrt(x*x+y*y);

        if(distance>radius)
            System.out.printf("The point (%d,%d) is outside the circle",x,y);
        else if (distance<radius)
            System.out.printf("The point (%d,%d) is inside the circle",x,y);
        else
            System.out.printf("The point (%d,%d) is on the circle",x,y);
    }
}