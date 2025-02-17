class UppercaseThread extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println("Uppercase: " + ch);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class LowercaseThread extends Thread {
    public void run() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println("Lowercase: " + ch);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SpecialCharThread extends Thread {
    public void run() {
        char[] specialChars = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
        for (char ch : specialChars) {
            System.out.println("Special Character: " + ch);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class CharacterThreads {
    public static void main(String[] args) {
        UppercaseThread uppercaseThread = new UppercaseThread();
        LowercaseThread lowercaseThread = new LowercaseThread();
        SpecialCharThread specialCharThread = new SpecialCharThread();

        uppercaseThread.start();
        lowercaseThread.start();
        specialCharThread.start();
    }
}
