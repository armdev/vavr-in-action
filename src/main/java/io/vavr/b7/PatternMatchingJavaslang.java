package io.vavr.b7;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;
import static io.vavr.API.None;
import static io.vavr.API.Some;
import io.vavr.control.Option;



public class PatternMatchingJavaslang {

    public static void main(String[] args) {
        int i = 1;

        String value = Match(i).of(
                Case($(1), "one"),
                Case($(2), "two"),
                Case($(), "other")
        );

        System.out.println(value);

        UserRepository userRepository = new UserRepository();
        Option<User> userOption = userRepository.findOneOption("id");
//
//        String value2 = Match(userOption).of(
//                Case(Some($()), "defined"),
//                Case(None(), "empty")
//        );

      //  System.out.println(value2);
    }


}
