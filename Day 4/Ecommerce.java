package Inheritance;

import java.util.*;

// Base class for Product
class Product {
    private String productName;
    private double price;
    private String description;

    public Product(String productName, double price, String description) {
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

// Subclass for Electronics
class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String productName, double price, String description, String brand, String model) {
        super(productName, price, description);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

// Subclass for Clothing
class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String productName, double price, String description, String size, String material) {
        super(productName, price, description);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

// Subclass for Books
class Books extends Product {
    private String author;
    private int pageCount;

    public Books(String productName, double price, String description, String author, int pageCount) {
        super(productName, price, description);
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        // Example usage
        Electronics laptop = new Electronics("Laptop", 99900.0, "High-performance laptop", "Dell", "XPS 15");
        Clothing shirt = new Clothing("T-Shirt", 1000.99, "Casual cotton t-shirt", "M", "Cotton");
        Books novel = new Books("The summer I turned pretty", 280, "Romance novel", "Jenny Han", 281);

        // Output information about products
        System.out.println("Product: " + laptop.getProductName() + ", Brand: " + laptop.getBrand() + ", Model: " + laptop.getModel());
        System.out.println("Product: " + shirt.getProductName() + ", Size: " + shirt.getSize() + ", Material: " + shirt.getMaterial());
        System.out.println("Product: " + novel.getProductName() + ", Author: " + novel.getAuthor() + ", Page Count: " + novel.getPageCount());
    }
}
