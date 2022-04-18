package interviewQuestions6;

public class Q05_ExponentialNumber {
    //Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64

    public static void main(String[] args) {
        int base = 4;
        int top =3;
        int result = 1;

        for (int i = 0; i < top; i++) {
            result*=base;
        }
        System.out.println("For ile sonuç : "+result);

        result = 1;
        while (top!=0){
            result*=base;
            top--;
        }
        System.out.println("While ile sonuç : "+result);

    }

}
