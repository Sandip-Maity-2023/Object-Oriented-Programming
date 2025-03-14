
import java.util.Scanner;

public class palindrome{
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0,right=s.length()-1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String s1 = x.nextLine();
        x.close();  // Closing the scanner to prevent resource leak

        if (isPalindrome(s1)) {
            System.out.println("Palindrome: " + s1);
        } else {
            System.out.println("Not a palindrome: " + s1);
        }
    }
}