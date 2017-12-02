package io.vavr.b4;

import io.vavr.collection.List;



/**
 *
 * @author armdev
 */
public class SeqInAction {

    public String joinStr(String... words) {
        return List.of(words)
                .intersperse("@")
                .fold("#### ", String::concat);
    }

    public static void main(String args[]) {
        SeqInAction action = new SeqInAction();
        String retString = action.joinStr("Armenia", "Yerevan", "Java");
        System.out.println(retString);

        String newValue = List.of("Armenia", "Yerevan", "JSF").mkString(", ");
        System.out.println(newValue);
    }

}
