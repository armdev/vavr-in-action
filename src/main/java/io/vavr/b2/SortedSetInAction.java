package io.vavr.b2;

import io.vavr.collection.SortedSet;
import io.vavr.collection.TreeSet;
import java.util.Comparator;


/**
 *
 * @author armenar
 */
public class SortedSetInAction {

    public static void main(String args[]) {
        SortedSet<Integer> xs = TreeSet.of(6, 1, 3, 2, 4, 0, 601, 7, 8);
        // = TreeSet(1, 2, 3);
        SortedSet<Integer> set = TreeSet.of(2, 3, 1, 2);
        System.out.println("Sorted : " + xs.toArray());
        // = TreeSet(3, 2, 1);
        Comparator<Integer> c = (a, b) -> b - a;
        SortedSet<Integer> reversed = TreeSet.of(c, 2, 3, 1, 2);
        System.out.println("Reversed : " + reversed.toArray());
        
        SortedSet<Integer> ys = xs.add(5);
        
        System.out.println("Added 5 : Sorted and New : " + ys.toArray());
    }
}
