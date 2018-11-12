package Controller.Musicians;

import Entites.Users.Musician;

import java.util.ArrayList;

public class MusiciansController {

    public static ArrayList<Musician> musiciansReady(ArrayList<Musician> all) {
        ArrayList<Musician> ready = new ArrayList<>();
        for (Musician mc:all)
        {
            if (mc.canParticipate()) {
                ready.add(mc);
            }
        }
        return ready;
    }
}
