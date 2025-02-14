import java.util.Scanner;

public class Main {

    private static String code;
    private static int codeLength;
    private static int getRandInt() {
        return (int) (Math.random() * 10);
    }
    System.out.println("Tell the code length between 2 to 6:");
    codeLength = scanner.nextInt();
    code = "";
for (int i = 0; i < codeLength; i++) {
    code += getRandInt();
}

    /**
     * Complete the checkCode method to check the guess against the code
     * Print out the apppropriate messages
     * return true if the guess is correct
     * @param guess
     * @return
     */
    public static boolean checkCode(String guess) {
        if (guess.equals(code)) {
        return true;
    }  else {
        int correctDigits = 0;
        for (int i = 0; i < codeLength; i++) {
            if (guess.charAt(i) == code.charAt(i)) {
                correctDigits++;
            }
        }
        System.out.println(String.format("Incorrect guess. You got %d digit(s) correct.", correctDigits));
        return false;
    }
}
 
    public static void main(String[] args) {
        System.out.println("Code cracker game");
        code = "";    
        //Write the code to set the length of the code here
        Scanner scanner = new Scanner(System.in);

        //Write the code to set up the candon code to crack here        
    
        //Write code for main loop here
        while (true) {        
            
            System.out.println(String.format("Code length is %d. Enter your guess: ", codeLength));
            String guess = "";
            do{
                guess = scanner.nextLine();
            } while (guess == null || guess.isEmpty());    
            
            System.out.println("Your guess: " + guess);
            if (guess.length() != codeLength) {
                System.out.println(String.format("Invalid guess length %d. Try again.", guess.length()));
            } else {
                if (checkCode(guess)) {
                    System.out.println("Congratulations! You cracked the code!");
                    break;
                }
            }            
        }
    }
}