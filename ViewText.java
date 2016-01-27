package com.GuessNumber.View;

public class ViewText
{
	public static void explanation()
	{
		System.out.println("Zgadnij liczbę między 0 a 100 [masz na to 7 prób]: ");
	}

	public static void win()
	{
		System.out.println("Wygrana!");
	}

	public static void numberIsLower()
	{
		System.out.println("Liczba jest mniejsza");
	}

	public static void numberIsHigher()
	{
		System.out.println("Liczba jest większa");
	}

	public static void outOfAttempts()
	{
		System.out.println("Wykorzystałeś już wszystkie swoje próby");
	}

}
