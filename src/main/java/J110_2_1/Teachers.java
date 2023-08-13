package J110_2_1;

public class Teachers extends Persons {

    private Degrees degrees;
    private String specialty;

    // Конструктор
    public Teachers (String name, Gender gender, String department, Degrees degrees, String specialty) {
        super(name, gender, department, "teaches");
        setSpecialty(specialty);
        setDegrees(degrees);
    }

    // Геттер специальности
    public String getSpecialty()
    {
        return specialty;
    }

    // Геттер специальности с проверкой
    public void setSpecialty(String specialty)
    {
        if(specialty == null)
            throw new IllegalArgumentException
                    ("Specialty can not be null");
        this.specialty = specialty;
    }

    // Геттер ученой степени
    public Degrees getDegrees()
    {
        return degrees;
    }

    // Сеттер ученой степени с проверкой
    public void setDegrees (Degrees degrees)
    {
        if(degrees == null)
            throw new IllegalArgumentException
                    ("Degree can not be null");
        this.degrees = degrees;
    }

    @Override
    public String getInfo() {
        return getGender().getPronoun() + " has " + getDegrees() + " degree in " + getSpecialty();
    }
}