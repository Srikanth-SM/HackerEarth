package code_monk_heaps_and_priority_queues_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by srikanth.s on 2/8/17.
 */
public class little_monk_and_abd {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        PriorityQueue<Integer> min_pq=new PriorityQueue<>();
//        PriorityQueue<Integer> max_pq=new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i <N ; i++) {
                int temp=ii(str[i]);
//                max_pq.add(temp);
                    min_pq.add(temp);
        }
        int arr[]=new int[(int)(1e6)];
        int q=ii(br.readLine());
        int i=0;
//        arr[0]=(int)(1e6+2);
        while(i<N){
            arr[i]=min_pq.poll();
            i++;
        }
        while(q-->0){
            str=br.readLine().split(" ");
            int k=ii(str[0]);
            if(str[1].equals("L")){
                System.out.println(arr[N-k]);
            }
            else
                System.out.println(arr[k-1]);
        }

    }

    private static int ii(String s) {
        return Integer.parseInt(s);
    }

}
