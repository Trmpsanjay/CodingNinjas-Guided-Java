import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double si = (p*r*t)/100;
        int ans =(int)Math.floor(si);
        System.out.println(ans);
        
		
	}
}