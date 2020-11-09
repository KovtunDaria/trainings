package com.company;

import java.util.Random;

//2. Сезонные радости
//Создайте enum Season с 4 временами года.
//Создайте enum Games с 4 играми.
//
//В каждое время года можно играть ровно в одну игру:
//Зима - снежки
//Весна - запуск корабликов по ручьям
//Лето - собирание и поедание ягод
//Осень - измерение глубины луж методом "сапога"
//
//Создайте класс Person. У него есть имя и любимый сезон.
//Создайте массив на 10 элементов с людьми со случайными именами и любимыми сезонами.
//
//Для каждого человека выведите любимую игру.
//
//Рекомендации:
//в Season определите дополнительное поле - игра для сезона.
public class SeasonGameMain {
    public static void main(String[] args) {
        Random random = new Random();
        String[] personNames = new String[]{"Анна", "Банна", "Ванна", "Ганна", "Данна", "Енна", "Ённа", "Жанна", "Занна", "Инна", "Канна", "Ланна"};
        Season[] seasons = Season.values();
        Person[] people = new Person[10];
        for (int i = 0; i < people.length; i++) {
            int indexName = random.nextInt(personNames.length);
            int indexSeason = random.nextInt(seasons.length);
            people[i] = new Person(personNames[indexName], seasons[indexSeason]);
        }
        for (Person person : people) {
            String favouriteGame = person.getFavouriteSeason().getGame().getGameName();
            System.out.println(person.getName() + ", " + favouriteGame);
        }
    }
}
