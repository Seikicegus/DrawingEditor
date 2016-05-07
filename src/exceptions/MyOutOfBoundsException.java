package exceptions;

/**
 *
 * @author Seikicegus
 */
public class MyOutOfBoundsException extends Exception {
    public MyOutOfBoundsException(int current, Integer lmin, Integer lmax,
            boolean minIncludes, boolean maxIncludes) {
        super(MyOutOfBoundsException.message(current, lmin, lmax, minIncludes, maxIncludes));
    }
    
    public MyOutOfBoundsException(int current, Integer lmin, Integer lmax) {
        super(MyOutOfBoundsException.message(current, lmin, lmax, true, true));
    }
    
    public MyOutOfBoundsException(int current, Integer limite,
            boolean isMin, boolean limiteIncludes) {
        super(MyOutOfBoundsException.message(current, isMin ? limite : null,
                (!isMin) ? limite : null, limiteIncludes, limiteIncludes));
    }
    
    public MyOutOfBoundsException(int current, Integer limite, boolean isMin) {
        super(MyOutOfBoundsException.message(current, isMin ? limite : null,
                (!isMin) ? limite : null, true, true));
    }
    
    private static String message (int current, Integer lmin, Integer lmax,
            boolean minIncludes, boolean maxIncludes) {
        String first;
        String last;
        if (lmin == null) {
            first = "]~";
        } else {
            if (minIncludes) {
                first = "["+lmin;
            } else {
                first = "]"+lmin;
            }
        }
        if (lmax == null) {
            last = "~[";
        } else {
            if (maxIncludes) {
                last = lmax+"]";
            } else {
                last = lmax+"[";
            }
        }
        return "received = "+current+", expected = " + first + ":" + last;
    }
}
