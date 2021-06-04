package wcapstone;
import java.util.Scanner;

public class Capstone1 {
	

	
	  //class variables
		float currentWeight;
		float lastWeighIn;
		String customerName;

		//class constructor
		Capstone1(String cname) {
			customerName = cname;
		}

		public void Capstone(String cname) {
			// TODO Auto-generated constructor stub
		}

		//function for adding weight gain
		void addWeight (float amount) {
			if (amount != 0) {
				currentWeight = currentWeight + amount;
				lastWeighIn = amount;


			}
		}
	   //function for displaying weight 
		     void subtractWeight (float amount) {
		    	 if (amount != 0) {
		    		 currentWeight = currentWeight + amount; 
		    		 lastWeighIn = -amount;
		    	 }

		     }
		//function showing last weight
			void getLastWeighIn () {
				if (lastWeighIn > 0) {
					System.out.println("You Gained a gym pass: " + lastWeighIn);
				} else if (lastWeighIn < 0) {
					System.out.println("You will get a personal trainer: " + Math.abs(lastWeighIn));
				} else {  
					System.out.println("Free training classes");
				}

		}
			

			//functions to show menu
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
					System.out.println("Enter An Option: ");
					char option1 = scanner.next().charAt(0);
					option = Character.toUpperCase(option1);
					System.out.println();
					
					switch (option ) {
					//case 'A' allow the user to see previous Weight
					case 'A' :
						System.out.println("=====================");
						System.out.println(" currentWeight = " + currentWeight);
						System.out.println("======================");
						System.out.println();
						break;
						//User added Weight
					case 'B':
						System.out.println("Enter a letter from A to D");
						String letter =  scanner.next();
						break;
					case 'C' :
						System.out.println("Enter a another letter from B or D");
						String letter2 = scanner.next();
						System.out.println();
						break;
					case 'D' :
						System.out.println( "======================");
						getLastWeighIn();
						System.out.println("=======================");
						System.out.println();
						break;
						// case E exists the user from their account
					case 'E':
						System.out.println("========================");
						break;
						default:
						System.out.println("Error: invalid option; Please enter A, B, C, D, E");
						break;
					}	
						
					} while (option != 'E');
				       System.out.println("Thank you for participating");
				
			}
					
				}
					
					
					

