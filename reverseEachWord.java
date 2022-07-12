import java.util.Scanner;

class Solution {

    public static String reverse(String rev){
        String ans = "";
        for(int i=rev.length()-1;i>=0;i--){
            ans+=rev.charAt(i);      
        }
        return ans;
    }
    static String reverseEachWord(String input)
    {
        String arr[] = input.split(" ");
        String ans = "";
        for(int i=0;i<arr.length;i++){
            ans += reverse(arr[i])+" ";
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseEachWord(input);
        System.out.println(ans);
    }
}