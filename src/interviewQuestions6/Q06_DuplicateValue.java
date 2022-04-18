package interviewQuestions6;


import java.util.ArrayList;
import java.util.List;

public class Q06_DuplicateValue {
    /*
     Write a code that returns the duplicate chars in a String array.
     (interview Question)
     Input :
     String str=“Javaisalsoeasy”
     Output: [a, s]
      */
    public static void main(String[] args) {

        String str = "Javaisalsoeasy";
        char arr[] = str.toCharArray();
        List<Character> chars = new ArrayList<Character>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] ==arr[j] && !chars.contains(arr[j])) {
                    chars.add(arr[i]);
                }
            }
        }
        System.out.println(chars);
    }
}

