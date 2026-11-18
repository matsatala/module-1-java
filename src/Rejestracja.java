import java.util.Arrays;

public class Rejestracja {
    public static void main(String[] args){
        String[] uzytkownicy = {"ola",null,"admin"};

        //tworzenie kopii zapasowej
        String[] kopia = Arrays.copyOf(uzytkownicy, uzytkownicy.length);
        kopia[0] = "OLA";
        System.out.println(kopia[0]);
        System.out.println(uzytkownicy[0]);

        String login = new String("admin");
        if (czyIstnieje(uzytkownicy,login)){
            String powitanie = "witaj, ";
            powitanie = powitanie.toUpperCase();
            System.out.println(powitanie + login);
        }

        uzytkownicy = new String[0];
        System.out.println(uzytkownicy.length);
    }
    static boolean czyIstnieje(String[] lista, String szukany){
        for(String u: lista){
            if(szukany.equals(u)){
                return true;
            }
        }
        return false;
    }
}
