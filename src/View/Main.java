package View;

import Controller.Conductor.ConductorController;
import Controller.Director.DirectorController;
import Controller.Musicians.MusiciansController;
import Entites.Users.Conductor;
import Entites.Users.Director;
import Entites.Users.Musician;
import Model.Dialog;
import Model.Print.PrintList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Director dr = new Director();
        ArrayList<Musician> musicians = new ArrayList<>();


        Musician mc = dr.hireMusician("Ura","Jojo",DirectorController.rndSalary());
        musicians.add(mc);
        Musician mc2 = dr.hireMusician("Hura","Lojo",DirectorController.rndSalary());
        musicians.add(mc2);

        musicians= MusiciansController.musiciansReady(musicians);

        System.out.println("Number of musicains = "+musicians.size()+ " Salary = "+musicians.get(0).getSalary());


        Conductor cd = dr.hireConductor("ConductorController","Hired",500);
        cd.makeParts(musicians.size(),"Hello world");
        PrintList.printL(musicians);

        Dialog.menu();



    }
}
