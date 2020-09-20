import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Item> ItemList = new ArrayList<Item>();
    private int amount = 0;
    private int numAll;

    public VendingMachine() {

    }

    public VendingMachine(ArrayList<Item> ItemList, int amount, int numAll) {
        this.ItemList = ItemList;
        this.amount = amount;
        this.numAll = numAll;
    }

    public void setItemList(ArrayList<Item> itemList) {
        ItemList = itemList;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setNumAll(int numAll) {
        this.numAll = numAll;
    }

    public ArrayList<Item> getItemList() {
        return ItemList;
    }

    public int getAmount() {
        return amount;
    }

    public int getNumAll() {
        return numAll;
    }


    public void restock(Item item) {
        ItemList.add(item);
    }

    public int insert(int coin) {
        int money_inserted = 0;
        money_inserted += coin;
        if (money_inserted < amount) {
            throw new ArithmeticException("Please insert more");
        }
        return money_inserted;
    }

    public class Dispenser {
        private ArrayList<Item> items_dispensed = new ArrayList<Item>();

        public Dispenser(ArrayList<Item> items_dispensed, int change) {
            this.items_dispensed = items_dispensed;
        }

        public void setItems_dispensed(ArrayList<Item> items_dispensed) {
            this.items_dispensed = items_dispensed;
        }

        public ArrayList<Item> getItems_dispensed() {
            return items_dispensed;
        }

        public void dispense(Item item) {
            items_dispensed.add(item);
        }

        public int returned_change(int coin) {
            for (int i = 0; i < items_dispensed.size(); i++) {
                amount += items_dispensed.get(i).getPrice();
            }

            return amount - insert(coin);
        }
    }
}
