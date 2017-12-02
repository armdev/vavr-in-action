package io.vavr.a6;

import io.vavr.Function0;
import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.Function3;
import io.vavr.Function5;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * @author armenar
 */
public class FunctionalInterfaces {

    public void fiStandard() {
        //single parameter
        Function<Integer, Integer> square = (num) -> num * num;
        int result = square.apply(2);

        System.out.println(" Result 1  is: " + result);
        // two parameters
        BiFunction<Integer, Integer, Integer> sum
                = (num1, num2) -> num1 + num2;
        int result2 = sum.apply(5, 7);
        System.out.println(" Result 2 is: " + result2);

    }

    public void fiSlangStandard() {
        //single parameter
        Function1<Integer, Integer> square = (num) -> num * num;
        int result = square.apply(2);

        System.out.println("Java Slang Result 1  is: " + result);

        // two parameters
        Function2<Integer, Integer, Integer> sum
                = (num1, num2) -> num1 + num2;

        int result2 = sum.apply(5, 7);

        System.out.println(" Java Slang Result 2 is: " + result2);

        // 3 parameters
        Function3<Integer, Integer, Integer, Integer> sum1
                = (num1, num2, num3) -> num1 + num2 + num3;

        int result3 = sum1.apply(5, 7, 8);

        System.out.println(" Java Slang Result 3 is: " + result3);

        // no parameter
        Function0<String> getClazzName = () -> this.getClass().getName();
        String clazzName = getClazzName.apply();

        System.out.println(" Java Slang Result 4 no params:  " + clazzName);

        Function5<String, String, String, String, String, String> concat
                = (a, b, c, d, e) -> a + b + c + d + e;
        String finalString = concat.apply(
                "Aloha ", "JavaWorld", "! ", "Learn ", "Javaslang");

        System.out.println(" Java Slang Result 5 parameters:  " + finalString);

        Function2<Integer, Integer, Integer> summm = Function2.of(this::calculateOrDivideOrElse);
        int summed = summm.apply(5, 6);

        System.out.println(" Java Slang Result using methos  " + summed);

    }

    public int calculateOrDivideOrElse(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        FunctionalInterfaces java8 = new FunctionalInterfaces();
        java8.fiStandard();

        java8.fiSlangStandard();
    }
}
