package io.vavr.b7;

public class OptionJavaslang {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

//        String street = userRepository.findOneOption("id")
//                .flatMap(User::getAddressOption)
//                .map(Address::getStreet)
//                .getOrElse("");

       // System.out.println(street);
    }
}
