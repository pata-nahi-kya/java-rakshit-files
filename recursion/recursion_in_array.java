package recursion;

public class recursion_in_array {

    static void print_array(int[] array , int n){
        if(n==0){
            System.out.println(array[n]);
            return;
        }
        print_array(array, n-1);
        System.out.print(array[n] + " ");
    }

    static int sum_array(int[] array , int n){
        if(n==0){
            return array[0];
        }
        return array[n] + sum_array(array, n-1);
    }

    static int max_in_array(int[]array , int n){
        if(n==0){
            return array[n];
        }

        return Math.max(max_in_array(array,n-1), array[n]);
    }

    static void findAllIndices(int[] a, int n, int target, int idx){
        // base case
        if(idx >= n){
            return;
        }
        //self work
        if(a[idx] == target){
            System.out.println(idx);
        }
        //recursive work
        findAllIndices(a, n, target, idx+1); // 1, 3, 4
    }

    static int firstIndex(int[] a, int n, int target, int idx){
        if(idx == n) return -1;
        if(a[idx] == target) return idx;
        return firstIndex(a, n, target, idx+1);
    }
    static int lastIndex(int[] a, int n, int target, int idx){
        if(idx == -1) return -1;
        if(a[idx] == target) return idx;
        return lastIndex(a, n, target, idx-1);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,3,4,5,6};
        print_array(array, array.length - 1);
        System.out.println(sum_array(array, array.length-1));
        System.out.println(max_in_array(array, array.length-1));
        findAllIndices(array, array.length-1, 3, 0);
        System.out.println(firstIndex(array, array.length-1, 3, 0));
        System.out.println(lastIndex(array, array.length-1, 3, array.length-1));
    }
    
}
