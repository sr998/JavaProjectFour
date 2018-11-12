package Model.Users;

import Controller.Director.DirectorController;
import Entites.Users.Conductor;
import Entites.Users.Director;
import Entites.Users.Musician;
import Model.Print.PrintList;
import Model.Search.SearchElem;

import java.util.ArrayList;
import java.util.Scanner;

public class DirectorModel {

    public static void dirMenu(){
        Director dc = new Director();
        ArrayList<Musician> mc = new ArrayList<>();
        ArrayList<Conductor> cd = new ArrayList<>();
        System.out.println("Nice to see you again, director!");
        System.out.println("\nPlease select option:" +
                "\n*hire_m* - Hire new musician;" +
                "\n*hire_c* - Hire new conductor" +
                "\n*concert* - Start a concert");
        Scanner in = new Scanner(System.in);
        String option = in.nextLine();
        switch (option)
        {
            case "hire_m":{

                System.out.println("Nice! You decided to hire new musician" +
                        "\nNow, input his name :");
                String name = in.nextLine();
                System.out.println("Great, now the second name : ");
                String surname = in.nextLine();
                int salary = DirectorController.inputSalary();
                mc.add(dc.hireMusician(name,surname,salary));
                System.out.println("Great,you added new worker ");
                SearchElem.searchMusician(name,mc);
                break;
            }
            case "hire_c":{

                System.out.println("Nice! You decided to hire new conductor" +
                        "\nNow, input his name :");
                String name = in.nextLine();
                System.out.println("Great, now the second name : ");
                String surname = in.nextLine();
                int salary = DirectorController.inputSalary();
                mc.add(dc.hireMusician(name,surname,salary));
                System.out.println("Great,you added new worker ");
                SearchElem.searchMusician(name,mc);

            }

        }
    }
}
