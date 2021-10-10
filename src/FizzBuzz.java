import java.util.InputMismatchException;
import java.util.Scanner;

/*
- [Cathal Poon](https://github.com/EXfighter)
A java impementation of the game fizzbuzz
*/

public class FizzBuzz {
    
    public FizzBuzz(){

    }
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder(); // initialise the string  builder
        FizzBuzz game1 = new FizzBuzz();
        int limit = game1.getInput(); // read in the numner to play to 

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

    private int getInput(){
        int out;
        
        Scanner in = new Scanner(System.in); // initialise the scanner
        while (true) {
            System.out.println("How many digits do we want to play to?"); // request a number from the user

            try {
                out = in.nextInt(); // read in the next integer
            } catch (InputMismatchException exc) {
                //TODO: handle exception
                System.out.println(exc + ": Value must be an Integer.");
                in.nextLine();
                continue;
            }

            try {
                checkInput(out);
                break;
            } catch (Exception exc) {
                //TODO: handle exception
                System.out.println(exc);
                continue;
            }
            
        }

        in.close(); // close the scanner object 
        return out;
    }

    private void checkInput(int i){
            if (i < 0) {
                throw new IllegalArgumentException("Value must be non-negative.");
            } 
    }
}
