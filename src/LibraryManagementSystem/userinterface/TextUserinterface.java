package LibraryManagementSystem.userinterface;

import LibraryManagementSystem.logic.LibraryManager;
import LibraryManagementSystem.userinterface.pages.IUserInterface;

import java.util.Scanner;

public class TextUserinterface implements IUserInterface {

    private Scanner scanner;
    private LibraryManager manager;

    public TextUserinterface(LibraryManager manager, Scanner scanner){

    }

    public void init(){
        System.out.println("Welcome to the Library Management System!");
        while (true){
            displayContents();
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 3){
                break;
            }
        }
    }


    public void displayContents(){
        System.out.println(
                """
                        =====================
                        1) Enter Book Center
                        2) Browse Books
                        3) Exit
                        =====================
                        """);
    }
}
