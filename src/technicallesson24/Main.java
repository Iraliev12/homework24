package technicallesson24;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[20];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
            arrayList.add(i, random.nextInt(2));
            linkedList.add(i, random.nextInt(2));
        }
        System.out.println("array before");
        System.out.println(Arrays.toString(arr));
        System.out.println("\nArraylist before");
        System.out.println(arrayList);
        System.out.println("\n Linkedkist before");
        System.out.println(linkedList);
    }
    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println("array after:");
        System.out.println(Arrays.toString(array));
        sort(array);
    }
    public static void sort(ArrayList<Integer>arrayList) {
        Collections.sort(arrayList);
        System.out.println("array after:");
        System.out.println(arrayList);
        sort(arrayList);
    }
    public static void sort(LinkedList<Integer>linkedList) {
        Collections.sort(linkedList);
        System.out.println("array after:");
        System.out.println(linkedList);
        sort(linkedList);
    }
}