public class Palindrome {
    public static void main(String[] args) {
        String Str = "1Dad1";
        String Str2= reverse(Str);
        System.out.println(Str  +"   "+   Str2);
        if(Checkpalindrome(Str)){
            System.out.println("Ths is a plindrome");}
        else System.out.println("Ths is not a plindrome");
    }
    public static String reverse(String arr) {
        char[] Array = arr.toCharArray();
        int left = 0, right = Array.length - 1;
        while (left < right) {    // Swap elements
            char temp = Array[left];
            Array[left] = Array[right];
            Array[right] = temp;
            left++;
            right--;
        }
//        System.out.println(Array);
        return new String(Array);
    }
    public static boolean Checkpalindrome(String str){
        String str2=reverse(str);
    return str.equalsIgnoreCase(str2);
    }
}