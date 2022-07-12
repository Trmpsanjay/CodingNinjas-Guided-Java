import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        long ans = 1;
        for(int i=1;i<=pow;i++){
            ans*=num;
        }
        System.out.println(ans);
		
	}
}