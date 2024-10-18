using System;

public class Program
{
	private static double Leftover(double m, double p, double q)
	{
		return m * (100 - p) * (100 - q) / 10000;
	}
	
	public static void Main()
	{
		double[] mpq = Array.ConvertAll(Console.ReadLine().Split(), double.Parse);
		Console.WriteLine(Leftover(mpq[0], mpq[1], mpq[2]));
	}
}
