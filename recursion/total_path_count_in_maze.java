package recursion;

public class total_path_count_in_maze {
    public static int total_ways(int i , int j , int m , int n ){
        if(i == m || j == n){
            return 0;
        }
        if(i==m&&j==n){
            return 1;
        }
        int right_way = total_ways(i+1, j, m, n);
        int down_way = total_ways(i, j+1, m, n);
        return right_way + down_way;
    }
    
    public static void main(String[] args) {
        int i = 1 , j = 1 , m = 3 , n = 3;
        System.out.println(total_ways(i, j, m, n));
        
    }
    
}
