package Entites.Users;

import Entites.Concert.Part;

import java.util.ArrayList;

public class Conductor extends Musician {

    public void makeParts(int num, String fullpart)
    {
        ArrayList<String> al = Part.splitStringEqually(fullpart,num);
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Musician who's id is "+i+" Plays part: "+al.get(i));
        }
    }
}
