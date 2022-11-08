package ie.atu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {

        try{
            System.out.println("Please enter a number between 0-9 : ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            System.out.println("You entered: " + number);

        }
        catch (InputMismatchException e){
            System.out.printf("Not a valid number");
        }

    }
}
