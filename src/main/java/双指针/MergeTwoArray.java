package 双指针;

import utils.LeetCodeUtils;

/**
 * merge两个有序数组
 */
public class MergeTwoArray {
    public static void main(String[] args) {

        int [] nums1= {1,2,3,4,0,0,0};
        int [] nums2= {5,6,7};
        merge(nums1,4,nums2,3);
        System.out.println(LeetCodeUtils.printArray(nums1));
    }

    private static void merge(int[] nums1, int m,int[] nums2,int n){
        int index1 = m-1, index2 = n-1;
        int indexMerge = m+n -1;
        while(index2 >=0){
            if (index1 < 0){
                nums1[indexMerge--] = nums2[index2--];
            }else if(index2 <0){
                nums1[indexMerge--] = nums1[index1--];
            }else if(nums1[index1] > nums2[index2]){
                nums1[indexMerge--] = nums1[index1--];
            }else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }
}
