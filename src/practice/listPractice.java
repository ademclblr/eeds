package practice;
import java.util.*;
public class listPractice {
    public static void main(String[] args) {
       // common list methods / on top methods from collection interface
       List<Double> lst=new LinkedList<>(Arrays.asList(3d,4d,27d,66d,3d,3d,44d));
        System.out.println(lst);
        //accessing items using index
        System.out.println("first item lst.get(0) = " + lst.get(0));
        // adding items in certain index
        lst.add(1,5d);// burda ise 1. indexse 5 ekliyoruz
        System.out.println(lst); // 3d,5d,4d,27d,66d,3d,3d,44d
        //updating items in certain index
        lst.set(0, 99.0); //burda ilk item ile 99 yer degsitiriyor
        System.out.println(lst);//99d,4d,27d,66d,3d,3d,44d
        // getting indexes of certain items 
        System.out.println("lst.indexOf(4.0) = " + lst.indexOf(4.0)); //2
        System.out.println("lst.indexOf(4.0) = " + lst.indexOf(3.0));//5
        System.out.println("lst.lastIndexOf(4.0) = " + lst.lastIndexOf(3.0));//6
        // remove (object)
        //remove(index)
        lst.remove(1);
        System.out.println("lst = " + lst);//[99.0, 4.0, 27.0, 66.0, 3.0, 3.0, 44.0]
        lst.addAll(2, Arrays.asList(99d,89d));
        System.out.println("lst = " + lst);//[99.0, 4.0, 99.0, 89.0, 27.0, 66.0, 3.0, 3.0, 44.0]
        // replaceAll (function)
        System.out.println("replace each item with new value increased by 5 : ");
        lst.replaceAll(each ->each+5); //lamnda function we use hear short way
        System.out.println(lst);//[104.0, 9.0, 104.0, 94.0, 32.0, 71.0, 8.0, 8.0, 49.0]
        // sort
        lst.sort(null);
        System.out.println(lst); //[8.0, 8.0, 9.0, 32.0, 49.0, 71.0, 94.0, 104.0, 104.0]

    }

}
