/**
 * The Remove class decreases the inventory counter by one when the thread is run.
 * 
 * @author Morgan Evans
 */
public class Remove implements Runnable {

    private Warehouse w;
    private int flag;

    /**
     * Initialises the class in order to run as a thread.
     * 
     * @param w The warehouse in which the stock is to be altered.
     * @param flag The flag argument given in the command line.
     */
    public Remove(Warehouse w, int flag) {

        this.w = w;
        this.flag = flag;
    }

    /**
     * This function overrides the run function in Runnable.
     * When run as a thread, it will decrease the stock count within the warehouse.
     */
    @Override
    public void run() {

        if (flag == 0) {

            w.removeStock();
        }
        else if (flag == 1) {

            w.removeStockFlag1();
        }
    }
    
}
