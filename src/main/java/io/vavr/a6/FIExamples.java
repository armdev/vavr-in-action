
package io.vavr.a6;

import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.control.Option;


public class FIExamples {

    public static void main(String[] args) {
        funfun();
    }

    private static void funfun() {
        // sum.apply(1, 3) = 4
        final Function2<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("sum(1, 3) = " + sum.apply(1, 3));

        // add2.apply(1) = 3
        final Function1<Integer, Integer> add2 = sum.curried().apply(2);
        System.out.println("add2(1) = " + add2.apply(1));

        // computes the hash code of an object
        final Function1<Object, Integer> hash = Object::hashCode;
        
          System.out.println("hash = " + hash);

        // computes the hash once, then reads from cache
        final Function1<Object, Option<Integer>> hashCache
                = Function1.lift(Object::hashCode).memoized();

        // ciao type erasure, hi Integer.class!
        final Class<?> returnType = hash.getClass();
        System.out.println("return Type: " + returnType);

    }

   

}
