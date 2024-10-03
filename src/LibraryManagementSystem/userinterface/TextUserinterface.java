package LibraryManagementSystem.userinterface;

import LibraryManagementSystem.logic.LibraryManager;

import java.util.Scanner;

public class TextUserinterface extends UserInterface {

    private Scanner scanner;
    private LibraryManager manager;

    public TextUserinterface(LibraryManager manager, Scanner scanner){
        super (manager, scanner);
    }

    public void init(){
        System.out.println("Welcome to the Library Management System!");
        while (true){
            mainPageInit();
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 3){
                break;
            }
        }
    }


    public void mainPageInit(){
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
