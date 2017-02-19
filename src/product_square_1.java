import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Created by srikanth.s on 2/17/17.
 */
public class product_square_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = i(br.readLine());
//        int [] perfectsquare=new int[25*(int)1e6+1];
//        check(perfectsquare);
        int given[] = new int[n];
        int hash[] = new int[5001];
        int i = 0;
        while (i < n) {
            given[i] = i(br.readLine());
            hash[given[i]]++;
            i++;

        }
        double sum=0;
        for (int j = 1; j <=5000 ; j++) {
            if(hash[j]>1) {
                sum += (hash[j] * (hash[j] - 1)) / 2;

                for (int k = j + 1; k <= 5000; k++) {
//                    System.out.println(check(j * k) + " " + (j * k));
                    if (hash[k]>0 && check(j * k)) {
                        sum++;
                    }
                }
            }
        }
        int tot=(n*(n-1)/2);
        System.out.println(tot);
        System.out.printf("%.6f",sum/tot);
    }

    private static boolean check(int perfectsquare) {
        int a=(int)Math.sqrt(perfectsquare);
        return a*a==perfectsquare;

    }

    public static int i(String ii){
        return Integer.parseInt(ii);
    }
}
