
// program for to confirm if there is query number inside array

// doubted array ke values par makeFrequencyArray number hum one 
// kar dete hai and for query we see if that at that number is 
// value one or zero 

import java.util.Scanner;

public class present_query {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[Integer.MAX_VALUE];
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] freq = makeFrequencyArray(arr);

        System.out.print("Enter number of queries ");
        int q = sc.nextInt();

        while(q > 0){
            System.out.print("Enter number to be searched ");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }
        sc.close();

    }
}
