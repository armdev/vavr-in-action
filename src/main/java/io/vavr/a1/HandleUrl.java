/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.vavr.a1;

import io.vavr.control.Try;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Admin
 */
public class HandleUrl {

    Try<String> getContent(String location) {
        return Try
                .of(() -> new URL(location))
                .filter(url -> "http".equals(url.getProtocol()))
                .flatMap(url -> Try.of(url::openConnection))
                .flatMap(con -> Try.of(con::getInputStream))
                .map(this::readAndClose);
    }

    public String readAndClose(InputStream stream) {

        try {
            stream.read();
            stream.close();
        } catch (IOException ex) {
            Logger.getLogger(Divide.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Google search is too power";
    }

    public static void main(String[] args) {
        HandleUrl obj = new HandleUrl();
        Try<String> str = obj.getContent("http://google.ru");
        
        if (str.isSuccess()) {
            System.out.println("content is  " + str.get());
            Try.success(str);
        }

        if (str.isFailure()) {
            System.out.println("contente is fail " + str.toString());
            Try.failure(str.getCause());
        }
    }
}
