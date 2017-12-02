package io.vavr.b7;



import io.vavr.control.Option;
import java.util.Optional;

public class User {
    private String id;
    private Address address;

    public User(String id, Address address) {
        this.id = id;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public Optional<Address> getAddressOptional() {
        return Optional.ofNullable(address);
    }

    public Option<Address> getAddressOption() {
        return Option.of(address);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean validate() throws Exception {
        return true;
    }
}
