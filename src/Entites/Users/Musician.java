package Entites.Users;

import Entites.Concert.Part;

import java.util.Random;

public class Musician {

    private String name;
    private String surname;
    private String part;


    public boolean canParticipate(){
        Random rnd = new Random();
        int result = rnd.nextInt(2);
        if (result==1){return true;}
        return false;

    }

    public void getPart(Part part)
    {

    }

}
