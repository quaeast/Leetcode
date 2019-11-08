class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int p=n+m-1;
        while (p1>0&&p2>0){
            nums1[p--] = nums1[p1]>nums2[p2]?nums1[p1--]:nums2[p2--];
        }
        System.arraycopy(nums2, 0, nums1, 0, p2+1);
    }
}

class Solution88_1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempNums1 = nums1.clone();
        int k=0,i=0,j=0;
        for (;i<m&&j<n;k++){
            nums1[k]=tempNums1[i]<nums2[j]?tempNums1[i++]:nums2[j++];
        }
        if(i<m){
            System.arraycopy(tempNums1, i, nums1, k, n+m-k);
        }else if(j<n){
            System.arraycopy(nums2, j, nums1, k, n+m-k);
        }
    }
}

public class LC88 {
}
