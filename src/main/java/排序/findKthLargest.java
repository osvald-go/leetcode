package 排序;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 215. Kth Largest Element in an Array (Medium)
 */
public class findKthLargest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int k = 2;
        int kthLargest1 = findKthLargest1(a, k);
        int kthLargest2 = findKthLargest2(a, k);
        int kthLargest3 = findKthLargest3(a, k);
        System.out.println(kthLargest1);
        System.out.println(kthLargest2);
        System.out.println(kthLargest3);
    }

    /**
     * 排序函数
     */
    public static int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    /**
     * 堆排
     */
    public static int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : nums) {
            pq.add(val);
            if (pq.size()>k){
                pq.poll();
            }
        }
        if (pq.peek() == null){
            return -1;
        }
        return pq.peek();
    }
    /**
     * 快排
     */
    public static int findKthLargest3(int[] nums, int k) {
        k = nums.length -k;
        int l =0,h = nums.length-1;
        while(l <h){
            int j = partition(nums,l,h);
            if (j==k){
                break;
            }else if (j<k){
                l = j+1;
            }else {
                h = j-1;
            }
        }
        return nums[k];
    }

    private static int partition(int[] a,int l,int h){
        int i = l, j = h+1;
        while (true){
            while(a[++i] < a[l] && i<h);
            while(a[--j] > a[l] && j<l);
            if (i>=j){
                break;
            }
            swap(a,i,j);
        }
        swap(a,l,j);
        return j;
    }

    private static void swap(int[] a,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;

    }
}
