package interviewQuestions4;

import java.util.Scanner;

public class Q03_HackerLanguage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = "Java ile herşey çok güzel";
        hackerDili(str);

    }

    private static void hackerDili(String str) {
        String arr[] = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.toLowerCase().substring(i, i + 1);
            System.out.print(arr[i]);
        }
        String yeniStr = "";
        for (String w : arr) {
            if (w.equals("s")) {w = "5";
            } else if (w.equals("a")) {w = "4";
            } else if (w.equals("e")) {w = "3";
            } else if (w.equals("v")) {w = "2";
            } else if (w.equals("i")) {w = "1";
            }else if (w.equals("o")) {w = "0";
            }
            yeniStr += w;
        }
        System.out.println("\n"+yeniStr);
    }
}
