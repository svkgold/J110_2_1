package J110_2_1;

public enum Gender {

    MALE("He", "His"),
    FEMALE("She", "Her");

    // Поле для He, She
    private String pronoun;

    // Поле для His, Her
    private String possessive;

    // Конструктор  He, His, She, Her
    Gender(String pronoun, String possessive) {
        this.pronoun = pronoun;
        this.possessive = possessive;
    }

    // Геттеры для полей He, His, She, Her
    public String getPronoun() {
        return pronoun;
    }

    public String getPossessive() {
        return possessive;
    }
}