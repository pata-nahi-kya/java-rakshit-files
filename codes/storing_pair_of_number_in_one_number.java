package codes;

public class storing_pair_of_number_in_one_number {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        int len = nums.length/2;
        int [] stored = new int[len];

        // how to store 
        for(int i = 0 ; i < len;i++){
            stored[i] = (nums[i]*1001) + nums[len+i] ;
        }
        for(int i = 0 ; i < stored.length ; i++){
            System.out.println(stored[i]);
        }

        // how to retrive
        int index = 0;
        int[] answer = new int [6]; 
        for(int i = 0 ; i < stored.length;index+=2,i++){
            answer[index] = stored[i]/1001;
            answer[index+1] = stored[i]%1001;
        }

        // that same array
        int[] answers = new int [6] ;
        
        for(int i = 0 ; i<stored.length ; i++){
            answers[i] = stored[i]/1001;
            answers[len+i] = stored[i]%1001;
        }
        //printing array
        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i]);
        }

        System.out.println();

        //printing array
        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answers[i]);
        }
    }
}
