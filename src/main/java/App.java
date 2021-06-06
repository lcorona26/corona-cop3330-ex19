/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        String weight = app.readWeight();
        String height = app.readHeight();
        float bmiIndex = app.calcBMI(weight,height);
        app.printOutput(bmiIndex);
    }

    private void printOutput(float bmiIndex) {
       if(bmiIndex > 18.5 && bmiIndex <25)
           System.out.print("Your BMI is " + bmiIndex + " .\n" +
                   "You are within the ideal weight range.");
       if(bmiIndex < 18.5)
           System.out.print("Your BMI is " + bmiIndex + " .\n" +
                   "You are underweight. You should see your doctor.");
       if(bmiIndex > 25)
           System.out.print("Your BMI is " + bmiIndex + " .\n" +
                   "You are overweight. You should see your doctor.");

    }

    private float calcBMI(String weight, String height) {
        float weightInt = Integer.parseInt(weight);
        float heightInt = Integer.parseInt(height);

        float BMI = ( (weightInt) / (heightInt * heightInt) ) * 703;
        return BMI;
    }


    private String readWeight() {
        System.out.print("What is your weight? ");
        String weight = in.nextLine();
        try{
            int intWeight = Integer.parseInt(weight);
        }catch (NumberFormatException e){
            System.out.print("Input must be a numeric value\n");
            System.exit(0);
        }
        return weight;
    }


    private String readHeight() {
        System.out.print("What is your height? ");
        String height = in.nextLine();
        return height;
    }
}
