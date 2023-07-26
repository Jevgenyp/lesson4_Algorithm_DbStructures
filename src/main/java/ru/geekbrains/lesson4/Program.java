package ru.geekbrains.lesson4;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("+79005551122", "Александр");
        hashMap.put("+79005551123", "Сергей");
        hashMap.put("+79005551124", "Александр1");
        hashMap.put("+79005551125", "Александр2");
        hashMap.put("+79005551126", "Александр3");
        hashMap.put("+79005551127", "Александр4");
        hashMap.put("+79005551128", "Александр5");

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}

