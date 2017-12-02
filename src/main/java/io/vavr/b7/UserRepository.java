package io.vavr.b7;



import io.vavr.control.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    public User findOne(String id) {
        return new User(id, new Address("Test"));
    }

    public Optional<User> findOneOptional(String id) {
        return Optional.of(new User(id, new Address("Test")));
    }

    public Option<User> findOneOption(String id) {
        return Option.of(new User(id, new Address("Test")));
    }

    public List<User> findAll() { return Arrays.asList(new User("id", new Address("Test"))); }
}
