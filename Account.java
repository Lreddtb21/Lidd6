package input;

import java.util.Scanner;

public class Account {
	 //class variables

    float currentWeight;

    float lastWeighIn;

    String customerName;

   
    //class constructor

    Account(String cname) {

                    customerName = cname;

    }

   

    //public Account(String cname) {

                    // TODO Auto-generated constructor stub

   



    //function for adding weight gain

    public void Account1(String cname) {
		// TODO Auto-generated constructor stub
	}



	void addWeight (float amount) {

                    if (amount != 0) {

                                    currentWeight = currentWeight + amount;

                                    lastWeighIn = amount;

                                   

                                   

                    }

    }

//function for removing weight

         void subtractWeight (float amount) {

                     if (amount != 0) {

                                     currentWeight = currentWeight + amount;

                                     lastWeighIn = -amount;

                     }

                                         

         }

    //function showing last weight

                    void getLastWeighIn () {

                                    if (lastWeighIn > 0) {

                                                    System.out.println("You Gained: " + lastWeighIn);

                                    } else if (lastWeighIn < 0) {

                                                    System.out.println("You Lost: " + Math.abs(lastWeighIn));

                                    } else { 

                                                    System.out.println("No Weight Change");

                                    }

                   

    }



                    //function to show menu

                    void showmenu() {

                                    char option = '\0';

                                    Scanner scanner = new Scanner(System.in);

                                    System.out.println("Welcome, " + customerName + "!");

                                    System.out.println("Let's start your weight tracking journey!");

                                    System.out.println("******************************************");



                                    System.out.println();

                                    System.out.println("A. Enter your starting weight");

                                    //System.out.println("B. Add Weight");

                                    System.out.println("B. Enter today's weight");

                                    System.out.println("C. Finished");

                                    //System.out.println("E. Finished");

                                   

                                    do  {

                                                    System.out.println();

                                                    System.out.println("Enter An Option");

                                                    char option1 = scanner.next().charAt(0);

                                                    option = Character.toUpperCase(option1);

                                                    System.out.println();

                                                   

                                    switch(option) {

                                    //case A to check current weight

                                    case 'A':

                                                    System.out.println("********************");

                                                    System.out.println("currentWeight = lbs " + currentWeight);

                                                    System.out.println("********************");

                                                    break;

                                                    //case B to add weight

                                                    //System.out.println("Enter New Weight Added: ");

                                                    //float amount = scanner.nextFloat();

                                                    //addWeight (amount);

                                                    //System.out.println();

                                                    //break;

                                                    //case C subtract weight

                                    case 'B':

                                                    System.out.println("Enter New Weight Subtracted: ");

                                                    float amount2 = scanner.nextFloat();

                                                    subtractWeight(amount2);

                                                    System.out.println();

                                                    break;

                                                    //case D view last weigh in

                                    case 'C':

                                                    System.out.println("********************");

                                                    getLastWeighIn();

                                                    System.out.println("********************");

                                                    System.out.println();

                                                    break;

                                                    //case E exits program

                                    //case 'E':

                                                    //System.out.println("********************");

                                                    //break;

                                                    //invalid input

                                                    default:

                                                                    System.out.println("Invalid. Please Enter Either A, B, C");

                                                                    break;

                                                                   

                                    }

                                    } while(option != 'E');

                                    System.out.println("Keep It Up, You Are Great!");

                                    }

                   

                                   
}
