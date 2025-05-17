/*Develop an online shopping platform to manage a dynamic list of products available for sale.
I) Implement a program called OnlineShoppingManager that uses a Vector to store product
   objects. Each product should have attributes for name, price and category.
II) Design methods in the OnlineShoppingManager class to add products to the inventory,
    remove products from the inventory and display all products in the inventory.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;

class Product{
    String name;
    double price;
    String category;
    public Product(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
public class OnlineShoppingPlatform {
    private Vector<Product> inventory = new Vector<>();

    public void addproduct(String name, double price, String category){
        Product product = new Product(name,price,category);
        inventory.add(product);
    }
    public void removeproduct(String name){
        for (int i=0; i<inventory.size();i++){
            if (inventory.get(i).name.equalsIgnoreCase(name)){
                inventory.remove(i);
                break;
            }
        }
    }
    public void display(){
        System.out.println("Inventory");
        for (Product product:inventory){
            System.out.println("Name: " +product.name+", Price: Rs. "+product.price+", Category: "+product.category);
        }
    }
    public static void main(String[] args) {
        OnlineShoppingPlatform manager = new OnlineShoppingPlatform();
        manager.addproduct("laptop", 150000,"Electronics");
        manager.addproduct("Fridge", 50000,"Electronics");
        manager.addproduct("Phone",40000,"Electronics");
        manager.display();
        manager.removeproduct("Phone");
        manager.display();
    }
}