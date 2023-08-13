package J110_2_1;

public abstract class Persons {

    private String name;
    private String department;
    private Gender gender;
    private final String verb;

    // Конструктор
    public Persons (String name, Gender gender, String department, String verb) {
        setName(name);
        setGender(gender);
        setDepartment(department);
        this.verb = verb;
    }

    // Геттер для имени
    public String getName()
    {
        return name;
    }

    // Сеттер для имени с проверкой
    public void setName(String name)
    {
        if(name == null)
            throw new IllegalArgumentException("Person name can not be null");
        this.name = name;
    }

    // Геттер для пола
    public Gender getGender()
    {
        return gender;
    }

    // Сеттер для пола и проверка
    public void setGender(Gender gender)
    {
        if(gender == null)
            throw new IllegalArgumentException("Gender name can not be null");
        this.gender = gender;
    }

    // Геттер для названия факультета

    public String getDepartment()
    {
        return department;
    }

    // Сеттер для названия факультета с проверкой
    public void setDepartment(String department)
    {
        if(department == null)
            throw new IllegalArgumentException("Department name can not be null");
        this.department = department;
    }

    public abstract String getInfo();

       public static void printAll (Persons[] persons) {
           for (Persons person : persons) {
               person.print();
               System.out.println();
           }
       }
       public void print() {

               System.out.println("This is " + name + ". "
                       + gender.getPronoun() + " " + verb + " in " + department);

               System.out.println(getInfo());
           }
    }