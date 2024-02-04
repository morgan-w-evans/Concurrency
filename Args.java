/**
 * This class takes the arguements given at the command line and converts
 * them from Strings into integers. By doing this, the program can then decide
 * how much stock should be added, removed and whether or not the correct
 * output should be achieved based on the flag.
 * 
 * @author Morgan Evans
 */
public class Args {
    
    private int[] argsInt = new int[3];

    /**
     * This inialises the class to allow the command line arguments to be converted from Strings to integers.
     * 
     * @param args Arguments from command line (String[])
     */
    public Args(String[] args) {

        if (args.length != 3) {

            System.err.println("Please enter three arguements");
            System.exit(1);
        } else {

            for (int i = 0; i < 3; i++) {

                try {

                    this.argsInt[i] = Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {

                    System.err.println("Argument " + args[i] + " must be an integer.");
                    System.exit(1);
                }
            }
        }

        if(argsInt[2] < 0 || argsInt[2] > 1) {

            System.out.println("Please enter a valid flag:\n0: Correct Output\n1: Incorrect Output");
            System.exit(1);
        }
    }

    /**
     * Returns the arguement for adding to stock.
     * 
     * @return number to add (int)
     */
    public int getAdd() {

        return this.argsInt[0];
    }

    /**
     * Returns the argument for removing from stock.
     * 
     * @return number to remove (int)
     */
    public int getRemove() {

        return this.argsInt[1];
    }

    /**
     * Returns the arguement for the base flag.
     * 
     * @return Flag to determine if output is correct (int)
     */
    public int getFlag() {

        return this.argsInt[2];
    }
}
