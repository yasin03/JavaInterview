package interviewQuestions4;

import java.util.ArrayList;
import java.util.Arrays;

public class Q05_SpecialCharRemoveArray {
    /*
Problem Tanımı :
getSum isminde bir method oluşturun.
Parametresi ArrayList'tir.
Dizideki tüm $ ları kaldır ve tüm sayıları topla
return yaptğımız veri tipi 'int' olmalıdır.
sonuç 0'dan küçükse, -1 yazdırın.

Örnek1:
ArrayList = $13, $15, $20
Cevap = 48 olmalı

Örnek 2 :
ArrayList= $-13, $0, $0
Cevap = -1 olmalı.
 */
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>(Arrays.asList("$13", "$15", "$20"));
        System.out.println(getSum(array));
    }

    private static int getSum(ArrayList<String> array) {
        int toplam = 0;
        for (String w:array) {
            String str = w.replace("$","");

            toplam += Integer.parseInt(str);

        }
        if (toplam<0) {
            return -1;
        }else {
            return toplam;
        }
    }
}
