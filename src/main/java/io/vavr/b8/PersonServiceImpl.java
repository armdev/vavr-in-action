package io.vavr.b8;

import io.vavr.control.Either;
import io.vavr.control.Option;
import java.util.Random;


public class PersonServiceImpl {

    /*
     * This method returns
     * - a Left<String> on failure
     * - a Right containing an empty Option when successful service invocation, but with no person found for that personId
     * - a Right Option<Person> (present) on successful and existing personId
     */
    public Either<String, Option<Person>> getPerson(Long personId) {
        if(personId < 0L) {
            return Either.left("Invalid personId");
        } else if (personId < 101L) {
            return Either.right(Option.of(new Person("John Doe " + new Random().nextInt())));
        } else {
            return Either.right(Option.none());
        }
    }

    public String getAddress(Person person) {
        return "Osloveien 1, 0150 OSLO";
    }

}
