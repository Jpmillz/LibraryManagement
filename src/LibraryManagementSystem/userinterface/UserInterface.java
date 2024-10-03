package LibraryManagementSystem.userinterface;

import LibraryManagementSystem.logic.LibraryManager;

import java.util.Scanner;

public abstract class UserInterface {

    private Scanner scanner;
    private LibraryManager manager;

    public UserInterface(LibraryManager manager, Scanner scanner){
        this.scanner = scanner;
        this.manager = manager;
    }

    public abstract void init();

    public abstract void mainPageInit();

}
