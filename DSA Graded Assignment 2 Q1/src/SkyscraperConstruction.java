
import java.util.Scanner;

import com.greatlearning.service.AssembleFloors;

public class SkyscraperConstruction {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building: ");
		int N = scan.nextInt();

		int[] floorSizes = new int[N];

		for (int i = 1; i <= floorSizes.length; i++) {
			System.out.println("Enter the floor size given on day " + i + ": ");
			floorSizes[i-1] = scan.nextInt();

		}

		AssembleFloors floors = new AssembleFloors();

		floors.assembleFloors(floorSizes);

		scan.close();
	}

}
