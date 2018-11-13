package Model.Users;

import Controller.Director.DirectorController;
import Controller.Musicians.MusiciansController;
import Entites.Users.Conductor;
import Entites.Users.Director;
import Entites.Users.Musician;
import Model.Print.PrintList;
import Model.Search.SearchElem;

import java.util.ArrayList;
import java.util.Scanner;

public class DirectorModel {

    public static void dirMenu(Director dc,ArrayList<Musician> mc,ArrayList<Conductor> cd){
        System.out.println("Nice to see you again, director!");
        System.out.println("\nPlease select option:" +
                "\n*hire_m* - Hire new musician;" +
                "\n*hire_c* - Hire new conductor" +
                "\n*concert* - Start a concert" +
                "\n*listm* - Get musicians list" +
                "\n*listc - Get conductors list");
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
                cd.add(dc.hireConductor(name,surname,salary));
                System.out.println("Great,you added new worker ");
                SearchElem.searchMusician(name,mc);
                break;

            }
            case "concert":{
                System.out.println("\nInput part you want musicians to play");
                String part = in.nextLine();
                ArrayList<Musician> conc = mc;
               conc= MusiciansController.musiciansReady(mc);
               ArrayList<String> concS = new ArrayList<>();
                cd.get(0).makeParts(conc.size(),part,conc);
                //PrintList.printL(conc);
                break;

            }
            case "listm":{
                System.out.println("List of musicians");
                PrintList.printL(mc);
                break;
            }
            case "listc":{
                System.out.println("List of conductors");
                PrintList.printC(cd);
                break;
            }

        }
    }
}
