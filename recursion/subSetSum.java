package recursion;

public class subSetSum {
    static void subArray(int[] array , int idx , int sum){
        if(idx >= array.length){
            System.out.println(sum);
            return;
        }
        subArray(array, idx + 1, sum + array[idx]);
        subArray(array, idx+1, sum);
    }
    
    public static void main(String[] args) {
        int[] array = {2,4,5};
        subArray(array, 0, 0);
        
    }
}
