# Concurrency
SCC.211 Programming Coursework on Concurrency

Concurrency is a program developed to implement threads within Java, as part of SCC.211: Advanced Programming within the School of Computing & Communications, Lancaster University, UK.

This work achieved 100% (A+), contributing towards the achievement of a First-Class BSc (Hons) Degree in Computer Science.

------------------------------------------------

Classes
---

InventoryMain.java --> This class contains the main function to run the program.
                       It creates instances of the other classes and starts the threads.
                       Once all threads have run, it will print the final inventory size.

Args.java          --> This class takes the arguments given at the command line and converts
                       them from Strings into integers. By doing this, the program can then decide
                       how much stock should be added, or removed and whether or not the correct
                       output should be achieved based on the flag.

Warehouse.java     --> This class represents the warehouse with the stock.
                       It holds the stock count and also contains functions to add or remove stock,
                       with or without the correct output.

Action.java        --> The Action class allows the add and remove operations to be split into separate
                       threads to support multithreading. Based on the input, it will either begin to
                       run threads to add stock to the inventory, or remove stock.

Add.java           --> The Add class increments the inventory counter by one when the thread is run.

Remove.java        --> The Remove class decreases the inventory counter by one when the thread is run.



Operation
---
1. To run the program, first compile the program in case the .class files are out of date.

   Once in the correct destination within the terminal, type >> javac InventoryMain.java <<

2. Once completed, run the program by typing >> java InventoryMain << followed by three arguments:

    a) The first argument is the stock to add to the warehouse. E.g. 50

    b) The second argument is the stock to remove from the warehouse E.g. 17

    c) The third argument is the flag, to determine if you want the correct output (0) or the
       incorrect output (1)

    For example: >> java InventoryMain 50 17 0 << would result in the program adding 50 to the stock,
                 removing 17 and giving the correct output of 33.
