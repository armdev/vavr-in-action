package io.vavr.a4;

import io.vavr.Lazy;



/**
 *
 * @author armenar
 */
public class LazyInAction {

    public void createLazyMathRandom() {
        Lazy<Double> lazy = Lazy.of(Math::random);
        System.out.println("Lazy created but nor evaluated, because you are not called lazy random yet!!!");

        System.out.println("Check is evaluated ?  " + lazy.isEvaluated());

        if (!lazy.isEvaluated()) {
            double fetchRendomValue = lazy.get();
            System.out.println("So,  Fetch Rendom Value " + fetchRendomValue);
        }
        System.out.println("Now then you fetch random value,check again is lazy evaluated ? :  " + lazy.isEvaluated());
        if (lazy.isEvaluated()) {
            double fetchRendomValue = lazy.get();
            System.out.println("So, Fetch Rendom Value  again, it should be the same:  " + fetchRendomValue);
        }

        double fetchRendomValue = lazy.get();
        System.out.println("Again fetch, it should be the same: " + fetchRendomValue);
        
    }

    public static void main(String args[]) {
        LazyInAction lazy = new LazyInAction();
        lazy.createLazyMathRandom();
    }
}
