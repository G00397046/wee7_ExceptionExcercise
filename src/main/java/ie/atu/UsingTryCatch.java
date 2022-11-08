package ie.atu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        try{
            System.out.println("\nPlease enter a number between 0-9 : ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if(number <=9 && number > 0){
                System.out.println("You entered " + number);
            }
            else{
                System.out.println("Number out of range");
            }

        }
        catch (InputMismatchException e){
            System.out.printf("Not a valid number\n");

        }
    }
}
