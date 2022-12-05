public class Zodiac {
    public static final Zodiac ARIES = new Zodiac(0);
    public static final Zodiac TAURUS = new Zodiac(1);
    public static final Zodiac GEMINI = new Zodiac(2);
    public static final Zodiac CANCER = new Zodiac(3);
    public static final Zodiac LEO = new Zodiac(4);
    public static final Zodiac VIRGO = new Zodiac(5);
    public static final Zodiac LIBRA = new Zodiac(6);
    public static final Zodiac SCORPIUS = new Zodiac(7);
    public static final Zodiac SAGITTARIUS = new Zodiac(8);
    public static final Zodiac CAPRICORNUS = new Zodiac(9);
    public static final Zodiac AQUARIUS = new Zodiac(10);
    public static final Zodiac PISCES = new Zodiac(11);
    private static final Zodiac[] Arr = {ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, LIBRA, SCORPIUS, SAGITTARIUS, CAPRICORNUS, AQUARIUS, PISCES};
    private int value;
    public Zodiac(int value) {

        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // values
    public static Zodiac[] getArr() {
        return Arr;
    }

    // ordinal
    public int getValue() {
        return value;
    }

}
