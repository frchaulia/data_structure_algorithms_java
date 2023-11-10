package week5;
import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args){

		Scanner sc08 = new Scanner(System.in);

		String[] name = new String[50];
		int[] count = new int[50];
		int total,constituency,choice;

		System.out.print("Enter total Candidates: ");
        total=sc08.nextInt();
		System.out.print("Enter the total of the Voters: ");
        constituency=sc08.nextInt();
		System.out.println("======================");
		sc08.nextLine();

		for(int i=0;i<total;i++) {
			System.out.print("Candidate num-"+(i+1)+" :");
            name[i]=sc08.nextLine();
		}

		System.out.println("Welcome Voters!\nUse your right to vote!");
		System.out.println("======================");
		System.out.print("The following is a list of candidates that can be selected: ");

		for(int j=0;j<total;j++) {
			System.out.print("\n"+(j+1)+". "+name[j]);
		}
		System.out.print("\nNote: Enter number!\n");
		System.out.println("======================");
		for(int j=0;j<constituency;j++) {
			System.out.print("Voter num-"+(j+1)+", Choose : ");
            choice=sc08.nextInt();
			do {
					count[choice] = count[choice] + 1;
			}while(choice>total);
		}
		System.out.println("======================");
		System.out.println("Elected Chair");
		for(int k=1;k<=total;k++) {
			if(count[k]>=((constituency/2)+1)) {
				System.out.println("Mayority = "+name[k-1]+", With total votes = "+count[k]);
			}
		}
		System.out.print("Minimum Majority Score = "+((constituency/2)+1));
	}
}
