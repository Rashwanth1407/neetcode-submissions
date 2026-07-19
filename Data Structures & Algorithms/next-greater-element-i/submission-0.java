public class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        int n = nums2.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        
 
        for(int i = n-1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }
            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }
        
  
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums2[i], nge[i]);
        }
        

        int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            result[i] = map.get(nums1[i]);
        }
        
        return result;
    }    
    
    public static void main(String[] args){
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] ans =nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans));  
    }
}