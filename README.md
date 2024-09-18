## Exercise: Multi-threaded Production Line

#### Objective:
The objective of this exercise is to practice working with synchronized blocks. You will create a program that simulates a multi-threaded production line where multiple workers produce and assemble products. Synchronized blocks will be used to ensure thread safety and avoid race conditions.

#### Instructions:

1.	Create a class named ProductionLine that represents a production line. It should have the following methods:
    -	producePart(String partName): Method to produce a part with a given name. Print a message indicating which worker produced the part.
    -	assembleProduct(String productName): Method to assemble a product with a given name using the produced parts. Print a message indicating which worker assembled the product.
2.	In the ProductionLine class, use synchronized blocks to protect the producePart() and assembleProduct() methods to prevent race conditions.
3.	In the Main class, create an instance of the ProductionLine class.
4.	Create multiple threads (e.g., 6 threads) that represent workers on the production line. Each worker should repeatedly call the producePart() method to produce a part and then call the assembleProduct() method to assemble a product using the produced parts.
5.	Use synchronized blocks in the producePart() and assembleProduct() methods to ensure thread safety.
6.	Allow the program to run for a specified duration (e.g., 10 seconds) to observe the production and assembly process.
7.	After the specified duration, the program can finish execution.
