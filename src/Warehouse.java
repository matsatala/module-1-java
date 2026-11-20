import java.util.Arrays;

public class Warehouse {
    public static void main(String[] args) {
        String[] products = new String[5];

        String name = new String("milk");

        // adding item to products
        int count = addProduct(products, name);
        System.out.println(count);

        // printing items of products table
        printProducts(products);


        // attempt to add null and duplicate
        count = addProduct(products, null);
        // count should remain unchanged
        System.out.println(count);

        count = addProduct(products, name);
        // count should remain unchanged
        System.out.println(count);

        // adding items to fill the table
        addProduct(products, "cheese");
        addProduct(products, "ham");

        // creating copy
        String[] productsBackup = backup(products);

        // filling the table continuation
        addProduct(products, "flour");
        count = addProduct(products, "eggs");

        // count = 5 and printing table
        System.out.println(count);
        printProducts(products);

        // adding excessive item
        count = addProduct(products, "bread");
        // count and table should remain the same
        System.out.println(count);

        // printing copy and original table to see the difference
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

    static int addProduct(String[] products, String name) {
        int count = 0;
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null && index == -1) {
                index = i;
            }
            if (products[i] != null) {
                count++;
            }
        }
        if (name == null || contains(products, name) || count == products.length) {
            return count;
        }
        products[index] = name;
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
