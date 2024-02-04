/**
 * The Action class allows the add and remove operations to be split into separate
 * threads to support multithreading. Based on the input, it will either begin to
 * run threads to add stock to the inventory, or remove stock.
 * 
 * @author Morgan Evans
 */
public class Action implements Runnable {

    private Warehouse w;
    private int add, remove, flag;

    /**
     * Initialises action, in order to run as a thread.
     * 
     * @param w The warehouse to alter the stock count from.
     * @param add The argument given at the command line instructing the number of items to be added to stock.
     * @param remove The arguement given at the command line instructing the number of items to be removed from stock.
     * @param flag The arguement given at the command line instructing whether or not the output should be correct.
     */
    public Action (Warehouse w, int add, int remove, int flag) {

        this.w = w;
        this.add = add;
        this.remove = remove;
        this.flag = flag;
    }

    /**
     * This function overrides the function in Runnable.
     * When executed, the code runs in a thread and will either begin to run multiple threads for
     * adding to stock, or removing from stock.
     */
    @Override
    public void run() {

        if (this.add == 0) {

            for (int i = 0; i < this.remove; i++) {

                Remove r = new Remove(this.w, this.flag);
                Thread remove = new Thread(r);
                remove.start();
                
                try {

                    remove.join();
                } catch (InterruptedException e) {}
            }
        } else {

            for (int i = 0; i < this.add; i++) {

                Add a = new Add(this.w, this.flag);
                Thread add = new Thread(a);
                add.start();

                try {

                    add.join();
                } catch (InterruptedException e) {}
            }
        }
    }
    
}
