package recursion;

import java.util.ArrayList;

class GfG {
    // Function to find the possible permutations.
    static void permutations(int idx , int[]array , ArrayList<Integer>arrayList) {
        if(idx>=array.length){
            System.out.println(arrayList);
            return;
        }
        arrayList.add(array[idx]);
        permutations(idx+1, array, arrayList);
        arrayList.remove(arrayList.size()-1);
        permutations(idx+1, array, arrayList);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> ArrayList = new ArrayList<>();
        permutations(0, arr, ArrayList);
    }
}

