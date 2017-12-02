package io.vavr.a3;

import io.vavr.control.Option;


/**
 *
 * @author armdev
 */
public class OptionInAction1 {

    public OptionInAction1() {

    }

    public void givenNotNunll() {
        String country = "Armenia";
        Option<String> countryOption = Option.of(country);
        if (!countryOption.isEmpty()) {
            System.out.println("countryOption " + countryOption.get());
        }

        String city = null;
        Option<String> cityOption = Option.of(city);
        if (cityOption.isEmpty()) {
            System.out.println("City null pointer ? " + cityOption.toString());
            System.out.println("You cant call  cityOption.get() , no value , check for none ");
        }

    }

    public static void main(String args[]) {
        OptionInAction1 opt = new OptionInAction1();
        opt.givenNotNunll();
    }
}
