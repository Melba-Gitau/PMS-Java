public class String{
    public static void main(String[]args){
        String word = "Hello";
        int x = word.length();
        System.out.println(x);
    }
}//To check length of string


public class Sentence{
    public static void main(String[]args){
    String sentence = "The quick brown fox jumps over the lazy dog.";
    int y = sentence.charAt(0);
    System.out.println(y);
    }
}// checks characters

public class Numwords{
    public static void main(String[]args){
    String sentence = "The quick brown fox jumps over the lazy dog.";
    int z = 1;
     for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                z++;
            }
        }
        System.out.println(z);
    }
}

public class Palindrome {
    public static void main(String[] args) {
        String word = "racecar";
        boolean isPalindrome = true;
        
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
In the above code, we first set a boolean variable isPalindrome to true. Then, we use a for loop to compare the characters of the string from both ends until we reach the middle. If any pair of characters don't match, we set isPalindrome to false and break out of the loop. Finally, we check the value of isPalindrome to print the appropriate message.





