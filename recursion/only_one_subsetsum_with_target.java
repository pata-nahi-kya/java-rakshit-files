package recursion;
//if we get target then return function
//bhai sirf if condition laga de agar koi ek recursion answer dega toh woh true return karega
public class only_one_subsetsum_with_target {
    static boolean target_subSetSum(int idx , int[]array,int sum,int target){

        if(idx>=array.length-1){
            if(sum==target){
                System.out.println(idx);
                return true;
            }
            else{
                return false;
            }
        }
        if(target_subSetSum(idx+1, array, sum+array[idx], target))return true ;
        if(target_subSetSum(idx+1, array, sum, target))return true;

        return false;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean s= target_subSetSum(0, arr, 0, 6);
    }

    
}
