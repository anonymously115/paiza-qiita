using System;

public class Program
{
	public static void Main()
	{
		int n = int.Parse(Console.ReadLine());
		int strike = 3;
		int ball = 4;
		while (n-- > 0)
		{
			string s = Console.ReadLine();
			if ("strike".Equals(s)) Console.WriteLine(--strike > 0 ? "strike!" : "out!");
			else if ("ball".Equals(s)) Console.WriteLine(--ball > 0 ? "ball!" : "fourball!");
		}
	}
}
