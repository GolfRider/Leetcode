package com.stevesun.solutions;

/**Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

 Example:
 Given a = 1 and b = 2, return 3.*/
public class SumofTwoIntegers {
//This post is very helpful: http://stackoverflow.com/questions/9070937/adding-two-numbers-without-operator-clarification
    public int getSum(int a, int b) {
        if(b == 0) return a;
        int sum = a^b;
        int carry = (a&b) << 1;
        return getSum(sum, carry);
    }

}
