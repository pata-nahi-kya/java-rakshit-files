
        
//The code is a Java program that checks the strength of a password 
//entered by the user.

//The program uses the following steps to check the strength of the 
//password:

// 1)It first checks if the length of the password is at least 6 
// characters long. If the length of the password is less than 6
// characters, the program will print an error message and return.
// 2)Then, the program iterates through each character of the
// password and checks the number of uppercase characters,
// lowercase characters, digits, and special characters in the password.
// 3)After checking the number of each type of characters, the program will check if the password contains at least one uppercase character,
// one lowercase character, one special character, and one digit. If the password doesn’t contain at least one of each type of character, 
// the program will print an error message.
// 4)If the password contains at least one of each type of character and has a length of at least 10 characters, the program will print 
// “The strength of the password is strong”. If the length of the password is less than 10 characters, the program will print 
// “The strength of the password is medium”.


import java.util.Scanner;

class password_strength{
    public static void checkPassword(String password) {
        int upperChars = 0, lowerChars = 0, specialChars = 0, digits = 0, length;
        char ch;
        length = password.length();

        if (length < 6) {
            System.out.println("Password must be at least 6 characters long!\n");
            return;
        } else {
            for (int i = 0; i < length; i++) {
                ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    upperChars++;
                } else if (Character.isLowerCase(ch)) {
                    lowerChars++;
                } else if (Character.isDigit(ch)) {
                    digits++;
                } else {
                    specialChars++;
                }
            }
        }

        if (upperChars != 0 && lowerChars != 0 && digits != 0 && specialChars != 0) {
            if (length >= 10) {
                System.out.println("The strength of password is strong.\n");
            } else {
                System.out.println("The strength of password is medium.\n");
            }
        } else {
            if (upperChars == 0)
                System.out.println("Password must contain at least one uppercase character!\n");
            if (lowerChars == 0)
                System.out.println("Password must contain at least one lowercase character!\n");
            if (specialChars == 0)
                System.out.println("Password must contain at least one special character!\n");
            if (digits == 0)
                System.out.println("Password must contain at least one digit!\n");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter password: ");
        String password = scan.nextLine();

        scan.close();

        checkPassword(password);
    }
}