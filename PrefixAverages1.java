public class PrefixAverages1 {

    /*Algorithm 4.1. PrefixAverages1(X)
       Input: X, a 1-D numerical array of size n
       1) Let A = an empty 1-D numerical array of size n
       2) For i = 0 to n-1
       3) Let s = X[0]
       4) For j = 1 to n-1
       5) If j ≤ i Then
       6) Let s = s + X[j]
       7) End If
       8) End For
       9) Let A[i] = s /(i+1)
       10) End For
       Output: An n-element array A of numbers such that A[i]
       is the average of elements X[0],X[1], … ,X[i]
       */

    public static double[] PrefixAverages1(double X[]) {
        int n = X.length;
        double[] A = new double[n];

        for(int i = 0; i < n; i++) {

            double S = X[0];

            for(int j = 1; j < n;j++) {

                if(j<=i) {
                    S = S + X[j];
                }
            }
            A[i] = (S / (i +1 ));
        }
        return A;

    }

}
