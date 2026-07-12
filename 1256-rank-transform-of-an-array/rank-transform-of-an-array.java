class Solution {
    public int[] arrayRankTransform(int[] arr) {
        /*int temp[] = arr.clone();

        Arrays.sort(temp);

        Map <Integer , Integer> map = new HashMap<>();
        int rank = 1;

        for(int i = 0 ; i < temp.length ; i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i] , rank);
                rank++;
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;*/

        HashMap<Integer,Integer> map=new HashMap<>();
        int[] nums=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(nums);
        int ind=1;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],ind++);
            }
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=map.get(arr[i]);
        }
        return nums;
    }
}