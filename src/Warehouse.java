import java.util.Arrays;

public class Warehouse {
    public static void main(String[] args) {
        int count = 0;
        String[] products = new String[5];

        String nullTest = null;
        String name = new String("milk");

        // adding item to products
        count = addProduct(products, name, count);
        System.out.println(count);

        // printing items of products table
        printProducts(products);


        // attempt to add null and duplicate
        count = addProduct(products, nullTest, count);
        count = addProduct(products, name, count);

        // count should remain unchanged
        System.out.println(count);

        // adding items to fill the table
        count = addProduct(products, "cheese", count);
        count = addProduct(products, "ham", count);

        // creating copy
        String[] productsBackup = backup(products);

        // filling the table continuation
        count = addProduct(products, "flour", count);
        count = addProduct(products, "eggs", count);

        // count = 5 and printing table
        System.out.println(count);
        printProducts(products);

        // adding excessive item
        count = addProduct(products, "bread", count);
        // count and table should remain the same
        System.out.println(count);
        printProducts(products);

        // printing copy and original table to see the difference
        System.out.println(">>>");
        printProducts(products);
        printProducts(productsBackup);
    }

    static boolean contains(String[] products, String name) {
        if (name == null) {
            return false;
        }
        for (String product : products) {
            if (name.equals(product)) {
                return true;
            }
        }
        return false;
    }

    static int addProduct(String[] products, String name, int count) {
        if (products.length == count
                || name == null
                || contains(products, name)) {
            return count;
        }
        products[count] = name;
        return count + 1;
    }

    static String[] backup(String[] products) {
        return Arrays.copyOf(products, products.length);
    }

    static void printProducts(String[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                continue;
            }
            System.out.println(i + ": " + products[i]);
        }
        System.out.println();
    }
}
