package codes;
public class roman_to_integer {
    public static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public static void main(String[] args) {
        
    String x = "MCMXCIV";
    int result = 0;
    
    for(int i = 0 ; i < x.length()  ; i++ ){
        int s1 = value(x.charAt(i));
        if(i+1 < x.length()){
            int s2 = value(x.charAt(i + 1));
            if(s1>= s2){
                result += s1 ;
            }
            else{
                result += (s2-s1);
                i++;
            }
        }
        else{
            result += s1 ;
        }
    }
    System.out.println(result);
}}
