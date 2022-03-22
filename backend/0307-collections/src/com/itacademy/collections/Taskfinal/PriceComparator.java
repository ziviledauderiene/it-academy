package com.itacademy.collections.Taskfinal;

import java.util.Comparator;

public class PriceComparator implements Comparator<Game> {

    @Override
    public int compare(Game o1, Game o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
