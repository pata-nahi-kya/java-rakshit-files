
import java.util.Arrays;

public class union_intersection {

    static void print_array(int[] array){
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();}

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,7,8};
        int[] B = {2,4,5,6,8,9,10};
        int u = B.length ;
        int i = A.length + B.length ;
        
        int[] union = new int[u];
        int[] intersection = new int[i];

        int a = 0;
        System.out.println(Arrays.binarySearch(A, 0, 7, 7));
        int b = 0 ;
        int for_union = 0;
        int for_intersection = 0 ;

        for(int k = 0 ; k < i ; k++){
            if(A[a] == B[b]){
                union[for_union] = A[a] ;
                for_union++ ;
                a++;
                b++;
            }
            else if(A[a] > B[b]){
                intersection[for_intersection] = B[b];
                b++;
                for_intersection++ ;
            }
            else if(A[a] < B[b]){
                intersection[for_intersection] = A[a];
                a++;
                for_intersection++ ;
            }
        }
        print_array(intersection);
        print_array(union);

    }
}
