package exceptions;

/**
 *
 * @author Seikicegus
 */
public class MyStringLengthException extends Exception {
    public MyStringLengthException(int current, int expect) {
        super("received = "+current+", expected = "+expect);
    }
}
