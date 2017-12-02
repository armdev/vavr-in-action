package io.vavr.a1;

import io.vavr.control.Try;



/**
 *
 * @author armdev
 */
public class Divide {

    public int divide(int divident, int divisor) {
        return divident / divisor;
    }

    public Try<Integer> divideWithJavaSlang(Integer dividend, Integer divisor) {
        return Try.of(() -> dividend / divisor);
    }

    public static void main(String args[]) {
        Divide obj = new Divide();

        //obj.divide(50, 0);
        Try<Integer> tryToDivide = obj.divideWithJavaSlang(15, 0);

        if (tryToDivide.isSuccess()) {
            System.out.println("Divide is success " + tryToDivide.get());
            Try.success(tryToDivide);
        }
        if (tryToDivide.isFailure()) {
            System.out.println("Divide is fail " + tryToDivide.toString());
            Try.failure(tryToDivide.getCause());
        }

    }

}
