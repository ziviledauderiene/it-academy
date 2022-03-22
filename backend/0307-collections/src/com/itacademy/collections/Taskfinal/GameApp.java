package com.itacademy.collections.Taskfinal;

import java.util.*;

public class GameApp {
    public static void main(String[] args) {
        Game game1 = new Game("Sims", Genre.SIMULATION, 5, 20);
        Game game2 = new Game("Sims2", Genre.SIMULATION, 2, 50);
        Game game3 = new Game("Sims3", Genre.SIMULATION, 1, 70);
        Game game4 = new Game("Sims4", Genre.SIMULATION, 40, 90);

        List<Game> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);


        for (Game game : games) {
            System.out.println(game);
        }

//        games.remove(1);
//
//        game1.print(games);
//
//        Collections.sort(games, new PriceComparator());
//
//        for (Game game: games) {
//            System.out.println(game);
//        }
//
//        Collections.sort(games, new PriceComparator().reversed());
//
//        for (Game game: games) {
//            System.out.println(game);
//        }

        games.stream().forEach(game -> game.incrementPrice(6));

        for (Game game : games) {
            System.out.println(game);
        }

        List<Game> biggerThan10 = games.stream().filter(game -> game.getPrice() > 10).toList();
        System.out.println(biggerThan10);

        List<Game> sorted = games.stream().sorted(Comparator.comparingInt(Game::getCopiesSold)).toList();
        System.out.println(sorted);

        Optional<Game> minCopiesSold = games.stream().min(Comparator.comparingInt(Game::getCopiesSold));
        System.out.println("min copies sold: " + minCopiesSold);
        Optional<Game> maxCopiesSold = games.stream().max(Comparator.comparingInt(Game::getCopiesSold));
        System.out.println("max copies sold: " + maxCopiesSold);
    }
}
