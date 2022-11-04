public class PrefixAverages2 {
    /*
       * Algorithm 4.2. PrefixAverages2(X)
Input: X, a 1-D numerical array of size n
1) Let A = an empty 1-D numerical array of size n
2) Let s = 0
3) For i = 0 to n-1
4) Let s = s + X[i]
5) Let A[i] = s / (i+1)
6) End For
Output: An n-element array A of numbers such that A[i]
is the average of elements X[0],X[1], … ,X[i]
       */

    public static double[] PrefixAverages2(double X[]) {
        int n = X.length;
        double[] A = new double[n];

        double S = 0;

        for(int i = 0; i < n; i++) {

            S = S + X[i];
            A[i] = S / (i+1);

        }
        return A;

    }

}
