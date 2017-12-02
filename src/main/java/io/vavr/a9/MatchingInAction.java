package io.vavr.a9;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;

/**
 *
 * @author armenar
 */
public class MatchingInAction {

    public void matchingCases() {

        int input = 2;

        String output = Match(input).of(
                Case($(1), "one"),
                Case($(2), "two"),
                Case($(3), "three"),
                Case($(), "?"));

        System.out.println(output);

    }

    public static void main(String args[]) {
        MatchingInAction matching = new MatchingInAction();
        matching.matchingCases();
    }
}
