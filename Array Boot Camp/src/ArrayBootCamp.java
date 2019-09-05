import java.util.Scanner;

public class ArrayBootCamp
	{
		static String userInput;

		public static void main(String[] args)
			{
				printSweets();
				insertEightNumbers();
				generateRandomNumber();
			}

		private static void printSweets()
			{
				String[] favoriteSweets = new String[5];

				favoriteSweets[0] = userInput;
				favoriteSweets[1] = userInput;
				favoriteSweets[2] = userInput;
				favoriteSweets[3] = userInput;
				favoriteSweets[4] = userInput;

				System.out.println("Tell me your five favorite sweets!");

				Scanner userInput = new Scanner(System.in);

				String sweets = userInput.nextLine();
				
				

			}

		private static void insertEightNumbers()
			{

			}

		private static void generateRandomNumber()
			{

			}

	}
