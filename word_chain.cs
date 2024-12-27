using System;
using System.Linq;
using System.Collections.Generic;

class WordChain
{
    int n;
    HashSet<string> d;
    bool[] alive;
    string bef;
    int p;

    public WordChain(int n, HashSet<string> d)
    {
        this.n = n;
        this.d = d;
        alive = new bool[n];
        for (int i = 0; i < n; i++) alive[i] = true;
        bef = string.Empty;
        p = 0;
    }

    public void Chain(string s)
    {
        if (d.Contains(s) && ("".Equals(bef) || s.First() == bef.Last()) && s.Last() != 'z')
        {
            d.Remove(s);
            bef = s;
        }
        else
        {
            alive[p] = false;
            bef = string.Empty;
        }
        do
        {
            p = -~p % n;
        } while (!alive[p]);
    }

    public int AliveCount()
    {
        return alive.Sum(b => b ? 1 : 0);
    }

    public bool IsAlive(int i)
    {
        return alive[i];
    }
}

public class Program
{
    public static void Main()
    {
        int[] nkm = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
        int n = nkm[0];
        int k = nkm[1];
        int m = nkm[2];
        HashSet<string> d = new HashSet<string>();
        while (k-- > 0) d.Add(Console.ReadLine());
        WordChain wordChain = new WordChain(n, d);
        while (m-- > 0) wordChain.Chain(Console.ReadLine());
        Console.WriteLine(wordChain.AliveCount());
        for (int i = 0; i < n; i++) if (wordChain.IsAlive(i)) Console.WriteLine(-~i);
    }
}
