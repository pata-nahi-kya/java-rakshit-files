/* image */ 

package SearchSorting;

public class binary_search_recursion {
    
    static void binarySearch(int A[] , int l , int r , int target){
        int mid = (l + r)/2;
        if(l>r || A[mid] == target){ // base case
            System.out.println(mid);
            return;
        }
        if(A[mid] > target ){
            binarySearch(A, l, mid - 1, target);
        }
        if(A[mid] < target ){
            
            binarySearch(A, mid+1, r, target);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        binarySearch(a, 0, a.length - 1, 8);

    }
    
}
