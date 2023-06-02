package generics.exemplo6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args){

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "maria");
        cookies.put("email", "maria@maria.com");
        cookies.put("phone", "11111");

        cookies.remove("email");

        System.out.println(cookies.containsKey("phone"));

        System.out.println("All cookies");

        for (String key : cookies.keySet()){
            System.out.println(key);
        }
    }
}
