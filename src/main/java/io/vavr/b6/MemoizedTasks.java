/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.vavr.b6;

import io.vavr.Function1;
import io.vavr.collection.List;
import io.vavr.collection.Stream;


/**
 *
 * @author armenar
 */
public class MemoizedTasks {

    public static void main(String args[]) {
        MemoizedTasks.checkIfPrimeAWholeLot(9L);

    }

    // Say you just wrote a primitive find-prime-function, like the one in isPrimeFunction()
    // Say it is applied a lot of times with the same argument, it would be a good idea to cache the result
    // this is called Memoization
    // modify this method to speed it up, using the concept of memoization
    public static Long checkIfPrimeAWholeLot(Long l) {

        Function1<Long, Boolean> primeFunction = isPrimeFunction(); //modify only this line
        System.out.println("isPrimeFunction() " + primeFunction.toString());
        Stream.rangeClosed(0, 10).forEach(i -> primeFunction.apply(l));
        System.out.println(l);
        return l;
    }

    // leave this unmodified
    public static Function1<Long, Boolean> isPrimeFunction() {
        return i -> {
            try {
                Thread.sleep(2);
            } catch (InterruptedException ignore) {
            }
            return i % 2 == 1 && List.rangeClosed(2, ((i / 2) + 1)).find(x -> i % x == 0).isEmpty();
        };
    }
}
