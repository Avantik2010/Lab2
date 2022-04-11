import java.util.Scanner;
public class Main {
	
	public static void main (String[]args) {
		
		BubbleSortImplementation bubbleSort =new BubbleSortImplementation();
				notesCount notesCount = new notesCount();
				
				System.out.println("enter the size of currency denominations");
				
				Scanner sc = new Scanner(System.in);
				
				int size = sc. nextInt();
				int[] notes = new int[size];
				System.out.println("enter the currency denominations value");
				for (int i=0; i<size; i++) {
					notes[i] = sc. nextInt();
				}
				System.out.println("enter the amount you want to pay");
				int amount =sc. nextInt();
				bubbleSort.bubbleSort (notes);
				notesCount.notesCountImplementation(notes, amount);
	}

}
