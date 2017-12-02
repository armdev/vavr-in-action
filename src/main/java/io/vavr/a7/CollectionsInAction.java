/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.vavr.a7;

import io.vavr.collection.List;





/**
 *
 * @author armenar
 */
public class CollectionsInAction {

    public void playWithCollections() {
        List<Integer> intList = List.of(1, 2, 3);
        System.out.println(intList.length());
        System.out.println(intList.get(0));
        List<Integer> newList = intList.append(4);
        System.out.println(intList.length());
        //System.out.println(intList.get(3));
        System.out.println(newList.length());
        
       

        int sum = List.of(1, 2, 3).sum().intValue();

        System.out.println(sum);
        
        List<Integer> newIntList = intList.tail().prepend(1);
        System.out.println("length " + newIntList.length());

    }

    public static void main(String args[]) {
        CollectionsInAction collections = new CollectionsInAction();
        collections.playWithCollections();
    }
}
