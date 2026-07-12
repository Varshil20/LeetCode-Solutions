class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n = nums1.length;
       int m = nums2.length;
       int i = 0 , j = 0 , m1 = 0 , m2 = 0;

       for(int k = 0 ; k <= (m+n)/2 ; k++){
            m2 = m1;

           if(i < n && j < m){
            if(nums1[i] < nums2[j]){
                m1 = nums1[i++];
            }
            else{
                m1 = nums2[j++];
            }
           }
           else if(i < n){
            m1 = nums1[i++];
           }
           else{
            m1 = nums2[j++];
           }
       }

       if((m+n)%2 == 1){
        return (double) m1;
       }

       double ans = m1 + m2;

       return ans/2;
    }
}