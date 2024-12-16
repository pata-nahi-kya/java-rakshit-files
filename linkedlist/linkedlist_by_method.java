package linkedlist;
import java.util.Arrays;
import java.util.LinkedList;

public class linkedlist_by_method {
    public static void main(String[] args) {
        // initialize linked list 
        LinkedList<Integer> lis = new LinkedList<>();

        // addition of item in linkedlast
        lis.add(10);
        lis.add(20);
        lis.add(30);
        lis.add(40);
        System.out.println(lis);

        lis.remove(3);
        System.out.println("removed last element 40(index 3)");
        System.out.println(lis);

        //method to see if it contains element only 
        System.out.println("is it contain 20");
        lis.contains(20);
        
        // this method return index of element
        System.out.println("index of 20");
        lis.indexOf(20);

        // method that returns size of linkedlist
        System.out.println("size of array");
        System.out.println(lis.size());

        // linkedlist to array
        var array = lis.toArray();
        System.out.println(Arrays.toString(array));
        


    }
}
