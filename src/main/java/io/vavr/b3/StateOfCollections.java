/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.vavr.b3;

import io.vavr.collection.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;




/**
 *
 * @author armenar
 */
public class StateOfCollections {

    public static void main(String args[]) {

        List<String> items
                = Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result
                = items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(result);
        // = ["1", "2", "3"] in Java 8
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        Object obj = integerList.stream().map(Object::toString).collect(Collectors.toList());
        System.out.println("Obj : " + obj);
        
        // = Stream("1", "2", "3") in Javaslang
        Object toStringObj = Stream.of(1, 2, 3).map(Object::toString);
        
        System.out.println("To String Obj: " + toStringObj);
        

    }

}
