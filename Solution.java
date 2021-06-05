import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
//This file is modified so be carefull while wiriting

public class Solution {
    static int find_nth_min(int b[],int c)
    {
        Arrays.sort(b);
        return b[c];
    }
    static int find(int a[],int k)
    {
        int b[]=new int[k];
        for(int i=0;i<k;i++)
        {
          b[i]=a[i];  
        }
        int c_val=(int)Math.ceil(k/2);
        return find_nth_min(b,c_val);
    }
    static double[] runningMedian(int[] a) {
        double ar[]= new double[a.length];
        int k=1;
        int m=0;
        for(int i=0;i<a.length;i++)
        {
           ar[m]=find(a,k);
            k++;
        }
        return ar;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(scanner.nextLine().trim());

        int[] a = new int[aCount];

        for (int aItr = 0; aItr < aCount; aItr++) {
            int aItem = Integer.parseInt(scanner.nextLine().trim());
            a[aItr] = aItem;
        }

        double[] result = runningMedian(a);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
