package interviewQuestions8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q01_SetTask {
//  PART 1
// create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
// and add all elements from ArrayList to Set

// ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
// ve tüm öğeleri ArrayList'ten Set'e ekleyin

// PART 2
// create a method that takes Set<Character> and varargs of char as parameters
// and adds all chars to the set

    // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
// ve tüm karakterleri sete ekleyin
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(10);
        arrList.add(12);
        arrList.add(14);
        arrList.add(15);
        arrList.add(12);
        arrList.add(10);
        System.out.println(arrList);
        Set<Integer> vals = new HashSet<Integer>();



    }
}
