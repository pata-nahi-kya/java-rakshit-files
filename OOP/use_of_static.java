package OOP;

// static method can access with static variable
//static can't refer to non static variable or methods   
// static variable/function then becomes class related 
// we can access through by classname.function


// everytime we intialize we want that school count increase so that 
// we can get number of school from any object
class school_info{
    static String schoolName;
    static String principalName;
    private static int schoolCount;

    public school_info(String name , String name2 ){
        schoolName = name ;
        principalName = name2;
        schoolCount++ ;
        System.out.println(schoolName + " " + principalName);
    }
    // how to initialize static method 
    public static void name(){
        System.out.println("principal of " + schoolName + " is " + principalName);
    }

    // making getter for school count
    public void get_schoolCount(){
        System.out.println(schoolCount);
    }
}

public class use_of_static {
    public static void main(String[] args) {
        school_info school1 = new school_info("jb diamond", "malcom sir");
        school1.get_schoolCount();
        school_info.name();
        school_info school2 = new school_info("mk gandhi", "daya ben sir");
        school2.get_schoolCount();
        school_info.name();
        school_info school3 = new school_info("pp savani", "santos sir");
        school3.get_schoolCount();
        school_info.name();
    }    
}
