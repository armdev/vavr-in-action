package io.vavr.b7;

import io.vavr.control.Try;




public class StreamJavaslang {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        userRepository.findAll().stream()
                .filter(user ->
                        Try.of(user::validate)
                                .getOrElse(false));
    }
}
