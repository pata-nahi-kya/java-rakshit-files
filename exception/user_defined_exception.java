package exception;
// we are trying to make method which says if you are elgible for vote

class InvalidAgeException extends Exception{
    InvalidAgeException(String Message){
        super(Message);
    }
    
}

class user_defined_exception {
    public static void vote_eligibility(int age) throws InvalidAgeException // declared exception here
    {
        if(age < 18){
            throw new InvalidAgeException("you are not eligible for voting");
        }
        else{
            System.out.println("congratulation you are eligible for voting");
        }
    }
    public static void main(String[] args) {
        
        try{
            vote_eligibility(19);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }        
    }   
}
