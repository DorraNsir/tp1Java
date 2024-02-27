package TP1;

import java.util.Comparator;

public class CompareNote implements Comparator<Notes> {
    @Override
    public int compare(Notes n1, Notes n2) {
        return Float.compare(n1.getValue(), n2.getValue());
    }
}
