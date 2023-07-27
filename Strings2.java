import java.util.HashMap;
import java.util.Map;

/**
 * Strings2
 */
public class Strings2 {

    public static void printDup(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        char c = ' ';
        for(int i=0;i<str.length();i++){
            c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        //printing all the value
        for(Map.Entry mapEntry : map.entrySet()){
            char key = (char)mapEntry.getKey();
            int val = (int)mapEntry.getValue();

            System.out.println("Key: " + key + " " + "Value: " + val);
        }

    }
    public static void main(String[] args) {
        //Print all the duplicates in the input string
        String str = "geeksforgeeks";
        printDup(str);
    }
}