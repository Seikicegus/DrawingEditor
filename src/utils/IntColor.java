package utils;

import exceptions.MyOutOfBoundsException;
import exceptions.MyStringLengthException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Seikicegus
 */
public enum IntColor {
    
    // <editor-fold desc="COLOR ENUM">
    Transparent ("00000000"),
    
    Black       ("ff000000"),
    White       ("ffffffff"),
    
    Gray        ("ff7f7f7f"), // GRAY_50
    DarkGray    ("FF404040"), // GRAY_75
    LightGray   ("FFBFBFBF"), // GRAY_25
    
    GRAY_90     ("FF191919"),
    GRAY_80     ("FF333333"),
    GRAY_70     ("FF4C4C4C"),
    GRAY_60     ("FF666666"),
    GRAY_50     ("FF7F7F7F"),
    GRAY_40     ("FF999999"),
    GRAY_30     ("FFB2B2B2"),
    GRAY_20     ("FFCCCCCC"),
    GRAY_10     ("FFE5E5E5"),
    
    Red         ("ffff0000"),
    Green       ("ff00ff00"),
    Blue        ("ff0000ff"),
    
    Cyan        ("ff00ffff"),
    Magenta     ("ffff00ff"),
    Yellow      ("ffffff00"),
    
    Orange      ("ffff7f00");
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="COLOR ARRAY">
    // <editor-fold defaultstate="collapsed" desc="Gray11">
    public static IntColor[] Gray11 = new IntColor[]
    {
        Black,
        GRAY_90,
        GRAY_80,
        GRAY_70,
        GRAY_60,
        GRAY_50,
        GRAY_40,
        GRAY_30,
        GRAY_20,
        GRAY_10,
        White
    };
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Gray5">
    public static IntColor[] Gray5 = new IntColor[]
    {
        Black,
        DarkGray,
        Gray,
        LightGray,
        White
    };
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="AdditivePrimary">
    public static IntColor[] AdditivePrimary = new IntColor[]
    {
        Red,
        Green,
        Blue
    };
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="SubtractivePrimary">
    public static IntColor[] SubtractivePrimary = new IntColor[]
    {
        Cyan,
        Magenta,
        Yellow
    };
    // </editor-fold>
    // </editor-fold>
    
    // <editor-fold desc="BODY">
    
    // <editor-fold defaultstate="collapsed" desc="PARAMETERS">
    private int v_ARGB_Integer;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="CONSTRUCTORS">
    IntColor (String hexa) {
        try {
            this.v_ARGB_Integer = ARGB(hexa);
        } catch (MyStringLengthException ex) {
            Logger.getLogger(IntColor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="GETTEURS">
    public int getARGB() {
        return v_ARGB_Integer;
    }
    // </editor-fold>
    
    // </editor-fold>
    
    public static int ARGB (String hexa) throws MyStringLengthException {
        if (hexa.length() == 8) {
            return (int) Long.parseLong(hexa, 16);
        }
        throw new MyStringLengthException(hexa.length(), 8);
    }
    
    public static String ARGB (int code) {
        String result = Long.toHexString(code);
        result =  result.substring(result.length()-8, result.length());
        return result;
    }
    
    public static int RGB (String hexa) throws MyStringLengthException {
        if (hexa.length() == 6) {
            return (int) Long.parseLong("ff" + hexa, 16);
        }
        throw new MyStringLengthException(hexa.length(), 6);
    }
}
