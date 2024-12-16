package recursion;

public class first_and_last_occurence {
    public static int first = -1 ;
    public static int last = -1 ;

    static boolean removeA2(int[] a , int idx  ){
        if(idx==a.length-2){
            return true;
        }
        return (a[idx] < a[idx+1] && removeA2(a, idx+1));
    }
    public static void main(String[] args) {
        int[] ans = {1,2,3,4,5,6};
        System.out.println(removeA2(ans, 0));
    }
}
