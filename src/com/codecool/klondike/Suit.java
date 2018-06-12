package com.codecool.klondike;

public enum Suit {
    HEARTS("hearts"), SPADES("spades"), DIAMONDS("diamonds"), CLUBS("clubs");

    private final String name;

    Suit(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
