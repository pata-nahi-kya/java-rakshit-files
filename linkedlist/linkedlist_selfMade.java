package linkedlist;

class linked_list {
    public int size;
    
    class Node {
        int data;
        Node next ;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node first;
    public static Node last;
    

   
   /*adding method linked list */
    public void addFirst(int value){
        var linked = new Node(value);
        size++;
        if(first == null){
            linked.data = value;
            linked.next =  null;
            first = last = linked;
            return;
        }
        else{  
            linked.next = first;
            first = linked; 
            return;
        }  
    }

    public void addLast(int value){
        var linked = new Node(value);
        size++;
        if(first == null){
            linked.data = value;
            linked.next =  null;
            first = last = linked;
            return;
        }
        else{
            Node currHead = first;
            while (currHead.next != null){
                currHead = currHead.next;            
        }
            currHead.next = linked;
            linked.next = null;
            linked.data = value;
            last = linked;
        }
    }

    public void addIdx(int idx , int value){
        
        if(idx == 0){
            addFirst(value);
            return;
        }
        size++;
        Node temp = first;
        int i = 0 ;
        while(temp.next != null ){
            if(i == idx-1){
                Node node = new Node(value);
                node.next = temp.next;
                temp.next = node;
                return;    
            }
            temp = temp.next;
            i++;
        }
    }
    public void printList(){
        Node currHead = first;
        while (currHead != null) {
            System.out.print(currHead.data + " ");
            currHead = currHead.next;            
        }
        System.out.println("null");
    }  

    //---------------------------------------//
    /* removing from linked list */
    public int removeFirst() {
        if(size == 0) {
            System.out.println("empty LL");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = first.data;
            first = last = null;
            size = 0;
            return val;
        }
        int val = first.data;
        first = first.next;
        size--;
        return val;
    }
    public int removeLast() {
        if(size == 0) {
            System.out.println("empty LL");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = last.data;
            first = last = null;
            size = 0;
            return val;
        }
        int val = last.data;
        Node temp = first;
        for(int i=0; i<size-2; i++) {
            temp = temp.next;
        }
        val = temp.data;
        temp.next = null;
        last = temp;
        size--;
        return val;
    }


    /*------------------------------------------*/
    // extra 
    
    public void search(int value_search){
        Node temp = first;
        int i = 0 ;
        while(temp != null){
            if(temp.data == value_search){
                System.out.println(i);
                return ;
            }
            i++;
            temp = temp.next;
        }
        System.out.println();
    }
}
public class linkedlist_selfMade {
    public static void main(String[] args) {
        linked_list rakshit = new linked_list();
        rakshit.addFirst(5);
        rakshit.addFirst(25);
        rakshit.addFirst(255);
        rakshit.addFirst(256);
        rakshit.addLast(59);
        rakshit.printList();
        
        System.out.println("removed first element of list");
        rakshit.removeFirst();
        rakshit.printList();
        System.out.println("inserting element at any index");
        rakshit.addIdx(2,558);
        rakshit.printList();
        System.out.println("searching value");
        rakshit.search(25);

        
    }
}
