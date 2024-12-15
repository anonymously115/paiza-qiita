using System;

class Concentration
{
    int N;
    string[][] T;
    int[] acquiredCards;
    int P;

    public int getAcquiredCard(int i)
    {
        return acquiredCards[i];
    }

    public Concentration(int n, string[][] t)
    {
        N = n;
        T = t;
        acquiredCards = new int[n];
        P = 0;
    }

    public void concentration(int a, int b, int c, int d)
    {
        if (T[a][b] == T[c][d]) acquiredCards[P] += 2;
        else P = -~P % N;
    }
};

public class Program
{
    public static void Main()
    {
        int[] HWN = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
        int H = HWN[0];
        int W = HWN[1];
        int N = HWN[2];
        string[][] T = new string[H][];
        for (int i = 0; i < H; i++) T[i] = Console.ReadLine().Split();
        Concentration concentration = new Concentration(N, T);
        int L = int.Parse(Console.ReadLine());
        while (L-- > 0)
        {
            int[] abAB = Array.ConvertAll(Console.ReadLine().Split(), _ => ~-int.Parse(_));
            concentration.concentration(abAB[0], abAB[1], abAB[2], abAB[3]);
        }
        for (int i = 0; i < N; i++) Console.WriteLine(concentration.getAcquiredCard(i));
    }
}
