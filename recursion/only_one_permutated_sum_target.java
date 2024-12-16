package recursion;


import java.util.ArrayList;

public class only_one_permutated_sum_target {
    static boolean target_permutated_sum(int idx , int[] array , ArrayList<Integer>arraylist,int target){
        if(idx>=array.length){
            int total = 0 ;
            for(int s : arraylist ){
                total = total + s;
            }
            if(total==target){
                System.out.println(idx);
                return true;
            }
            else{
                return false;
            }

        }
        arraylist.add(array[idx]);
        if(target_permutated_sum(idx+1, array, arraylist,target))return true;
        arraylist.remove(arraylist.size()-1);
        if(target_permutated_sum(idx+1, array, arraylist,target))return true;
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        int[] arr = {4,8,9,1,4};
        boolean s = target_permutated_sum(0, arr, arraylist, 8);
    };


    }

