package Entites.Concert;

import java.util.ArrayList;
import java.util.List;

public class Part {
    private String fullPart;
    private String separatedPart;

    public static ArrayList<String> splitStringEqually(String text, int size)
    {
        ArrayList<String> al = new ArrayList<>();
        if(text.length() % size == 0)
        {
            while(text.length() > 0) {
                String nextChunk = text.substring(0,size);
                // store the chunk.

                text = text.substring(size,text.length());
                al.add(text);
                return al;
            }

        }
            //throw new IllegalArgumentException();
        return al;
    }

    public String getFullPart() {
        return fullPart;
    }

    public void setFullPart(String fullPart) {
        this.fullPart = fullPart;
    }

    public String getSeparatedPart() {
        return separatedPart;
    }

    public void setSeparatedPart(String separatedPart) {
        this.separatedPart = separatedPart;
    }
}
