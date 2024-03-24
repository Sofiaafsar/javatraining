package Collections;

import java.util.*;

class Product {
    private String name_prod;
    private double price;
    private int qty;

    public Product(String name_prod, double price, int qty) {
        this.name_prod = name_prod;
        this.price = price;
        this.qty = qty;
    }

    public String getName_prod() {
        return name_prod;
    }

    public void setName_prod(String name_prod) {
        this.name_prod = name_prod;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name_prod='" + name_prod + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}

    class Cart {

    NavigableSet<Product> set=new TreeSet<>(Comparator.comparing(Product::getPrice));
    public void addProducts(Product prod) {
        set.add(prod);
    }

    public void deleteProducts(double Price) {
        set.removeIf(prod-> Objects.equals(prod.getPrice(), Price));
    }
    public void display(){
        NavigableSet<Product>reversed=new TreeSet<>(set.descendingSet());
        Iterator<Product> iterator = reversed.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    }
    public  class ShoppingCart{
    public static void main(String[]args){
        Cart cart=new Cart();
        Product product=new Product("Fan",2500,2);
        Product product1=new Product("Table",25000,1);
        Product product2=new Product("Car",2500000,1);

        cart.addProducts(product);
        cart.addProducts(product1);
        cart.addProducts(product2);

        cart.deleteProducts(25000);
        cart.display();
    }
    }

