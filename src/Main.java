import homework1.Car;
import homework1.Human;

public class Main {
    public static void main(String[] args) {
        // Задание 1.
        Human maksim = new Human(1987, "Максим", "Минск", "бренд-менеджер");

        // Задание 1.
        Human anna = new Human(1993, "Аня", "Москва", "методист образовательных программ");

        // Задание 1.
        Human katya = new Human(1994, "Катя", "Калининград", "продакт-менеджер");

        // Задание 1.
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");

        // Задание 1
        System.out.println("Привет! Меня зовут " + maksim.name + ". Я из города " + maksim.town + ". Я родился в " + maksim.yearOfBirth + " году. Я работаю на должности " + maksim.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anna.name + ". Я из города " + anna.town + ". Я родился в " + anna.yearOfBirth + " году. Я работаю на должности " + anna.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.town + ". Я родился в " + katya.yearOfBirth + " году. Я работаю на должности " + katya.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.town + ". Я родился в " + artem.yearOfBirth + " году. Я работаю на должности " + artem.job + ". Будем знакомы!");

        System.out.println(" ");

        // Задание 2.
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "желтый", 2015, "России");
        System.out.println("Бренд автомобиля — " + ladaGranta.brand + ", модель — " + ladaGranta.model + ", сборка в " + ladaGranta.productionCountry + ", цвет кузова — " + ladaGranta.color + ", объем двигателя — " + ladaGranta.engineVolume + " л, год выпуска — " + ladaGranta.productionYear + ".");

        // Задание 2.
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германии");
        System.out.println("Бренд автомобиля — " + audiA8.brand + ", модель — " + audiA8.model + ", сборка в " + audiA8.productionCountry + ", цвет кузова — " + audiA8.color + ", объем двигателя — " + audiA8.engineVolume + " л, год выпуска — " + audiA8.productionYear + ".");

        // Задание 2.
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германии");
        System.out.println("Бренд автомобиля — " + bmwZ8.brand + ", модель — " + bmwZ8.model + ", сборка в " + bmwZ8.productionCountry + ", цвет кузова — " + bmwZ8.color + ", объем двигателя — " + bmwZ8.engineVolume + " л, год выпуска — " + bmwZ8.productionYear + ".");

        // Задание 2.
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4,"красный", 2018,"Южной Корее");
        System.out.println("Бренд автомобиля — " + kiaSportage.brand + ", модель — " + kiaSportage.model + ", сборка в " + kiaSportage.productionCountry + ", цвет кузова — " + kiaSportage.color + ", объем двигателя — " + kiaSportage.engineVolume + " л, год выпуска — " + kiaSportage.productionYear + ".");

        // Задание 2.
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южной Корее");
        System.out.println("Бренд автомобиля — " + hyundaiAvante.brand + ", модель — " + hyundaiAvante.model + ", сборка в " + hyundaiAvante.productionCountry + ", цвет кузова — " + hyundaiAvante.color + ", объем двигателя — " + hyundaiAvante.engineVolume + " л, год выпуска — " + hyundaiAvante.productionYear + ".");
    }
}