package Model.Search;

import Entites.Users.Conductor;
import Entites.Users.Musician;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SearchElem {

    public static void searchMusician(String word, ArrayList<Musician> al )
    {
        List <String> listClone = new ArrayList<String>();
        Pattern pattern = Pattern.compile(word,Pattern.CASE_INSENSITIVE); //incase u r not concerned about upper/lower case
        for (Musician musician : al) {
            if(pattern.matcher(word).find()) {
                listClone.add(word);
                continue;
            }
        }
        System.out.println(listClone.toString());
    }

    public static void searchConductor(String word, ArrayList<Conductor> al )
    {
        List <String> listClone = new ArrayList<String>();
        Pattern pattern = Pattern.compile(word,Pattern.CASE_INSENSITIVE); //incase u r not concerned about upper/lower case
        for (Conductor conductor : al) {
            if(pattern.matcher(word).find()) {
                listClone.add(word);
                continue;
            }
        }
        System.out.println(listClone.toString());
    }
}
