package OOP;
/*you have to implement all abstarct method of interface in 
 in inherited class otherwise you are destroying purpose of interface
  */

interface a{
    void a1();
    void a2();
    void a3();
}

class b implements a {
    public void a1() {
        System.out.println("class b a1()");
    }

    public void a2(){
        System.out.println("class b a2");
    }

    @Override
    public void a3() {
        
        throw new UnsupportedOperationException("Unimplemented method 'a3'");
    }
} 

public class purpose_of_interface {
    public static void main(String[] args) {
        a rakshit = new b();
        rakshit.a2();        
    }
}
