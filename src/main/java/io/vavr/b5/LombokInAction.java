package io.vavr.b5;

import java.util.ArrayList;
import java.util.HashMap;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.val;

@EqualsAndHashCode(exclude = {"id", "email"})
public class LombokInAction {

    @Getter
    @Setter
    public Long id;
    @Getter
    @Setter
    public String email;
    @Getter
    @Setter
    public String firstName;
    @Getter
    @Setter
    public String lastName;

    public void modernHasMapCall() {
        val map = new HashMap<>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public String modernMethod() {
        val valList = new ArrayList<>();
        valList.add("Hello, JavaWorld!");
        val foo = valList.get(0);
        return foo.toString();
    }

    public static void main(String args[]) {
        LombokInAction obj = new LombokInAction();
        obj.setFirstName("Armen");
        System.out.println(obj.getFirstName());

        System.out.println(obj.modernMethod());
        obj.modernHasMapCall();

    }

}
