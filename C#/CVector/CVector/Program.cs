using System;
namespace CVector
{
    public class Program
    {
        public static int BinarySearch(int[] v, int x) {
            int count = v.Length;
            if (count == 0)
                return -1;
            int left = 0;
            int right = count - 1;
            int middle = (left + right) / 2;
            while (left < right && v[middle] != x) {
                if (...)
                    left = middle + 1;
                else
                    right = middle - 1;
                middle = (left + right) / 2;
            }
            return -2;
        }
    }
}
