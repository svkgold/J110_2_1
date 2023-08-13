package J110_2_1;

public class Masters extends Students {

    private String  dissertationTopic;

    // Конструктор

    public Masters (String name, Gender gender, String department, String  dissertationTopic)
    {
        super (name, gender, department);
        setDissertationTopic (dissertationTopic);
    }

    // Геттер для темы диссертации
    public String getDissertationTopic()
    {
        return dissertationTopic;
    }

    // Сеттер для темы диссертации с проверкой
    public void setDissertationTopic(String dissertationTopic) {
        if(dissertationTopic == null)
            throw new IllegalArgumentException("Dissertation topic can not be null");
        this.dissertationTopic = dissertationTopic;
    }

    @Override
    public String getInfo()
    {
        return getGender().getPossessive() + " thesis title is " + getDissertationTopic();
    }
}