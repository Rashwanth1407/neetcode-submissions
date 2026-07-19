class Solution {
    public static boolean isPalindrome(int x) {
        int original=x;
        int revX=0;
        while(x>0){
            int ld=x%10;
            revX=(revX*10)+ld;
            x=x/10;            
        }       
        return original==revX;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
       

        boolean a = Solution.isPalindrome(x);
        System.out.print(a);

    }

}

  