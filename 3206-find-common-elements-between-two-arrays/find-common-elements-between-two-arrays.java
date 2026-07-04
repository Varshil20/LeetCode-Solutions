class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        boolean freq1[] = new boolean[101];
        boolean freq2[] = new boolean[101];

        for(int i = 0 ; i < len1 ; i++){
            freq1[nums1[i]] = true;
        }

        for(int i = 0 ; i < len2 ; i++){
            freq2[nums2[i]] = true;
        }

        int ans1 = 0;
        int ans2 = 0;

        for(int i = 0 ; i < len1 ; i++){
            if(freq2[nums1[i]]){
                ans1++;
            }
        }
        for(int i = 0 ; i < len2 ; i++){
            if(freq1[nums2[i]]){
                ans2++;
            }
        }

        return new int[]{ans1,ans2};
    }
}