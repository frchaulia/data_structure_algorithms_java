import java.util.Scanner;
	public class JS1ASD{
		public static void main(String []args){
			//Task 2.2.1 Lab Unit 1 - Selection
			System.out.println ("\t");
			System.out.println ("*********************************");
			System.out.println ("Task 2.2.1 Lab Unit 1 - Selection");
			System.out.println ("*********************************");
			System.out.println ("\t");
			System.out.println("CALCULATE FINAL GRADE");
			System.out.println("============================");
			System.out.println("============================");
			//Declaration Variable
			int as, mes, fes;
			double total;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter assignment score  = ");
			as = input.nextInt();
			System.out.print("Enter middle exam score = ");
			mes = input.nextInt();
			System.out.print("Enter final exam score  = ");
			fes= input.nextInt();
			System.out.println("============================");
			total = (as*0.2)+(mes*0.35)+(fes*0.45);
			System.out.println("Final Score = "+total);
			if ((total<=100)&&(total>80)){
			System.out.println("Final Grade = A");
			}
			else if((total<=80)&&(total>73)){
			System.out.println("Final Grade = B+");
			}
			else if((total<=73)&&(total>65)){
			System.out.println("Final Grade = B");
			}
			else if((total<=65)&&(total>60)){
			System.out.println("Final Grade = C+");
			}
			else if((total<=60)&&(total>50)){
			System.out.println("Final Grade = C");
			}
			else if((total<=50)&&(total>39)){
			System.out.println("Final Grade = D");
			}
			else if((total<=39)){
			System.out.println("Final Grade = E");
			}
			else{ System.out.println("Error");
			}
			System.out.println("============================");
			System.out.println("============================");
			if(total<=50){
			System.out.println("Sorry, you failed :( Keep spirit and don't give up");
			}
			else{ System.out.println("Congratulations!! You pass");
			}
			System.out.println ("\t");
		}
	}