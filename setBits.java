public class Solution {
	public static int countSetBits(int n) {
		// Write your code here.
//         String bits = "";
//         while(n>0){
//             int rem = n%2;
//             bits= bits + String.valueOf(rem);
//             n/=2;
//         }
//         int count = 0;
//         for(int i=0;i<bits.length();i++){
//             char c = bits.charAt(i);
//             if(c=='1'){
//                 count++;
//             }
//         }
//         //System.out.println(bits);
//         return count;
        
        
        //method2
        int count = 0;
        while(n>0){
            int rem = n%2;
            if(rem==1) count++;
            n=n/2;
        }
        return count;
	}
}