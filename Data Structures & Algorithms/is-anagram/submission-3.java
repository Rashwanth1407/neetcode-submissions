class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sARR = s.toCharArray();
        char[] tARR = t.toCharArray();
        Arrays.sort(sARR);
        Arrays.sort(tARR);
        if(Arrays.equals(sARR,tARR)){
            return true;
        }
        return false;


    }
}
