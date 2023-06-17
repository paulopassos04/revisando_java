package generics.exemplo7;

import java.util.Map;
import java.util.TreeMap;

public class App {
     public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Paulo");
        cookies.put("email", "paulo@paulo.com");
        cookies.put("phone", "123456");

        //cookies.remove("email");
        cookies.put("phone", "0987654");

        System.out.println("Contains 'phone' key: " +cookies.containsKey("phone"));

        System.out.println("All cookies: ");
        for(String key : cookies.keySet()){
            System.out.println(key + ": " +cookies.get(key));
        }
        
    }
}
