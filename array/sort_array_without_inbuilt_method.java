

public class sort_array_without_inbuilt_method {
    public static void main(String[] args) {
        int nums[] = {0,2,1,0,2,1,0,2};
        int answer[] = new int[nums.length];
        int a = 0 ;
        int b = 0 ;
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1 ){
                a++;
            }
            else if (nums[i] == 2 ){
                b++;
            }
        }
        int c = nums.length - a - b - 1 ;
        a = c + a;
        b = c + a + b;
        for(int k = 0 ; k < nums.length ; k++ ){
            if (c < k && k <= a){
                answer[k] = 1;
            }
            else if( a < k && k <= nums.length){
                answer[k] = 2;
            }
        }
        for(int y = 0 ; y < answer.length ; y++){
            System.out.println(answer[y]);
        }
    }
    
}
