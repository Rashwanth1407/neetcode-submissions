

class Solution {
    public static int reverse(int x) { 
        long revN = 0;
        
        while(x != 0){
            revN = (revN * 10) + (x % 10);
            x = x / 10;
        }
        
        if(revN > Integer.MAX_VALUE || revN < Integer.MIN_VALUE){
            return 0;
        }
        
        return (int)revN;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = Solution.reverse(x); 
        System.out.println(a);
    }
}