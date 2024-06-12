package org.example;
import java.awt.print.Book;
import java.util.HashSet;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("admin");
        Users user = new Users("Pepe");
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome to the Library. Please, log in as an user or an admin");
        String typeOfUser = scanner.nextLine();
        while (!exit) {
            switch (typeOfUser.toLowerCase()){
                case "user":
                    boolean userExit = false;
                    while (!userExit){
                    System.out.println("""
                            Type a number to choose an operation: 
                            1. Show all books.
                            2. Search books. 
                            3. Borrow books. 
                            4. Check borrowed books. 
                            5. Return books. 
                            6. Exit. """);
                    String userOption = scanner.nextLine();
                    switch (userOption.toLowerCase()) {
                        case "1":
                            admin.showAllBooks();
                            break;
                        case "2":
                            admin.searchBooks();
                            break;
                        case "3":
                            admin.borrowBooks();
                            break;
                        case "4":
                            user.checkBorrowedBooks();
                            break;
                        case "5":
                            admin.returnBooks();
                            break;

                        case "6":
                            userExit = true;
                            break;
                        default:
                            System.out.println("Invalid operation.");
                    }
                }break;
                case "admin":
                    boolean adminExit = false;
                    while (!adminExit) {
                        System.out.println("""
                                Type a number to choose an operation: 
                                1. Show all books.
                                2. Search books. 
                                3. Borrow books. 
                                4. Check borrowed books. 
                                5. Return books.
                                6. Add books. 
                                7. Remove books.  
                                8. Exit. """);
                        String adminOption = scanner.nextLine();
                        switch (adminOption.toLowerCase()) {

                                case "1":
                                    admin.showAllBooks();
                                    break;
                                case "2":
                                    admin.searchBooks();
                                    break;
                                case "3":
                                    admin.borrowBooks();
                                    break;
                                case "4":
                                    user.checkBorrowedBooks();
                                    break;
                                case "5":
                                    admin.returnBooks();
                                    break;
                                case "6":
                                    admin.addBook();
                                    break;
                                case "7":
                                    admin.removeBook();
                                    break;
                                case "8":
                                    adminExit = true;
                                    break;
                                default:
                                    System.out.println("Invalid operation.");
                            }

                    }break;
                default:
                    System.out.println("Invalid user");
                    exit=true;
            }







        }scanner.close();
    }
