import java.util.Arrays;

public class Rejestracja {
    public static void main(String[] args){
        String[] users = {"ola", null, "admin"};

        //tworzenie kopii zapasowej
        String[] copy = Arrays.copyOf(users, users.length);
        copy[0] = "OLA";
        System.out.println(copy[0]);
        System.out.println(users[0]);

        String login = new String("admin");
        if (isExist(users, login)){
            String greeting = "witaj, ";
            greeting = greeting.toUpperCase();
            System.out.println(greeting + login);
        }

        users = new String[0];
        System.out.println( users.length );
    }
    static boolean isExist(String[] list, String value ){
            if ( value != null ){
                for(String u: list){
                    if(value.equals(u)){
                        return true;
                    }
                }
            }
        return false;
    }
}
