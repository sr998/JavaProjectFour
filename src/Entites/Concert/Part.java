package Entites.Concert;

import java.util.ArrayList;
import java.util.List;

public class Part {

    private String fullPart;
    private String separatedPart;

    public static ArrayList<String> splitEqually(String text, int size) {
        ArrayList<String> ret = new ArrayList<>((text.length() + size - 1) / size);

        for (int start = 0; start < text.length(); start += size) {
            ret.add(text.substring(start, Math.min(text.length(), start + size)));
        }
        return ret;
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
