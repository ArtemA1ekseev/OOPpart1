package homework1;

public class Human {
    public int yearOfBirth;
    public String name;
    public String town;
    public String job;

    // Задание 1.

    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth < 0){
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }

    }
}
