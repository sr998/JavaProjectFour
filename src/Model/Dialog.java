package Model;

import Model.Users.DirectorModel;

import java.util.Scanner;

public class Dialog {

    public static void menu(){
        System.out.println("Greetings, unregistred user!");
        System.out.println("\n Please choose your role : musician, conductor or director");
        Scanner in = new Scanner(System.in);
        String role = in.nextLine();

        switch(role)
        {
            case"director":{
                DirectorModel.dirMenu();
            }
        }
    }
}
