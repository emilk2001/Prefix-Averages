import java.util.Arrays;

public class main {


/*
* 4.4 Exercise 1: Computational Complexity
1) What is the difference between the two algorithms? Read these
       two algorithms carefully. If necessary, it might be helpful
       to set up an array yourself and apply these two algorithms on
       it by running through them by hand for small size values of n.
2) Analyse both algorithms by counting primitive operations
       and derive T(n) for both algorithms. What is the time complexity (Big-Oh, O(n))
      of each algorithm? Which one is the most efficient?

*/






        public static void main(String[] args) {

            double[] X = {2, 3, 4, 5};

            double array1[] = PrefixAverages1.PrefixAverages1(X);
            System.out.println(Arrays.toString(array1));

            double array2[] = PrefixAverages2.PrefixAverages2(X);
            System.out.println(Arrays.toString(array2));
        }


}
