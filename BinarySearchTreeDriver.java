import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BinarySearchTreeDriver {
    public static void main(String args[]) {
        if(args.length == 0 || args.length > 1) {
            System.out.println("Error: Please enter ONE file");
        } else {
            Scanner scan = new Scanner(System.in);
            boolean stillGoing = true;
            boolean invalidCommand = false;
            String type = null;
            try {
                File file = new File(args[0]);
                Scanner fileScan = new Scanner(file);
                System.out.print("Enter list type (i - int, d - double, s - string): ");
                type = scan.next();
                System.out.println("Commands:\n(i) - Insert Item\n(d) - Delete Item");
                System.out.println("(p) - Print Tree\n(s) - Search Item \n(l) - Count Leaf Nodes");
                System.out.println("(sp)- Find Single Parents\n(c) - Find Cousins");
                System.out.print("(q) - Quit program\n\n");


                if (type.equalsIgnoreCase("i")) {
                    BinarySearchTree<Integer> list = new BinarySearchTree<>();
                    while (fileScan.hasNextInt()) {
                        int item = fileScan.nextInt();
                        list.insert(item);
                    } // while
                    while (stillGoing) {
                        if(invalidCommand) {
                            System.out.print("Invalid command try again: ");
                        } else {
                            System.out.print("Enter a command: ");
                        } // if
                        String answer = scan.next();
                        invalidCommand = false;

                        if (answer.equalsIgnoreCase("i")) {

                            list.inOrder();
                            System.out.print("Enter a number to insert: ");
                            int insert = scan.nextInt();
                            list.insert(insert);
                            list.inOrder();

                        } else if(answer.equalsIgnoreCase("d")) {

                            list.inOrder();
                            System.out.print("Enter a number to delete: ");
                            int delete = scan.nextInt();
                            list.delete(delete);

                        } else if (answer.equalsIgnoreCase("p")) {

                            list.inOrder();

                        } else if (answer.equalsIgnoreCase("l")) {

                            list.getNumLeafNodes();

                        } else if (answer.equalsIgnoreCase("s")) {

                            list.inOrder();
                            System.out.print("Enter a number to search: ");
                            int search = scan.nextInt();
                            if (list.search(search)) {
                                System.out.println("Item is present in the tree");
                            } else {
                                System.out.println("Item is not present in the tree");
                            } // if

                        } else if (answer.equalsIgnoreCase("sp")) {

                            list.getSingleParent();

                        } else if (answer.equalsIgnoreCase("c")) {

                            list.inOrder();
                            System.out.print("Enter a number: ");
                            int cousin = scan.nextInt();
                            list.getCousins(cousin);

                        } else if (answer.equalsIgnoreCase("q")) {

                            stillGoing = false;
                            System.out.println("Exiting the program...");

                        } else {

                            invalidCommand = true;

                        } // if
                    } // while

                    fileScan.close();
                } else if (type.equalsIgnoreCase("d")) {
                    BinarySearchTree<Double> list = new BinarySearchTree<>();
                    while (fileScan.hasNextDouble()) {
                        double item = fileScan.nextDouble();
                        list.insert(item);
                    } // while

                       while (stillGoing) {
                        if(invalidCommand) {
                            System.out.print("Invalid command try again: ");
                        } else {
                            System.out.print("Enter a command: ");
                        } // if
                        String answer = scan.next();
                        invalidCommand = false;

                        if (answer.equalsIgnoreCase("i")) {

                            list.inOrder();
                            System.out.print("Enter a number to insert: ");
                            double insert = scan.nextDouble();
                            list.insert(insert);
                            list.inOrder();

                        } else if(answer.equalsIgnoreCase("d")) {

                            list.inOrder();
                            System.out.print("Enter a number to delete: ");
                            double delete = scan.nextDouble();
                            list.delete(delete);

                        } else if (answer.equalsIgnoreCase("p")) {

                            list.inOrder();

                        } else if (answer.equalsIgnoreCase("l")) {

                            list.getNumLeafNodes();

                        } else if (answer.equalsIgnoreCase("s")) {

                            list.inOrder();
                            System.out.print("Enter a number to search: ");
                            double search = scan.nextDouble();
                            if (list.search(search)) {
                                System.out.println("Item is present in the tree");
                            } else {
                                System.out.println("Item is not present in the tree");
                            } // if

                        } else if (answer.equalsIgnoreCase("sp")) {

                            list.getSingleParent();

                        } else if (answer.equalsIgnoreCase("c")) {

                            list.inOrder();
                            System.out.print("Enter a number: ");
                            double cousin = scan.nextDouble();
                            list.getCousins(cousin);

                        } else if (answer.equalsIgnoreCase("q")) {

                            stillGoing = false;
                            System.out.println("Exiting the program...");

                        } else {

                            invalidCommand = true;

                        } // if
                    } // while


                    fileScan.close();
                } else if (type.equalsIgnoreCase("s")) {
                    BinarySearchTree<String> list = new BinarySearchTree<>();
                    while (fileScan.hasNext()) {
                        String item = fileScan.next();
                        list.insert(item);
                    } // while


                       while (stillGoing) {
                        if(invalidCommand) {
                            System.out.print("Invalid command try again: ");
                        } else {
                            System.out.print("Enter a command: ");
                        } // if
                        String answer = scan.next();
                        invalidCommand = false;

                        if (answer.equalsIgnoreCase("i")) {

                            list.inOrder();
                            System.out.print("Enter a string to insert: ");
                            String insert = scan.next();
                            list.insert(insert);
                            list.inOrder();

                        } else if(answer.equalsIgnoreCase("d")) {

                            list.inOrder();
                            System.out.print("Enter a string to delete: ");
                            String delete = scan.next();
                            list.delete(delete);

                        } else if (answer.equalsIgnoreCase("p")) {

                            list.inOrder();

                        } else if (answer.equalsIgnoreCase("l")) {

                            list.getNumLeafNodes();

                        } else if (answer.equalsIgnoreCase("s")) {

                            list.inOrder();
                            System.out.print("Enter a string to search: ");
                            String search = scan.next();
                            if (list.search(search)) {
                                System.out.println("Item is present in the tree");
                            } else {
                                System.out.println("Item is not present in the tree");
                            } // if

                        } else if (answer.equalsIgnoreCase("sp")) {

                            list.getSingleParent();

                        } else if (answer.equalsIgnoreCase("c")) {

                            list.inOrder();
                            System.out.print("Enter a string: ");
                            String cousin = scan.next();
                            list.getCousins(cousin);

                        } else if (answer.equalsIgnoreCase("q")) {

                            stillGoing = false;
                            System.out.println("Exiting the program...");

                        } else {

                            invalidCommand = true;

                        } // if
                    } // while

                    fileScan.close();
                } else {
                    System.exit(0);
                } // if
            } catch (FileNotFoundException fe) {
                System.out.println("File not found");
            } // try
        }// if
    } // main
} // BinaraySearchTreeDriver
