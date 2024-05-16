import java.util.PriorityQueue;

public class q12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 12, 9, 83, 49, 78,8,10};
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for (int num : arr) {
            minheap.add(num);
        }
        System.out.println("Dequeued elements in ascending order:");
        while (!minheap.isEmpty()) {
            System.out.print(minheap.poll() + " ");
        }
    }
}