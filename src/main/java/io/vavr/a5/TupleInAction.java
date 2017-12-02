/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.vavr.a5;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.Tuple3;



/**
 *
 * @author armenar
 */
public class TupleInAction {


    public static void main(String args[]) {
        TupleInAction tuple = new TupleInAction();
        tuple.createTuple();
    }
    public void createTuple() {
        
        Tuple2<String, Integer> cities = Tuple.of("Yerevan", 2800);

        String name = cities._1;

        int age = cities._2();

        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);

        Tuple3<String, String, String> appServers = Tuple.of("JBoss", "Glassfish", "Resin");
        System.out.println("AAA : " + appServers.toString());
        System.out.println("AppServer 01 : " + appServers._1);
        System.out.println("AppServer 02 : " + appServers._2);
        System.out.println("AppServer 03 : " + appServers._3);

    }
}
