package J110_2_1;

public enum Degrees {

    PHD ("PHD"),
    DOCTOR ("Doctor of Sciences"),
    CANDIDATE ("Candidate of Sciences");

    private String degrees;

    Degrees (String degrees)
    {
        this.degrees = degrees;
    }

    public String getDegrees()
    {
        return degrees;
    }
}