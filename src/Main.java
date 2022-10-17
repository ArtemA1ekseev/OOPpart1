import homework1.Car;
import homework1.Human;

public class Main {
    public static void main(String[] args) {
        // Задание 1.
        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.town = "Минск";
        maksim.yearOfBirth = 1987;
        // Задание 2.
        maksim.job = "бренд-менеджер";

        // Задание 1.
        Human anna = new Human();
        anna.name = "Аня";
        anna.town = "Москва";
        anna.yearOfBirth = 1993;
        // Задание 2.
        anna.job = "методист образовательных программ";

        // Задание 1.
        Human katya = new Human();
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.yearOfBirth = 1994;
        // Задание 2.
        katya.job = "продакт-менеджер";

        // Задание 1.
        Human artem = new Human();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirth = 1995;
        // Задание 2.
        artem.job = "директор по развитию бизнеса";

        // Задание 1 и 2.
        System.out.println("Привет! Меня зовут " + maksim.name + ". Я из города " + maksim.town + ". Я родился в " + maksim.yearOfBirth + " году. Я работаю на должности " + maksim.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anna.name + ". Я из города " + anna.town + ". Я родился в " + anna.yearOfBirth + " году. Я работаю на должности " + anna.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.town + ". Я родился в " + katya.yearOfBirth + " году. Я работаю на должности " + katya.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.town + ". Я родился в " + artem.yearOfBirth + " году. Я работаю на должности " + artem.job + ". Будем знакомы!");

        System.out.println(" ");

        // Задание 3.
        Car ladaGranta = new Car();
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.productionYear = 2015;
        ladaGranta.productionCountry = "России";
        ladaGranta.color = "Желтый";
        ladaGranta.engineVolume = 1.7;
        System.out.println("Бренд автомобиля — " + ladaGranta.brand + ", модель — " + ladaGranta.model + ", сборка в " + ladaGranta.productionCountry + ", цвет кузова — " + ladaGranta.color + ", объем двигателя — " + ladaGranta.engineVolume + " л, год выпуска — " + ladaGranta.productionYear + ".");

        // Задание 3.
        Car audiA8 = new Car();
        audiA8.brand = "Audi";
        audiA8.model = "A8 50 L TDI quattro";
        audiA8.productionYear = 2020;
        audiA8.productionCountry = "Германии";
        audiA8.color = "черный";
        audiA8.engineVolume = 3.0;
        System.out.println("Бренд автомобиля — " + audiA8.brand + ", модель — " + audiA8.model + ", сборка в " + audiA8.productionCountry + ", цвет кузова — " + audiA8.color + ", объем двигателя — " + audiA8.engineVolume + " л, год выпуска — " + audiA8.productionYear + ".");

        // Задание 3.
        Car bmwZ8 = new Car();
        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.productionYear = 2021;
        bmwZ8.productionCountry = "Германии";
        bmwZ8.color = "черный";
        bmwZ8.engineVolume = 3.0;
        System.out.println("Бренд автомобиля — " + bmwZ8.brand + ", модель — " + bmwZ8.model + ", сборка в " + bmwZ8.productionCountry + ", цвет кузова — " + bmwZ8.color + ", объем двигателя — " + bmwZ8.engineVolume + " л, год выпуска — " + bmwZ8.productionYear + ".");

        // Задание 3.
        Car kiaSportage = new Car();
        kiaSportage.brand = "Kia";
        kiaSportage.model = "Sportage 4-го поколения";
        kiaSportage.productionYear = 2018;
        kiaSportage.productionCountry = "Южной Корее";
        kiaSportage.color = "красный";
        kiaSportage.engineVolume = 2.4;
        System.out.println("Бренд автомобиля — " + kiaSportage.brand + ", модель — " + kiaSportage.model + ", сборка в " + kiaSportage.productionCountry + ", цвет кузова — " + kiaSportage.color + ", объем двигателя — " + kiaSportage.engineVolume + " л, год выпуска — " + kiaSportage.productionYear + ".");

        // Задание 3.
        Car hyundaiAvante = new Car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.productionYear = 2016;
        hyundaiAvante.productionCountry = "Южной Корее";
        hyundaiAvante.color = "оранжевый";
        hyundaiAvante.engineVolume = 1.6;
        System.out.println("Бренд автомобиля — " + hyundaiAvante.brand + ", модель — " + hyundaiAvante.model + ", сборка в " + hyundaiAvante.productionCountry + ", цвет кузова — " + hyundaiAvante.color + ", объем двигателя — " + hyundaiAvante.engineVolume + " л, год выпуска — " + hyundaiAvante.productionYear + ".");
    }
}