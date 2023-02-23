package greedyTimesErrors;

public class Item {
    private ItemType itemType;
    private String itemName;
    private long amount;

    public Item(ItemType itemType, String itemName, long amount) {
        this.itemType = itemType;
        this.itemName = itemName;
        this.amount = amount;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public long getAmount() {
        return amount;
    }

}
