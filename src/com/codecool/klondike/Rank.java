package com.codecool.klondike;

public enum Rank {
    TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), JUMBO("11"), QUEEN("12"), KING("13"), ACE("1");

    private final String name;

    Rank(String str) {
        this.name = str;
    }

    public String toString() {
        return name;
    }

    public static boolean isNextRank(Card card1, Card card2) {
        int rankOfCard1 = Integer.getInteger(card1.getRank().toString());
        int rankOfCard2 = Integer.getInteger(card2.getRank().toString());
        return (rankOfCard2 - rankOfCard1 == 1);
    }
}