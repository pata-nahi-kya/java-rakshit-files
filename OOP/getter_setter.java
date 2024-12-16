package OOP;

// we use it when we have privated something . we cannot access
// diretly and modify it so we make getter and setter method

class get_set{
    private int roll_number;
    
    public int getRoll_number(){
        System.out.println(roll_number);
        return roll_number;
    }
    public void setRoll_number(int roll){
        roll_number = roll    ;
    }
}

public class getter_setter {    
    public static void main(String[] args) {
        get_set school = new get_set();
        school.setRoll_number(35);
        school.getRoll_number();
        // see we can't do that
        //school.roll_number = 89 ;   
    }    
}
