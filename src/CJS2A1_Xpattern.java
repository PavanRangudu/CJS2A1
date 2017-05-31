
import java.util.Scanner;

public class CJS2A1_Xpattern {
	private static Scanner input;

	public static void main(String[] args) {
		int i, j, size;
		System.out.println("Enter X pattern size you want to print");
		input = new Scanner(System.in);
		size = input.nextInt();
		for (j = 1; j <= size; j++) {
			for (i = 1; i <= size; i++) {
				if (i == j || i == (size + 1) - j)
					System.out.print('*');
				else
					System.out.print("_");
			}
			System.out.println();
		}

	}
}
