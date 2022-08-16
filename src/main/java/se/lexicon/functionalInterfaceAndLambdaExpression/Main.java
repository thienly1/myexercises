package se.lexicon.functionalInterfaceAndLambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

        static List<Product> products = new ArrayList<>(Arrays.asList(new Product("Banana", 10, 8),
                                                                  new Product("coca", 20, 150),
                                                                  new Product("Baby Toy", 120, 80),
                                                                  new Product("Jacket", 200, 200)));
    // TODO: Print out all Products that have stock value of 0.
    //• Print out the productName of all the Products that starts with B.
    //• Print out all Products that have price above 100 AND lower than 150
    //• Increase the price of all Products that have a stock value of less than 10 AND above 0 by 50%
    static Conditional<Product> findProductNameStartWithB = product -> product.getProductName().contains("B");
    static Conditional<Product> findProductPriceAbove100AndLower150 = product -> product.getPrice()>100&&product.getPrice()<150;
    static Conditional<Product> findByStockLess10= product -> product.getStock()<10&&product.getStock()>0;
    static Action<Product> increaseProductPrice50 = product -> product.setPrice(product.getPrice()*1.5);

    public static void main(String[] args) {
        findAndPrint(products,findProductNameStartWithB);
        findAndPrint(products, findByStockLess10);
        findAndPrint(products,findProductPriceAbove100AndLower150);
        findAndDo(products,findByStockLess10, increaseProductPrice50);
    }
    public static void findAndPrint(List<Product> products, Conditional conditional){
        for(Product p:products){
            if(conditional.test(p)){
                System.out.println(p);
            }
        }
    }
    public static void findAndDo(List<Product>products, Conditional conditional, Action action){
        for(Product p: products){
            if(conditional.test(p)){
                action.execute(p);
                List<Product> matching = new ArrayList<>();
                matching.add(p);
                matching.forEach(product -> System.out.println(product));
            }
        }
    }
}
