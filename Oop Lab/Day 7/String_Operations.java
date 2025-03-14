public class String_Operations {
    public static void main(String[] args) {
        
        String s1 = "Hello";
        String s2 = "World";
        
        int compare = s1.compareTo(s2);
        System.out.println("Comparison result between str1 and str2: " + compare);
        
        
        int index = s2.indexOf('o');
        System.out.println("Index of 'o' in str2: " + index);
        
        
        char ch = s1.charAt(1);
        System.out.println("Character at index 1 in str1: " + ch);
        
        
        String upper = s1.toUpperCase(); 
        System.out.println("Uppercase str1: " + upper);
        
        
        String lower = s2.toLowerCase();
        System.out.println("Lowercase str2: " + lower);
        
        
    }
}