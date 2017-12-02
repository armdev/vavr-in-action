package io.vavr.a1;

import io.vavr.control.Try;

/**
 *
 * @author armenar
 */
public class HandleTry {

    public void handleTryInAction() {
        Try<Integer> result = Try.of(() -> 1 / 0);

        if (result.isFailure()) {
            System.out.println("Try is fails " + Try.failure(result.getCause()));
        }
        int computationResult = result.getOrElse(-1);

        System.out.println("Try is fails but return another value " + computationResult);

    }

    public static void main(String args[]) {
        HandleTry handleTry = new HandleTry();
        handleTry.handleTryInAction();

    }
}
