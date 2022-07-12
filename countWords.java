import java.util.Scanner;
class Solution {
	
    static int  countWords(String input) {
        // Write your code here
        int count = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' ') count++;
        }
        return count+1;
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = countWords(input);
        System.out.println(output);
		
	}
}
