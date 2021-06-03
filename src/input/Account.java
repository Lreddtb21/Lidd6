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
			System.out.println();
			System.out.println("A. Your Previous Weight");
			System.out.println("B. Add Weight");
			System.out.println("C. Subtract Weight");
			System.out.println("D. Show Previous Weigh In");
			System.out.println("E. Finished");
			
			do  { 
				System.out.println();
				System.out.println("Enter An Option");
			}
		
			
		}
	
   
	}


