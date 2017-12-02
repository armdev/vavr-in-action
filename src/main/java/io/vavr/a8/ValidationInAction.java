/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.vavr.a8;

import io.vavr.collection.List;
import io.vavr.collection.Seq;
import io.vavr.control.Validation;



/**
 *
 * @author armenar
 */
public class ValidationInAction {

    public void validatePerson() {
        PersonValidator personValidator = new PersonValidator();

        Validation<Seq<String>, Person> valid
                = personValidator.validatePerson("John Doe", 30);

        if (valid.isInvalid()) {
            System.out.println("Person John is invalid ");
        }

        Validation<Seq<String>, Person> invalid
                = personValidator.validatePerson("Carlos? Doe!4", -1);

        if (invalid.isInvalid()) {
            System.out.println("Person Carlos is invalid ");
        }
//
//        assertEquals(
//                "Valid(Person [name=John Doe, age=30])",
//                valid.toString());
//
//        assertEquals(
//        "Invalid(List(Invalid characters in name: ?!4, 
//        Age must be at least 0))", 
//          invalid.toString()

    }

    public static void main(String args[]) {
        ValidationInAction action = new ValidationInAction();
        action.validatePerson();
    }

}
