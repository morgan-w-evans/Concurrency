/**
 * This class represents the warehouse with the stock.
 * It holds the stock count and also contains functions to add 
 * or remove stock, with or without the correct output.
 * 
 * @author Morgan Evans
 */
public class Warehouse {
    
    private int inventorySize = 0;

    /**
     * This fucntion initialises the warehouse.
     */
    public Warehouse() {

    }

    /**
     * Increments the stock inventory by 1, producing the correct result.
     */
    public synchronized void addStock() {

        this.inventorySize++;
        System.out.println("Added. Inventory Size = " + this.inventorySize);
    }

    /**
     * Decreases the stock inventory by 1, producing the correct result.
     */
    public synchronized void removeStock() {

        this.inventorySize--;
        System.out.println("Removed. Inventory Size = " + this.inventorySize);
    }

    /**
     * Increases the stock inventory, producing an incorrect result.
     */
    public void addStockFlag1() {

        this.inventorySize++;
        System.out.println("Added. Inventory Size = " + this.inventorySize);
    }

    /**
     * Decreases the stock inventory, producing an incorrect result.
     */
    public void removeStockFlag1() {

        this.inventorySize = 1;
        System.out.println("Removed. Inventory Size = " + this.inventorySize);
    }

    /**
     * The stock count within the warehouse.
     * 
     * @return inventory count (int)
     */
    public int inventory() {

        return this.inventorySize;
    }
}
