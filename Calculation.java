package com.GuessNumber.Calculation;

import java.util.Random;
import java.util.Scanner;

import com.GuessNumber.View.ViewText;

public class Calculation
{

	public final int MAX_ATTEMPTS = 101;
	public final int MAX_TURNS_NUMBER = 6;

	public void runProgram()
	{
		Random random = new Random();
		int variate = random.nextInt(MAX_ATTEMPTS);
		ViewText.explanation();
		Scanner scanner = new Scanner(System.in);
		int play = scanner.nextInt();
		testVariantsOfGuessResult(variate, scanner, play);
	}

	public void testVariantsOfGuessResult(int variate, Scanner scanner, int play)
	{
		for (int i = 0; i < MAX_TURNS_NUMBER; i++)
		{
			if (play == variate)
			{
				ViewText.win();
				break;
			} 
			else if (play > variate)
			{
				ViewText.numberIsLower();
			} 
			else if (play < variate)
			{
				ViewText.numberIsHigher();
			}

			play = scanner.nextInt();

			if (i == MAX_TURNS_NUMBER)
			{
				ViewText.outOfAttempts();
			}
		}
		scanner.close();
	}
}
