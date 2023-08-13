package J110_2_1;

public class MainClass {

          public static void main(String[] args) {

              // Создание массива с информацией о персонах

              Persons[] persons = {
                    new Teachers("Ronald Turner", Gender.MALE, "Computer science",
                            Degrees.PHD, "Programming paradigms"),
                    new Teachers("Ruth Hollings", Gender.MALE, "Jurisprudence",
                            Degrees.DOCTOR, "Domestic arbitration"),
                    new Bachelors("Leo Wilkinson", Gender.MALE, "Computer science",
                            Education.BACHELOR, 1),
                    new Bachelors("Anna Cunningham", Gender.FEMALE, "World economy",
                            Education.BACHELOR, 1),
                    new Bachelors("Jill Lundqvist", Gender.FEMALE, "Jurisprudence",
                            Education.MASTER, 1),
                    new Masters("Ronald Correa", Gender.MALE, "Computer science",
                            "Design of a functional programming language.")
            };

            // Вывод информации о персонах из массива

            Persons.printAll(persons);

        }
    }