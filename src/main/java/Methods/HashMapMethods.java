package Methods;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        method1();  // size()
        method2();  // isEmpty()
        method3();  // containsKey(Object key)
        method4();  // containsValue(Object value)
        method5();  // get(Object key)
        method6();  // put(K key, V value)
        method7();  // remove(Object key)
        method8();  // putAll(Map<? extends K,? extends V> m)
        method9();  // clear()
        method10(); // keySet()
        method11(); // values()
        method12(); // entrySet()
        method13(); // getOrDefault(Object key, V defaultValue)
        method14(); // replace(K key, V value)
        method15(); // replace(K key, V oldValue, V newValue)
        method16(); // forEach(BiConsumer<? super K,? super V> action)
        method17(); // compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
        method18(); // computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
        method19(); // computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
        method20(); // merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
    }

    public static void method1() {
        int size = map.size();
        System.out.println(size); // Expected output: 4
    }

    public static void method2() {
        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty); // Expected output: false
    }

    public static void method3() {
        boolean containsKey = map.containsKey("a");
        System.out.println(containsKey); // Expected output: true
    }

    public static void method4() {
        boolean containsValue = map.containsValue(2);
        System.out.println(containsValue); // Expected output: true
    }

    public static void method5() {
        int value = map.get("c");
        System.out.println(value); // Expected output: 3
    }

    public static void method6() {
        map.put("e", 5);
        System.out.println(map); // Expected output: {a=1, b=2, c=3, d=4, e=5}
    }

    public static void method7() {
        map.remove("d");
        System.out.println(map); // Expected output: {a=1, b=2, c=3, e=5}
    }

    public static void method8() {
        HashMap<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("f", 6);
        anotherMap.put("g", 7);
        map.putAll(anotherMap);
        System.out.println(map); // Expected output: {a=1, b=2, c=3, e=5, f=6, g=7}
    }

    public static void method9() {
        map.clear();
        System.out.println(map); // Expected output: {}
    }

    public static void method10() {
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println(map.keySet()); // Expected output: [a, b, c, d]
    }

    public static void method11() {
        System.out.println(map.values()); // Expected output: [1, 2, 3, 4]
    }

    public static void method12() {
        System.out.println(map.entrySet()); // Expected output: [a=1, b=2, c=3, d=4]
    }

    public static void method13() {
        int value = map.getOrDefault("e", 0);
        System.out.println(value); // Expected output: 0
    }

    public static void method14() {
        map.replace("a", 10);
        System.out.println(map); // Expected output: {a=10, b=2, c=3, d=4}
    }

    public static void method15() {
        boolean replaced = map.replace("b", 2, 20);
        System.out.println(replaced); // Expected output: true
        System.out.println(map); // Expected output: {a=10, b=20, c=3, d=4}
    }

    public static void method16() {
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        // Expected output:
        // a: 10
        // b: 20
        // c: 3
        // d: 4
    }

    public static void method17() {
        map.compute("a", (k, v) -> (v == null) ? 1 : v + 1);
        System.out.println(map); // Expected output: {a=11, b=20, c=3, d=4}
    }

    public static void method18() {
        map.computeIfAbsent("e", k -> 5);
        System.out.println(map); // Expected output: {a=11, b=20, c=3, d=4, e=5}
    }

    public static void method19() {
        map.computeIfPresent("b", (k, v) -> v + 10);
        System.out.println(map); // Expected output: {a=11, b=30, c=3, d=4, e=5}
    }

    public static void method20() {
        map.merge("c", 10, (oldValue, newValue) -> oldValue + newValue);
        System.out.println(map); // Expected output: {a=11, b=30, c=13, d=4, e=5}
    }
}
