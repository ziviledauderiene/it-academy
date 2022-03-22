package com.itacademy.collections.Taskfinal;

import java.util.List;

public class Game {
    private String title;
    private Genre genre;
    private double price;
    private int copiesSold;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    public Game(String title, Genre genre, double price, int copiesSold) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.copiesSold = copiesSold;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                ", copiesSold=" + copiesSold +
                '}';
    }

    public void print(List<Game> games) {
        for (Game game : games) {
            System.out.println("name: " + game.getTitle());
        }
    }

    public void incrementPrice(int increment) {
        price += increment;
    }
}
