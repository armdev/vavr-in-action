package io.vavr.a1;

import io.vavr.control.Try;
import java.util.Arrays;


/**
 *
 * @author armdev
 */
//https://ihommani.github.io/Javaslang.html
///http://www.baeldung.com/javaslang
// http://www.baeldung.com/javaslang-try
public class ArrayIndexOutOfBound {

    char[] matrix = new char[]{'A', 'R', 'M', 'E', 'N', 'I', 'A'};

    public char[] printArray() {
        for (int i = 0; i <= matrix.length; ++i) {
            System.out.println(matrix[i]);
        }
        return matrix;
    }

    public Try<char[]> printArrayWithJavaSlang() {
        return Try.of(() -> printArray());
    }

    public static void main(String args[]) {
        ArrayIndexOutOfBound bound = new ArrayIndexOutOfBound();
        //bound.printArray();
        Try<char[]> myArray = bound.printArrayWithJavaSlang();
        if (myArray.isSuccess()) {
            System.out.println("myArray is success: " + Arrays.toString(myArray.get()));
            Try.success(myArray);
        }
        if (myArray.isFailure()) {
            System.out.println("myArray is fail : " + myArray.toString());
            Try.failure(myArray.getCause());
        }
    }
}
