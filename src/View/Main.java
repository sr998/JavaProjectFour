package View;

import Entites.Users.Conductor;
import Entites.Users.Musician;

public class Main {
    public static void main(String[] args) {
        Musician mc = new Musician();
        System.out.println(mc.canParticipate());
        Conductor cd = new Conductor();
        cd.makeParts(1,"Hello,World");
    }
}
