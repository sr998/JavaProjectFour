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

public class ConductorModel {

    public static void conductorMenu( ArrayList<Musician> mc, ArrayList<Conductor> cd){
        System.out.println("\n\n\nGreetings, Conductor!");
        System.out.println("\nPlease select option:" +
                "\n*concert* - Start a concert" +
                "\n*listm* - Get musicians list" +
                "\n*listc - Get conductors list");
        Scanner in = new Scanner(System.in);
        String option = in.nextLine();
        switch (option)
        {

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
