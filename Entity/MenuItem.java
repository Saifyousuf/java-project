package Entity;

public class MenuItem {
    private String id;
    private String name;
    private double price;

    public MenuItem() {}

    public MenuItem(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void showItem() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }

    public String getItemInfo() {
        return "ID: " + id + ", Name: " + name + ", Price: $" + price;
    }
}