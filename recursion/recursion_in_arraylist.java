package recursion;
import java.util.ArrayList;

public class recursion_in_arraylist {
    static void allIndices2(int[] a, int n, int x, int idx){
        if(idx >= n) return;
        if(a[idx] == x) System.out.println(idx);
        allIndices2(a, n, x, idx+1);
    }
    static ArrayList<Integer> allIndices(int[] a, int n, int target, int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        // base case
        if(idx >= n){
            return ans; // return empty arraylist
        }
        // self work
        if(a[idx] == target){ // ans -> {0}
            ans.add(idx);
        }
        // recursive work
        ArrayList<Integer> smallAns = allIndices(a, n, target, idx+1); // smallAns = {1, 3}

        ans.addAll(smallAns); // {0, 1, 3}
        return ans;
    }
    
    static boolean search(int[] a, int n, int target, int idx){
        if(idx >= n) return false;
        if(a[idx] == target) return true;
        return search(a, n, target, idx+1);
    }
}
