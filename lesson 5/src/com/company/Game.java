package com.company;

public enum Game {
    WINTER_GAME("снежки"),
    SPRING_GAME("запуск корабликов по ручьям"),
    SUMMER_GAME("собирание и поедание ягод"),
    AUTUMN_GAME("измерение глубины луж методом \"сапога\"");

    private String gameName;

    Game(String gameName) {
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }
}