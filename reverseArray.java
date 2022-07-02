import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
       int i = m+1;
        int j = arr.size()-1;
        while(i<j){
            int a = arr.get(i);
            int b = arr.get(j);
            arr.set(i,b);
            arr.set(j,a);
            i++;
            j--;
        }
    }
}
