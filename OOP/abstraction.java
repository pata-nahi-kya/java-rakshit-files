package OOP;

abstract class animal {
    public abstract void sound() ;
}

class tiger extends animal {
    @Override
    public void sound() {
        System.out.println("roaring");
    }
}

class dog extends animal {
    @Override
    public void sound(){
        System.out.println("barking");
    }
}

public class abstraction {
    public static void main(String[] args) {
        //animal nk = new animal() ; we cannot instaniate abstarct class
        dog t = new dog();
        tiger d = new tiger();
        t.sound();
        d.sound();
    }    
}
