package OOP;

// how to make class

// you can make class by this way 
// you can use public with only filename here basic_info
class mathematics{
    static void adding_two(int q , int w) {
        System.out.println(q+w);        
    }
    void add_two_number(int ab , int bc){
        System.out.println(ab + bc);
    }
    //All method declarations in an interface, including 
    //default methods, are implicitly public , so you can omit the public modifier.
    void will_add(int k , int j ){
        System.out.println(k+j);
    }}

public class basic_info {
    // how to make method in given class and how to use it
    public static int addTwo(int a , int b){
        return a+b ;
    }
    public static void main(String[] args) {
        
        System.out.println("printing addTwo result"); 
        System.out.println(addTwo(6, 70));

        System.out.println("aadding two numbers using class having static keyword");
        mathematics.adding_two(89, 78);

        System.out.println("adding two numbers using class without having static keyword");
        mathematics add = new mathematics();
        add.add_two_number(45, 55);
        
        System.out.println("adding two numbers using class without public keyword");
        add.will_add(56, 56);
    }}