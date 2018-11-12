package Controller.Conductor;

import java.util.ArrayList;

public class ConductorController {

    public static int partsIterator(ArrayList<String> parts,int musicians){
        int num=0;
        if (musicians%2==0) {
            num = parts.size() / musicians;
            return num;
        }
        return num+1;
    }

}
