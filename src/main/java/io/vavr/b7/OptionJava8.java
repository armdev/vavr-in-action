package io.vavr.b7;



import java.util.Optional;

public class OptionJava8 {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        Optional<User> userOptional = userRepository.findOneOptional("id");
        if(userOptional.isPresent()) {
            userOptional.get();
        }

        String street = userOptional.flatMap(User::getAddressOptional)
                .map(Address::getStreet)
                .orElseGet(() -> "");

        System.out.println(street);
    }
}
