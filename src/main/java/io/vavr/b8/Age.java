package io.vavr.b8;

public class Age {

    Integer age;

    public Age(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Age age1 = (Age) o;

        return age.equals(age1.age);

    }

    @Override
    public int hashCode() {
        return age.hashCode();
    }
}
