import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        for(int i=S; i<=E; i+=W){
           int C =((i-32)*5)/9 ;
            System.out.println(i+"\t"+C);
         }
		
	}
}