package Entites.Users;

import Entites.Concert.Part;

import java.util.ArrayList;

public class Conductor extends Musician {


    public Conductor(String name, String surname,int salary) {
        super(name,surname,salary);
    }

    public Conductor() {
    }

    public ArrayList<String> makeParts(int num, String fullpart,ArrayList<Musician> mc)
    {

        if (fullpart.length()%2==0) {
            num = fullpart.length() / num;

        }else
            num =(fullpart.length()/num)+1;
        ArrayList<String> al = Part.splitEqually(fullpart,num);
        int j =0;
        for (int i = 0; i < al.size(); i++) {
            ++j;
            System.out.println("Musician who's id is "+j+" Plays part: "+al.get(i));
            mc.get(i).setPart(al.get(i));
        }
        return al;
    }


}
