package Model.Print;


import Entites.Users.Conductor;
import Entites.Users.Musician;

import java.util.ArrayList;

public class PrintList {
    public static void printL (ArrayList<Musician> al){
        for (Musician mc:al) {
            System.out.println(mc.toString());
        }
    }

    public static void printC (ArrayList<Conductor> al){
        for (Conductor cd:al) {
            System.out.println(cd.toString());
        }
    }
}
