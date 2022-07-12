import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Error");
            return;
        }
        int prod = 1;
        for(int i=1;i<=num;i++){
            prod*=i;
        }
        System.out.println(prod);
		
	}
}