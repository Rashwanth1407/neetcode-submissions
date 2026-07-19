


public class Solution {
    public static boolean isArmstrong(int num) {
        int og = num;
        int sum = 0;
        int powval = String.valueOf(num).length();
        
        while(num > 0){
            int ld = num % 10;          
            int arm = (int)Math.pow(ld, powval);
            sum = sum + arm;
            num = num / 10;
        }
        
        return sum == og;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean c = isArmstrong(num);
        System.out.print(c);
    }
}