import java.util.Arrays;

public class Warehouse {
    public static void main(String[] args) {

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
        return count++;
    }
    static String[] backup(String[] products){
        return Arrays.copyOf(products,products.length);
    }
    static void printProducts(String[] products){
        for(int i = 0; i < products.length; i++){
            if(products[i] == null){break;}
            System.out.println("0: "+products[i]);
        }
    }
}
