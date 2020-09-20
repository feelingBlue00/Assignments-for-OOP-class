public class Item {
    private String id;
    private String name;
    private int price;
    private int numItem;

    public Item() {

    }

    public Item(String id, String name, int price, int numItem) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.numItem = numItem;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNumItem() {
        return numItem;
    }
}
