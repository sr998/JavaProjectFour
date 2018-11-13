package Model;

import Entites.Users.Conductor;
import Entites.Users.Director;
import Entites.Users.Musician;
import Model.Users.ConductorModel;
import Model.Users.DirectorModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Dialog {

    public static void menu(){
        System.out.println("\nGreetings,user!");
        System.out.println("\nPlease choose your role :conductor or director");
        Scanner in = new Scanner(System.in);
        String role = in.nextLine();
        Director dc = new Director();
        ArrayList<Musician> mc = new ArrayList<>();
        ArrayList<Conductor> cd = new ArrayList<>();
        mc.add(dc.hireMusician("Ivann","Navi",1000));
        mc.add(dc.hireMusician("Ivanen","Hile",1000));
        mc.add(dc.hireMusician("Josh","Pomp",1000));
        cd.add(dc.hireConductor("Horn","Jonny",1200));
        while (true) {
            switch (role) {
                case "director": {
                    DirectorModel.dirMenu(dc,mc,cd);
                    break;
                }
                case "conductor": {
                    ConductorModel.conductorMenu(mc,cd);
                }
            }
        }
    }
}
