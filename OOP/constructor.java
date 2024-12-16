package OOP;

// how to initialize object very fast by creating constructor

class easyWayToCreateObject{
    String name ;
    String gender;
    int age;

    // always make default constructor so that you can initialize 
    // object in normal way
    public easyWayToCreateObject(){

    }
    public easyWayToCreateObject(int umar , String jaati , String naam ){
        name = naam ;
        age = umar ;
        gender = jaati ;
        System.out.println(naam + " " + umar + " " + jaati);
    }
    
}

public class constructor {
    public static void main(String[] args) {
        // generally we initialize constructor by
        // this object was able to create because of default constructor 
        easyWayToCreateObject info = new easyWayToCreateObject();
        info.age = 25;
        info.gender = "male";
        info.name = "mohan";
        System.out.println(info.age + " " + info.gender + " " + info.name);

        easyWayToCreateObject info2 = new easyWayToCreateObject(35 , "female" , "heena");
        System.out.println(info2.age);
    }
    
}
