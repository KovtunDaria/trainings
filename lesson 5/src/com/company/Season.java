package com.company;

public enum Season {
    WINTER(Game.WINTER_GAME),
    SPRING(Game.SPRING_GAME),
    SUMMER(Game.SUMMER_GAME),
    AUTUMN(Game.AUTUMN_GAME);

    private Game game;

    Season(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }
}

