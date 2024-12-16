package linkedlist;

import java.util.LinkedList;

public class  basic_linkedlist_all_methods {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();  /*Creates an ArrayList object of integer type */
        LinkedList<Integer>  l2 = new LinkedList<>();
        l2.add(15);
        l2.add(20);
        l2.add(25);


        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);                        
        l1.add(9);
        l1.add(6);

        l1.addAll(0,l2);           //this will add all the elements of l2 from index 0
        System.out.println("LinkedList");
        l1.add(4,10);       //Adds at specified location
        System.out.println("Appended element on index 4 with 20");
        l1.add(4,20);
        // sets the specific element at specific location

        l1.addLast(999);             //add element to the last position
        l1.addFirst(111);            //add element to the first place

        for(int i=0 ; i<l1.size() ; i++ ){
            System.out.print(l1.get(i));  //returns the element at specified location
            System.out.print(", ");
        }
        System.out.println();


        System.out.println("index of 6: "+l1.indexOf(6));  //returns index of specific elements first occurrence
        System.out.println("index of 6 last occurrence: "+ l1.lastIndexOf(6));
        System.out.println("Size of Linked List: "+ l1.size());
        System.out.println(l1.contains(8));

        //Because linked list also implements the deque interface so it will also have properties of lifo last in first out
        //so in addition to all the methods that we can perform in ArrayList  we can addLast() and addFirst()  methods
        //Object clear = new Object();    //usage of clear();
        l1.clear();
        for(int i=0 ; i<l1.size() ; i++ ){     //this will not print anything as now there are no elements in the array

            System.out.print(l1.get(i));  //returns the element at specified location
            System.out.print(", ");
        }
        System.out.println(l1.contains(8));     //this will return false as if now there are no elements in the LinkedList
        System.out.println("EOP");

    }
}
