package io.vavr.b7;

public class IbanChecker {
    public static String check(String iban) {
        if (validationMagic(iban)) {
            return iban;
        }

        throw new IllegalArgumentException("Invalid IBAN");
    }

    private static boolean validationMagic(String iban) {
        return iban.startsWith("NL12");
    }
}
