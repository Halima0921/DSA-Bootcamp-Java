//To find out whether the given String is Palindrome or not.

public class Palindrome {
    public static void main(String[] args) {
        String str = "new", reverseStr = "";// here write any string word that you want to see
        int strLength = str.length();
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }

    }

}
