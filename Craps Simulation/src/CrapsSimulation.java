import java.util.Scanner;

public class CrapsSimulation
	{
		static int dice1;
		static int dice2;
		static int diceTotal;
		static int point1;
		public static void main(String[] args)
			{
				boolean playAgain = true;
				boolean point = true;
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello, " + name + "!");
				while (playAgain)
					{
						dice1 = (int)(Math.random() * 6) + 1;
						dice2 = (int)(Math.random() * 6) + 1;
						diceTotal = dice1 + dice2;
						System.out.println("Press enter to roll your dice!");
						Scanner rollDice = new Scanner(System.in);
						if (diceTotal == 7 || diceTotal == 11)
							{
								System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + diceTotal + ". You win " + name + "!");
								point = false;
							}
						else if (diceTotal == 2 || diceTotal == 12)
							{
								System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + diceTotal + ". You lose " + name + "!");
								point = false;
							}
						else 
							{
								System.out.println("You rolled a " + dice1 + " and a " + dice2 + ". Your point is " + diceTotal + ", " + name + ".");
								point1 = diceTotal;
							}
						while (point)
							{
								System.out.println("Press enter to roll again!");
								Scanner newRoll = new Scanner(System.in);
								dice1 = (int)(Math.random() * 6) + 1;
								dice2 = (int)(Math.random() * 6) + 1;
								diceTotal = dice1 + dice2;
								if (diceTotal == point1)
									{
										
									}
							}
					}

			}

	}
