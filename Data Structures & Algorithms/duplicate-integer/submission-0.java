

class Solution {
    public static boolean hasDuplicate(int[] nums) {
        return nums.length != Arrays.stream(nums).distinct().count();
    }


     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        int[] nums = new int[n];
        

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        
        boolean a = hasDuplicate(nums); 
        System.out.print(a);
    }
}