import java.util.HashMap;
import java.util.Map;

public class OccurrencesCharacter {
    public static void main(String[] args) {
        String str = "hello world";
        method1(str);
        Method2(str);
        method3(str);
    }

    public static void method1(String str){
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character occurrences: " + frequencyMap);
    }
    public static void Method2(String str) {
        char target = 'o';
        long count = str.chars().filter(ch -> ch == target).count();
        for (int i = 0; i < charArr.length; i++) {  // Initialization, Condition, Increment
            System.out.println(charArray[i]);
        System.out.println("Occurrences of '" + target + "': " + count);
    }
    public static void method3(String str){
        char target = 'o';
        int count = str.length() - str.replace(String.valueOf(target), "").length();
        System.out.println("Occurrences of '" + target + "': " + count);
    }

}