import java.util.*;
class Solution {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        for(int i=size-1;i>=0;i--){
            if(arr[i]==num){
                System.out.println(i);
                return;
            }
                
        }
        
        System.out.println("-1");
    }
}