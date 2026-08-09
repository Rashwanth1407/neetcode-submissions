class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> seeNum = new HashSet<>();
        for(int num:nums){
            if(seeNum.contains(num)) return true;
            seeNum.add(num);
        }

        return false;
    }
}