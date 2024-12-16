package codes;

public class frog_problem {
    static void frog_problem_solution_1(int[] array ){
        int answer = 0 ;
        for(int i = 0 ; i < array.length -2  ; i++){
            if(Math.abs(array[i+2] - array[i]) >= Math.abs(array[i+1] - array[i]) ){
                answer = answer + Math.abs(array[i+1] - array[i]);
               
            }
            else{
                answer = answer + Math.abs(array[i+2] - array[i]);
                i = i+1;
            }
        }
        System.out.println(answer);
    }
    static int frog_problem_solution_recursion(int[] array , int idx , int energy){
        
        // base case
        if(idx >= array.length-2){
            return energy;
        }
        
        
        
        if(Math.abs(array[idx+2] - array[idx]) >= Math.abs(array[idx+1] - array[idx]) ){
            energy = energy + Math.abs(array[idx+1] - array[idx]);  
        }
        else{
            energy = energy + Math.abs(array[idx+2] - array[idx]);
            idx = idx+1;
        }
        energy = energy + frog_problem_solution_recursion(array, idx+1, energy);

        return energy;

    }
    public static void main(String[] args) {
        int[] array = {10 ,30,40,20};
        System.out.println(frog_problem_solution_recursion(array,0,0));

    }

}
