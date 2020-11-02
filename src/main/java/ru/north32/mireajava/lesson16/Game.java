package ru.north32.mireajava.lesson16;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {

    public static class Card implements Comparable<Card> {

        private int value;

        public Card(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(Card o) {
            if (value == 0 && o.value == 9) {
                return 1;
            }
            if (value == 9 && o.value == 0) {
                return -1;
            }
            return value - o.value;
        }
    }

    public static class Result {

        private String winner;
        private int moves;
        private boolean draw;

        private Result(String winner, int moves, boolean draw) {
            this.winner = winner;
            this.moves = moves;
            this.draw = draw;
        }

        public static Result win(String winner, int moves) {
            return new Result(winner, moves, false);
        }

        public static Result draw() {
            return new Result(null, 0, true);
        }

        public String getWinner() {
            return winner;
        }

        public int getMoves() {
            return moves;
        }

        public boolean isDraw() {
            return draw;
        }
    }

    private Deque<Card> deck1;
    private Deque<Card> deck2;

    public Game(Deque<Card> deck1, Deque<Card> deck2) {
        this.deck1 = deck1;
        this.deck2 = deck2;
    }

    public Result getResult() {
        int moves = 0;
        while (!deck1.isEmpty() && !deck2.isEmpty() && moves <= 105) {
            move();
            moves += 1;
        }

        if (deck1.isEmpty()) {
            return Result.win("Second", moves);
        }
        if (deck2.isEmpty()){
            return Result.win("First", moves);
        }
        return Result.draw();
    }

    public void move() {
        Card card1 = deck1.pollFirst();
        Card card2 = deck2.pollFirst();
        if (card1 != null && card2 != null) {
            if (card1.compareTo(card2) > 0) {
                deck1.addLast(card1);
                deck1.addLast(card2);
            } else {
                deck2.addLast(card1);
                deck2.addLast(card2);
            }
        }
    }

    public static void main(String[] args) {
        Deque<Card> deck1 = new LinkedList<>();
        Deque<Card> deck2 = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            deck1.add(new Card(scanner.nextInt()));
        }
        for (int i = 0; i < 5; i++) {
            deck2.add(new Card(scanner.nextInt()));
        }
        Result result = new Game(deck1, deck2).getResult();
        if (result.isDraw()) {
            System.out.println("Result is Botva!");
        } else {
            System.out.println("Win of "
                    + result.getWinner()
                    + " in "
                    + result.getMoves()
                    + " moves!");
        }
    }

}
