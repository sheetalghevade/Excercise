package advjavaday1;

import java.util.Scanner;
public class CmnString {

	static int LCSubStr(char X[], char Y[], int m, int n)
    {
        int LCStuff[][] = new int[m + 1][n + 1];
 
        
        int result = 0;
 
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    LCStuff[i][j] = 0;
                else if (X[i - 1] == Y[j - 1]) {
                    LCStuff[i][j]
                    		 = LCStuff[i - 1][j - 1] + 1;
                    result = Integer.max(result,
                                         LCStuff[i][j]);
                }
                else
                    LCStuff[i][j] = 0;
            }
        }
        return result;
    }
 
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String X = input.nextLine();
		
		System.out.println("Enter 2nd String: ");
		String Y = input.nextLine();
		
		input.close();
    	
        int m = X.length();
        int n = Y.length();
 
        System.out.println(
            "Length of Longest Common Substring is "
            + LCSubStr(X.toCharArray(), Y.toCharArray(), m,
                       n));
    }
}		

