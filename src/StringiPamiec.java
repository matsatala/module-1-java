public class StringiPamiec {
    public static void main(String[] args) {
        String s1 = "kot";
        String s2 = s1;
        s2 = s2 + "ek";
        System.out.println(s1);   // wynikiem jest kot String niemutowalny
        System.out.println(s2);   // wynikiem jest kotek utworzony nowy string
        // w string pool dodatkowo "ek"


        String imie = "ala";
        imie.toUpperCase(); // nie zapisane do zmiennej przepada
        System.out.println(imie); // wynik z malych liter

        String a = "kot";
        String b = "kot";
        String c = new String("kot");

        System.out.println(a == b);       // true ten sam obiekt
        System.out.println(a == c);       // false celowo utworzony nowy string
        System.out.println(a.equals(c));  // true poprawna forma sprawdzania stringow


    }
}
