package linkedlist ; 

/**
 * Singly Linked list implementation in Java
 * 
 *  Copy the 3 classes in Node.java, LinkedList.java and Main.java in order to 
 * run the implementation
 * 
 * 
 *   ____________	    _____________        ______________
 *  |item "test1"|	   | item "test2"|      | item "test3" |
 *  |        next|---->|        next |----->|         next |------>null	
 *  |____________|	   |_____________|	    |______________| 	
 * 
 * */
 
 /**
  * Node.java
  * */
  class  Node {
    public Object item;
    public Node next;
}

/**
 * LinkedList.java 
 * 
 **/
 class LinkedList {
    private int size;
    private Node head;

  public LinkedList() {
      this.size = 0;
      this.head = null;
  }

/**
* Inserting new node at the end of the linked list
* 
* @param item - represent the node item to be added to the linked list
*/
  public void insertNode(String item) {
      Node node = new Node();
      node.item = item;
      Node current = this.head;

      if (this.head == null) {
          this.head = node;
          this.head.next = null;
          this.size = 1;
          System.out.println(this.head.toString());
      } else {

          while (current.next != null) {
              current = current.next;
          }
          current.next = node;
          node.next = null;
          this.size += 1;
      }
  }
  
  /**
   * Adding node at the first location of the linked list
   * 
   * @param item - represent item of the node to be added to LL
   */
  public void insertFirst(String item){
      Node node = new Node();
      node.item = item;
      node.next = this.head;
      head = node;
      size++;
  }
  
  /**
   * Adding node at the nth location of the linked list
   * 
   * @param item - represent the item of the node to be added to the list
   * @param position - position at which the node is to be added
   */
  public void insertNth(String item, int position) {
      Node node = new Node();
      node.item = item;
      Node current = this.head;
      if (this.head != null && position <= this.size) {
          for (int i = 1; i < position; i++) {
              current = current.next;
          }
          node.next = current.next;
          current.next = node;
          this.size += 1;
      }else{
          System.out.println("Exceeded the linked list size. Current Size: "+size);
      }
  }

  /**
   * Deleting the first node from the list
   */
  public void deleteFirstNode() {
      if(head != null){
          this.head = this.head.next;
          this.size--;
      }else{
          System.out.println("Linked list is empty");
      }
  }

  /**
   * Deleting the last node from the list
   */
  public void deleteLastNode() {
      Node currentNode = this.head;
      if(size == 1){
          head = null;
          size = 0;
      }else{
          Node prevNode = null;
          while (currentNode.next != null) {
              prevNode = currentNode;
              currentNode = currentNode.next;
          }
          prevNode.next = null;
          this.size--;
      }
  }

  /**
   * Deleting the node from the nth location in the list
   * 
   * @param position - location of the node to be deleted
   */
  public void deleteNthNode(int position) {
      if (position <= this.size && this.head != null) {
          Node currentNode = this.head;
          Node prevNode = null;
          for (int i = 0; i < position; i++) {
              prevNode = currentNode;
              currentNode = currentNode.next;
          }
          prevNode.next = currentNode.next;
          this.size--;
      }else{
          System.out.println("No node exist at location: "+position);
      }
  }

  /**
   * Find if the node exist in the list
   * 
   * @param item - item to be found in the list
   * 
   */
  public void findNode(String item) {
      Node node = this.head;
      boolean found = false;
      for(int i=0;i<size; i++){
          if(node.item.equals(item)){
              System.out.println("Item "+item+" was found at location "+i+" in the linked list");
              found = true;
          }
          node = node.next;
      }
      
      if(!found)
          System.out.println("Item "+item+" was not found in the Linked list");
  }

  /**
   * Find the node item located at a specific location
   * 
   * @param location - Find item at location
   * 
   */
  public void findNodeAt(int location) {
      Node node = this.head;
      if(head !=null && location<= size){
          for(int i=0;i<location;i++){
              node = node.next;
          }
          System.out.println("Node item at location "+location+" is "+node.item);
      }
  }

  /**
   * Find the item at the last location
   * 
   */
  public void findLastNode() {
      Node node = this.head;
      if(head != null){
          for(int i=0;i<size-1;i++){
              node = node.next;
          }
          System.out.println("Node item at last location is "+node.item);
      }
  }


  /**
   * Printing all the items in the list
   */
  public void printNodes() {
      if (this.size < 1)
          System.out.println("There are no nodes in the linked list");
      else {
          Node current = this.head;
          for (int i = 0; i < this.size; i++) {
              System.out.println("Node " + current.item + " is at location " + i);
              current = current.next;
          }
      }
  }
  
  /**
   * Obtain the current size of the list
   * @return
   */
  public int getListSize(){
      return size;
  }

}
 

/**
* Main.java 
* 
**/

public class basic_notes_github {

  public static void main(String[] args) {
      LinkedList list = new LinkedList();
      
      System.out.println("Current Size of the list is: "+list.getListSize());
      
      list.insertNode("test1");
      list.insertNode("test2");
      list.insertNode("test3");
      list.insertNode("test4");
      list.insertNode("test5");
      list.insertNode("test6");
      list.insertNode("test7");
      list.printNodes();
      
      System.out.println();
      
      System.out.println("Finding item test2 in the Linked list");
      list.findNode("test2");
      System.out.println("Finding item nonExist in the Lineked list");
      list.findNode("nonExist");
      
      System.out.println();
      
      System.out.println("Finding item at location 4");
      list.findNodeAt(4);
      
      System.out.println();
      System.out.println("Finding item at last location ");
      list.findLastNode();
      
      System.out.println();
      
      System.out.println("Current Size of the list is: "+list.getListSize());
      System.out.println("Adding test1st at start of the Node");
      list.insertFirst("test1st");
      list.printNodes();
      
      System.out.println();
      
      System.out.println("Current Size of the list is: "+list.getListSize());
      System.out.println("Adding testNth at 2nd Location");
      list.insertNth("testNth", 2);
      list.printNodes();
      
      System.out.println();
      
      System.out.println("Current Size of the list is: "+list.getListSize());
      System.out.println("Deleting first node");
      list.deleteFirstNode();
      list.printNodes();
      
      System.out.println();
      
      System.out.println("Current Size of the list is: "+list.getListSize());
      System.out.println("Deleting last node");
      list.deleteLastNode();
      list.printNodes();
      
      System.out.println();
      
      System.out.println("Current Size of the list is: "+list.getListSize());
      System.out.println("Deleting node from 4th location");
      list.deleteNthNode(4);
      list.printNodes();
  }

}

/**
*  OUTPUT
* 
*  	Current Size of the list is: 0
  Node test1 is at location 0
  Node test2 is at location 1
  Node test3 is at location 2
  Node test4 is at location 3
  Node test5 is at location 4
  Node test6 is at location 5
  Node test7 is at location 6
  
  Finding item test2 in the Linked list
  Item test2 was found at location 1 in the linked list
  Finding item nonExist in the Lineked list
  Item nonExist was not found in the Linked list
  
  Finding item at location 4
  Node item at location 4 is test5
  
  Finding item at last location 
  Node item at last location is test7
  
  Current Size of the list is: 7
  Adding test1st at start of the Node
  Node test1st is at location 0
  Node test1 is at location 1
  Node test2 is at location 2
  Node test3 is at location 3
  Node test4 is at location 4
  Node test5 is at location 5
  Node test6 is at location 6
  Node test7 is at location 7
  
  Current Size of the list is: 8
  Adding testNth at 2nd Location
  Node test1st is at location 0
  Node test1 is at location 1
  Node testNth is at location 2
  Node test2 is at location 3
  Node test3 is at location 4
  Node test4 is at location 5
  Node test5 is at location 6
  Node test6 is at location 7
  Node test7 is at location 8
  
  Current Size of the list is: 9
  Deleting first node
  Node test1 is at location 0
  Node testNth is at location 1
  Node test2 is at location 2
  Node test3 is at location 3
  Node test4 is at location 4
  Node test5 is at location 5
  Node test6 is at location 6
  Node test7 is at location 7
  
  Current Size of the list is: 8
  Deleting last node
  Node test1 is at location 0
  Node testNth is at location 1
  Node test2 is at location 2
  Node test3 is at location 3
  Node test4 is at location 4
  Node test5 is at location 5
  Node test6 is at location 6
  
  Current Size of the list is: 7
  Deleting node from 4th location
  Node test1 is at location 0
  Node testNth is at location 1
  Node test2 is at location 2
  Node test3 is at location 3
  Node test5 is at location 4
  Node test6 is at location 5
* 
**/
