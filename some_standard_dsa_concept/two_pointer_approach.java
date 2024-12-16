package some_standard_dsa_concept ;

// given an array sorted in increasing order return array of 
// squares of each number sorted in non decreasing order

public class two_pointer_approach {
    public static void main(String[] args) {
        int [] array = {-12,-10,3,4,6,20 };
        int n = array.length;
        int left = 0 , right = n-1 ,k=n-1 ;
        int[] ans = new int[n];
        while (left <= right) {
            if(Math.abs(array[left]) > Math.abs(array[right])){
                ans[k--] = array[left]*array[left];
                left++;
            }
            else{
                ans[k--] = array[right]*array[right];
                right--;
            } }
        for(int p =  0 ; p < n ; p++){
            System.out.println(ans[p]);
        }
        
        
        // sort 1 and 0 membered array 
        int[] array2 = {0,1,0,1,1,0,0,1,1,0};
        left = 0;
        right = array2.length - 1;
        while(left <= right ){
            if(array2[left] == 1 && array2[right] == 0){
                array2[left] = 0;
                array2[right] = 1;
                left++;
                right--;
            }
            if(array2[left] == 0){
                left++;
            }
            if(array2[right] == 1){
                right--;
            }
        }
        for(int p =  0 ; p < array2.length ; p++){
            System.out.println(array2[p]);
        }
    }
}

