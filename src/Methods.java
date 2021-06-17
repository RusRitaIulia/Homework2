import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.*;

import static java.util.Collections.*;

public class Methods {
    public void sortNumericAndStringArrays() {
        int[] numericArray = {1, 10, 23, 5, 1695, 83, 2, 6, 4};
        String[] stringArray = {"Ana", "Henry", "Charles", "Elizabeth", "Albert", "David", "Onika", "Tania"};
        System.out.println("Original numeric array : " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array : " + Arrays.toString(numericArray));
        System.out.println("Original string array : " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted string array : " + Arrays.toString(stringArray));
    }

    public void findCommonElementsInArrays_method1() {
        String[] stringArray1 = {"Ana", "Henry", "Charles", "Elizabeth", "Albert", "David", "Onika", "Tania"};
        String[] stringArray2 = {"Mara", "Albert", "Tania", "Eli", "Maximum", "John", "Ana"};
        int i, j;
        System.out.println("First String array is : " + Arrays.toString(stringArray1));
        System.out.println("Second String array is : " + Arrays.toString(stringArray2));
        System.out.print("The common elements between the 2 arrays are : ");
        for (i = 0; i < stringArray1.length; i++) {
            for (j = 0; j < stringArray2.length; j++)
                if (stringArray1[i] == stringArray2[j])
                    System.out.print(stringArray1[i] + " ");
        }
        System.out.println();
    }

    public void findCommonElementsInArrays_method2() {
        String[] stringArray1 = {"mere", "pere", "kiwi", "ananas", "cocos", "mango"};
        String[] stringArray2 = {"mango", "banane", "cirese", "capsuni", "mere", "kiwi"};
        int i, j;
        System.out.println("First String array is : " + Arrays.toString(stringArray1));
        System.out.println("Second String array is : " + Arrays.toString(stringArray2));
        System.out.print("The common elements between the 2 arrays are : ");
        Set<String> set = new HashSet<>();
        for (i = 0; i < stringArray1.length; i++) {
            for (j = 0; j < stringArray2.length; j++)
                if (stringArray1[i] == stringArray2[j])
                    set.add(stringArray1[i]);
        }
        for (String k : set) {
            System.out.print(k + " ");
        }
    }

    public void convertArrayToArrayList() {
        String[] array = new String[]{"Eminescu", "Alecsandri", "Ion Creanga", "Bacovia", "Arghezi", "Eliade"};
        ArrayList<String> mylist = new ArrayList<>(Arrays.asList(array));
        System.out.println("The Array List is: " + mylist + " ");
    }

    public void addAndPrintArrayListElements() {
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("Galaxia Andromeda");
        mylist.add("Calea Lactee");
        mylist.add("Marele Nor al lui Magellan");
        mylist.add("Galaxia Triunghiului ");
        mylist.add("Centaurus A");
        mylist.add("Micul Nor al lui Magellan ");
        System.out.println("The Array List  elements are: " + mylist + " ");
    }

    public void reverseArrayListElements() {
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("do");
        mylist.add("re");
        mylist.add("mi");
        mylist.add("fa");
        mylist.add("sol");
        mylist.add("la");
        mylist.add("si");
        mylist.add("DO");
        reverse(mylist);
        System.out.println("The reversed Array List  elements are: " + mylist + " ");
    }

    public void removeArrayListElementsandCheckIsEmpty() {
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("lala");
        mylist.add("meme");
        mylist.add("mimi");
        mylist.add("fafa");
        mylist.add("sisi");
        System.out.println("The Array List  elements are: " + mylist + " ");
        mylist.clear();
        System.out.println("The Array List elements are:" + mylist.size());
        System.out.println("The Array list is empty: " + mylist.isEmpty());
    }

    public void generateNumbersAndPutElementsIntoList() {
        int[] myarray = new int[10];
        int i, min = 1, max = 100;
        List<Integer> myList = new ArrayList<>();
        for (i = 0; i < myarray.length; i++) {
            myarray[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
            if (myarray[i] >= 10) {
                myList.add(myarray[i]);
            }
        }
        System.out.println("The Current Array elements are: ");
        for (i = 0; i < myarray.length; i++) {
            System.out.print(myarray[i] + " ");
        }
        System.out.println("\nThe elements of the List are:" + myList);
    }

    public double calculateAverage(int grades[], int max) {
        int sum = 0;
        double average = 0.0;
        for (int i = 1; i < max; i++) {
            sum += grades[i];
            average = sum / (i);
        }
        return average;
    }

    public void enterIntegerGradesIntoArray() {
        Scanner input = new Scanner(System.in);
        int i, grades[];
        grades = new int[20];
        for (i = 0; i < 20; i++) {
            System.out.println("Enter Grade: ");
            grades[i] = input.nextInt();
            if (grades[i] == -1) break;
        }
        System.out.printf("%.2f", calculateAverage(grades, i - 1));
    }

    public void returnInReverseOrder() {
        ArrayList<Integer> myarray = new ArrayList<Integer>();
        myarray.add(95);
        myarray.add(256);
        myarray.add(3);
        myarray.add(456);
        myarray.add(1);
        System.out.println("Elements before reversing: " + myarray + " ");
        reverse(myarray);
        System.out.println("\nElements after reversing: " + myarray + " ");
    }

    public void swapTwoAdjacentNodes() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Initial LinkedList " + list);
        swap(list, 0, 1);
        swap(list, 2, 3);
        System.out.println("After swap: " + list);
    }

    public void mergeSortedLinkedLists() {
        LinkedList<String> mylinkedlist1 = new LinkedList<String>();
        mylinkedlist1.add("1");
        mylinkedlist1.add("2");
        mylinkedlist1.add("4");
        Iterator i1 = mylinkedlist1.iterator();
        System.out.println("Linked list 1: ");
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        LinkedList<String> mylinkedlist2 = new LinkedList<String>();
        mylinkedlist2.add("1");
        mylinkedlist2.add("3");
        mylinkedlist2.add("4");
        Iterator j = mylinkedlist2.iterator();
        System.out.println("Linked list 2: ");
        while (j.hasNext()) {
            System.out.println(j.next());
        }
        String[] list_array = mylinkedlist1.toArray(new String[mylinkedlist1.size()]);
        String[] list_array2 = mylinkedlist2.toArray(new String[mylinkedlist2.size()]);
        int firstArraylength = list_array.length;
        int secondArraylength = list_array2.length;
        String[] result = new String[firstArraylength + secondArraylength];
        System.arraycopy(list_array, 0, result, 0, firstArraylength);
        System.arraycopy(list_array2, 0, result, firstArraylength, secondArraylength);
        Arrays.sort(result);
        System.out.println("Array obtained from linked List:" + Arrays.toString(result));
    }

    public void printMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a1234", "Adrian");
        map.put("b4321", "Vlad");
        map.put("c3241", "Mihai");
        map.put("d1432", "Calin");
        map.put("e2431", "Iulian");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        if (map.containsValue("Alexandro")) {
            System.out.println("ID + Value exist!");
        } else {
            System.out.println("it doesn't exist!");
        }
    }
}
