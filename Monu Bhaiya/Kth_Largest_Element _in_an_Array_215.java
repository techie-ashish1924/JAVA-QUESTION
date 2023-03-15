import java.util.Collection;
import java.util.PriorityQueue;

public class Kth_Largest_Element _in_an_Array_215 {


    public static void main(String[] args) {

        int arr[] = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 3;

        System.out.println(kthLargest(arr, k));

    }

    public static int kthLargest(int arr[],int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collection.reverseOrder);   // max heap
       
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {

            if (arr[i] > pq.peek()) {

                pq.poll();
                pq.add(arr[i]);
            }

        }

        return pq.peek();

    }

    
    
}
