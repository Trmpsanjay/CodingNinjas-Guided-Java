import java.util.Scanner;
class Solution {
	
    static void printSubstrings(String input) {
        // Write your code here
        for(int i =0;i<input.length();i++){
            for(int j=i;j<=input.length();j++){
                System.out.println(input.substring(i,j));
            }
        }
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
	}
}
