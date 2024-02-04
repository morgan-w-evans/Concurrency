/**
 * This class contains the main function to run the program.
 * It creates instances of the other classes and starts the threads.
 * Once all threads have run, it will print the final inventory size.
 * 
 * @author Morgan Evans
 */
public class InventoryMain {

    /**
     * This is the main function which will execute the program by calling on various
     * threads in various classes to add and remove stock.
     * 
     * @param args Arguments receievd from the command line.
     */
    public static void main(String[] args) {

        Args cmd = new Args(args);
        Warehouse w = new Warehouse();

        Action a = new Action(w, cmd.getAdd(), 0, cmd.getFlag());
        Action r = new Action(w, 0, cmd.getRemove(), cmd.getFlag());

        Thread add = new Thread(a);
        Thread remove = new Thread(r);

        add.start();
        remove.start();

        try {

            add.join();
            remove.join();

        } catch (InterruptedException e) {

            System.out.println("Exception: " + e);
        }

        System.out.println("Final Inventory Size: " + w.inventory());
    }
}