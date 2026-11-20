import java.util.Arrays;

public class Warehouse {
    public static void main(String[] args) {
        int count = 0;
        String[] products = new String[5];

        String nullTest = null;
        String name = new String("milk");

        // utworzenie kopii
        String[] productsBackup = backup(products);

        // dodanie produktu do orginału i wypisanie nowego count
        count = addProduct(products, name, count);
        System.out.println(count);

        // wyświetlenie obu tablic
        printProducts(products);
        printProducts(productsBackup);

        // próba dodania duplikatu i null
        count = addProduct(products, nullTest, count);
        count = addProduct(products, name, count);
        // powinno być nadal 1
        System.out.println(count);

        // dodanie produktów aby wypełnić tablicę
        count = addProduct(products, "cheese", count);
        count = addProduct(products, "ham", count);
        count = addProduct(products, "flour", count);
        count = addProduct(products, "eggs", count);

        // powinno być 5 + wyświetlenie produktów
        System.out.println(count);
        printProducts(products);

        // dodajemy nadmiarowy produkt
        count = addProduct(products, "bread", count);
        // count nie powinien się zmienić a lista tablica powinna zostać taka sama bez żadnego błędu
        System.out.println(count);
        printProducts(products);

        // wypisanie kopii jeszcze raz dla pewności powinna być pusta
        System.out.println(">>>");
        printProducts(productsBackup);
    }
    static boolean contains(String[] products, String name){
        if(name == null){return false;}
        for (String product: products){
            if(name.equals(product)){
                return true;
            }
        }
        return false;
    }
    static int addProduct(String[] products, String name, int count){
        if(products.length == count
                || name == null
                || contains(products, name)){return count;}
        products[count] = name;
        return count + 1;
    }
    static String[] backup(String[] products){
        return Arrays.copyOf(products,products.length);
    }
    static void printProducts(String[] products){
        for(int i = 0; i < products.length; i++){
            if(products[i] == null){continue;}
            System.out.println(i+": "+products[i]);
        }
        System.out.println();
    }
}
