package LibraryManagementSystem.userinterface.pages;

import LibraryManagementSystem.logic.LibraryManager;

import java.util.Scanner;

public class MainPage implements IUserInterface {

    private Scanner scanner;
    private LibraryManager manager;

    public MainPage(LibraryManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }

    @Override
    public void init() {
        while (true){
            initMain();

        }
    }

    private void initMain() {
        System.out.println("""
                =============
                Enter a Command:
                1) Book Center
                2) """);
    }
}
