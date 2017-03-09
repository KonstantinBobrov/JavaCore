import java.util.*;

public class Mark {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Вася", 1);
        hashMap.put("Петя", 2);
        hashMap.put("Коля", 3);

        System.out.println(hashMap.get("Петя").intValue());
        hashMap.put("Петя", 5);
        System.out.println(hashMap.get("Петя").intValue());

    }


}


