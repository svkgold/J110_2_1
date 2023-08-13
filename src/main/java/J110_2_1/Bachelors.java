package J110_2_1;

public class Bachelors extends Students {
    private Education stage;
    private int year;

    // Конструктор
    public Bachelors (String name, Gender gender, String department, Education stage, int year) {
        super(name, gender, department);
        setStage(stage);
        setYear(year);
    }

    // Геттер года обучения
    public int getYear()
    {
        return year;
    }

    // Сеттер года обучения с проверкой
    public void setYear(int year)
    {
        if (year == 0)
            throw new IllegalArgumentException("Year can not be null");
        this.year = year;
    }

    // Геттер степени обучения
    public Education getStage()
    {
        return stage;
    }

    // Сеттер степени обучения с проверкой
    public void setStage
    (Education stage) {
        if (stage == null)
            throw new IllegalArgumentException("Education level can not be null");
        this.stage = stage;
    }

    @Override
    public String getInfo() {
        return getGender().getPronoun() + " is " + getYear() + " year " + getStage() + " student.";
    }
}