package TP1;

public class Notes implements Comparable<Notes>,Statisticable{
    private String intitule;
    private float Note;

    public Notes(String intitule, float note) {
        this.intitule = intitule;
        Note = note;
    }

    public String getIntitule() {
        return intitule;
    }

    public float getNote() {
        return Note;
    }

    @Override
    public int compareTo(Notes o) {
        return Float.compare(this.getValue(), o.getValue());
    }

    @Override
    public float getValue() {
        return this.Note;
    }
}
