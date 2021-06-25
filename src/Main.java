import java.util.LinkedList;
import java.util.List;

public class Main extends Methods {
    public static void main(String[] args) {
        Methods myobject = new Methods();
        System.out.println("-------------------Sort numeric and String Arrays -------------------");
        myobject.sortNumericAndStringArrays();
        System.out.println("-------------------Find the common elements in 2 Arrays, using method 1 -------------------");
        myobject.findCommonElementsInArrays_method1();
        System.out.println("-------------------Find the common elements in 2 Arrays, using method 2 -------------------");
        myobject.findCommonElementsInArrays_method2();
        System.out.println("\n-------------------Convert Array to Array List -------------------");
        myobject.convertArrayToArrayList();
        System.out.println("\n-------------------Add and print Array List elements -------------------");
        myobject.addAndPrintArrayListElements();
        System.out.println("\n-------------------Reverse Array List elements -------------------");
        myobject.reverseArrayListElements();
        System.out.println("\n-------------------Remove Array List elements and check if Array List is empty -------------------");
        myobject.removeArrayListElementsandCheckIsEmpty();
        System.out.println("\n------------------Generate random numbers Array and put the elements into a List -------------------");
        myobject.generateNumbersAndPutElementsIntoList();
        System.out.println("\n------------------Enter Integer Grades into an Array -------------------");
        myobject.enterIntegerGradesIntoArray();
        System.out.println("\n------------------Return a collection of them stored in reverse order-------------------");
        myobject.returnInReverseOrder();
        System.out.println("\n------------------Swap Order in Linked List-------------------");
        myobject.swapTwoAdjacentNodes();
        System.out.println("\n------------------Merge sorted Linked Lists-------------------");
        myobject.mergeSortedLinkedLists();
        System.out.println("\n------------------Merge sorted Linked Lists - version 2 - ------------------");
        List<Integer> newList1 = new LinkedList<>();
        newList1.add(1);
        newList1.add(2);
        newList1.add(4);
        List<Integer> newList2 = new LinkedList<>();
        newList2.add(1);
        newList2.add(3);
        newList2.add(4);
        myobject.mergeLists(newList1, newList2);
        System.out.println("\n------------------Print Map-------------------");
        myobject.printMap();
    }
}

