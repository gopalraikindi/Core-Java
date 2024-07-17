package Methods;


import java.util.ArrayList;

public class ArrayListMethods {
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        // Add elements to the list
        list.add("gopal");
        list.add("john");
        list.add("doe");
        list.add("alice");
        list.add("bob");

        method1();  // add(E e)
        method2();  // add(int index, E element)
        method3();  // get(int index)
        method4();  // set(int index, E element)
        method5();  // remove(int index)
        method6();  // remove(Object o)
        method7();  // size()
        method8();  // contains(Object o)
        method9();  // indexOf(Object o)
        method10(); // lastIndexOf(Object o)
        method11(); // clear()
        method12(); // isEmpty()
        method13(); // addAll(Collection<? extends E> c)
        method14(); // addAll(int index, Collection<? extends E> c)
        method15(); // subList(int fromIndex, int toIndex)
        method16(); // toArray()
    }

    public static void method1() {
        list.add("eve");
        System.out.println(list); // Expected output: [gopal, john, doe, alice, bob, eve]
    }

    public static void method2() {
        list.add(1, "jack");
        System.out.println(list); // Expected output: [gopal, jack, john, doe, alice, bob, eve]
    }

    public static void method3() {
        String element = list.get(2);
        System.out.println(element); // Expected output: "john"
    }

    public static void method4() {
        list.set(2, "jane");
        System.out.println(list); // Expected output: [gopal, jack, jane, doe, alice, bob, eve]
    }

    public static void method5() {
        String removedElement = list.remove(2);
        System.out.println(removedElement); // Expected output: "jane"
        System.out.println(list); // Expected output: [gopal, jack, doe, alice, bob, eve]
    }

    public static void method6() {
        boolean isRemoved = list.remove("alice");
        System.out.println(isRemoved); // Expected output: true
        System.out.println(list); // Expected output: [gopal, jack, doe, bob, eve]
    }

    public static void method7() {
        int size = list.size();
        System.out.println(size); // Expected output: 5
    }

    public static void method8() {
        boolean contains = list.contains("bob");
        System.out.println(contains); // Expected output: true
    }

    public static void method9() {
        int indexOf = list.indexOf("jack");
        System.out.println(indexOf); // Expected output: 1
    }

    public static void method10() {
        list.add("doe");
        int lastIndexOf = list.lastIndexOf("doe");
        System.out.println(lastIndexOf); // Expected output: 5
    }

    public static void method11() {
        list.clear();
        System.out.println(list); // Expected output: []
    }

    public static void method12() {
        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty); // Expected output: true
    }

    public static void method13() {
        ArrayList<String> newList = new ArrayList<>();
        newList.add("alpha");
        newList.add("beta");
        list.addAll(newList);
        System.out.println(list); // Expected output: [alpha, beta]
    }

    public static void method14() {
        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("gamma");
        anotherList.add("delta");
        list.addAll(1, anotherList);
        System.out.println(list); // Expected output: [alpha, gamma, delta, beta]
    }

    public static void method15() {
        ArrayList<String> subList = new ArrayList<>(list.subList(1, 3));
        System.out.println(subList); // Expected output: [gamma, delta]
    }

    public static void method16() {
        Object[] array = list.toArray();
        for (Object element : array) {
            System.out.println(element); // Expected output: alpha, gamma, delta, beta (each on new line)
        }
    }
}
