using System;

public class Program
{
	private static int n;

	private static int Mikan(int w)
	{
		return Math.Max((w + n / 2) / n, 1) * n;
	}

	public static void Main()
	{
		int[] nm = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
		n = nm[0];
		int m = nm[1];
		while (m-- > 0) Console.WriteLine(Mikan(int.Parse(Console.ReadLine())));
	}
}
