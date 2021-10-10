import java.util.Scanner;

/*
- [Cathal Poon](https://github.com/EXfighter)
A java impementation of the game fizzbuzz
*/

public class FizzBuzz {
    
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder(); // initialise the string  builder
        Scanner in = new Scanner(System.in); // initialise the scanner
        System.out.println("How many digits do we want to play to?");
        int limit = in.nextInt(); // read in the 

        for (int i = 0; i <= limit; i++) {
            str.setLength(0); // clear the string

            if (i % 3 == 0) {
                str.append("fizz");
            }
            if (i % 5 == 0){
                str.append("buzz");
            }
            if (str.isEmpty()){
                str.append(i);
            }
            System.out.println(str);
        }
        
    }
}