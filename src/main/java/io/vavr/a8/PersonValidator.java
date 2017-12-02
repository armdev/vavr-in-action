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
public class PersonValidator {

    String NAME_ERR = "Invalid characters in name: ";
    String AGE_ERR = "Age must be at least 0";

    public Validation<Seq<String>, Person> validatePerson(
            String name, int age) {
        return Validation.combine(validateName(name), validateAge(age)).ap(Person::new);
    }

    private Validation<String, String> validateName(String name) {
        String invalidChars = name.replaceAll("[a-zA-Z ]", "");
        return invalidChars.isEmpty()
                ? Validation.valid(name)
                : Validation.invalid(NAME_ERR + invalidChars);
    }

    private Validation<String, Integer> validateAge(int age) {
        return age < 0 ? Validation.invalid(AGE_ERR)
                : Validation.valid(age);
    }
}
