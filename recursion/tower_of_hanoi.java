package recursion;

public class tower_of_hanoi {
    public static void tower (int n , String source , String helper , String destination){
        if(n == 1){
            System.out.println("transfer disk " + n + " from " + source  + " to " + destination);
            return;
        }
        tower(n-1, source, destination, helper);
        System.out.println("transfer disk " + n + " from " + source  + " to " + helper);
        tower(n-1, helper, source, destination);
    }
    
    public static void main(String[] args) {
        tower(3, "source", "helper", "destination");
        
    }
}
