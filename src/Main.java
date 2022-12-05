public class Main {
    public static void main(String[] args) {
        System.out.println(Zodiac.LIBRA.getValue());
        System.out.println(Zodiac.GEMINI.getValue());
        System.out.println(Zodiac.CAPRICORNUS.getValue());

        Zodiac zodiac[] = Zodiac.getArr();
        for (Zodiac z: zodiac) {
            System.out.println(z);
        }
    }
}