package school;

public enum Course {
    DAC, DMC, DAI, DBDA, DITISS;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
