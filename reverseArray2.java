import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int n =sc.nextInt();
        int j = 0;
        int temp[] = new int[size];
        for(int i=n;i<size;i++){
            temp[j++] = arr[i];
        }
        for(int i=0;i<n;i++){
            temp[j++] = arr[i];
        }
        for(int i=0;i<size;i++){
            System.out.print(temp[i]+" ");
        }
		
	}
}