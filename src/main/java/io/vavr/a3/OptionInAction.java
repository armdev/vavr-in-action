/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.vavr.a3;

import io.vavr.control.Option;


/**
 *
 * @author armdev
 */
public class OptionInAction {

    private User user = null;

    public OptionInAction() {

    }

    public void checkObjectIfNull() {
        Option<Object> userIsNull = Option.of(user);
        if (userIsNull.isEmpty()) {
            System.out.println("Object user is null so do new User()  " + userIsNull.toString());
            user = new User();
            Option<Object> someOption = Option.of(user.getFirstname());
            System.out.println("Created new user and get value from it  " + someOption.toString());
        }
    }

  

    public static void main(String args[]) {
        OptionInAction opt = new OptionInAction();
        opt.checkObjectIfNull();
    }
}
