/*Consider a small hospital with a pharmacy that needs a simple inventory management
system to keep track of its medications and medical supplies. Each item in the inventory
has a unique ID, name, quantity in stock, and price. The hospital wants functionalities
to add new items, update existing items, remove items, display the list of all items,
and search for a specific item by its ID.*/
import java.util.ArrayList;

class pharmacy{
    public final int id;
    public final String name;
    public int quantity;
    public double price;
    public pharmacy(int id, String name, int quantity, double price){
        this.id = id;
        this.name=name;
        this.quantity=quantity;
        this.price = price;
    }
}
public class PharmacyManagementSystem {
    public ArrayList<pharmacy> inventory = new ArrayList<>();

    public void additem(pharmacy item){
        inventory.add(item);
    }
    public void updateitem(int id, int quantity, double price){
        for (pharmacy item: inventory){
            if(item.id == id){
                item.quantity=quantity;
                item.price=price;
                break;
            }
        }
    }
    public void removeitem(int id){
        inventory.removeIf(item -> item.id==id);
    }
    public void display(){
        for (pharmacy item: inventory){
            System.out.println(+item.id+ "|" + item.name + " | Quantity: " +
                    item.quantity + " | Price: " + item.price);
        }
    }
    public pharmacy searchitem(int id){
        for (pharmacy item:inventory){
            if(item.id==id){
                return item;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        PharmacyManagementSystem psm = new PharmacyManagementSystem();
        psm.additem(new pharmacy(1,"Cetamol",100,2.5));
        psm.additem(new pharmacy(2,"flexon",200,1.5));
        psm.additem(new pharmacy(3,"Sinex",500,2.0));
        psm.display();
        System.out.println();
        psm.updateitem(1,150,3.0);
        psm.display();
        System.out.println();
        pharmacy foundItem = psm.searchitem(2);
        if (foundItem != null) {
            System.out.println("Item found: " + foundItem.name);
        } else {
            System.out.println("Item not found.");
        }
        System.out.println();
        psm.removeitem(3);
        psm.display();
    }
}
