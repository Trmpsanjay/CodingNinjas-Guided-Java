import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {
        // Write your code here
        String arr[] = input.split(" ");
        String ans = "";
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i]+" ";
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}